/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import vistas.RFacturas_view;
import vistas.RevisionProductos_Voew;
import ws.Clasificacion;
import ws.ItemFactura;
import ws.Peticiones;
import ws.Peticiones_Service;
import ws.Producto;
import ws.Proveedores;

/**
 *
 * @author joelu
 */
public class Controller_RFactura {

    int factura = 0;
    int producto = 0;
    int item = 0;
    RFacturas_view Rfactura_view;
    RevisionProductos_Voew vision = new RevisionProductos_Voew();

    Peticiones_Service service = new Peticiones_Service();
    Peticiones peti = service.getPeticionesPort();

    public Controller_RFactura(RFacturas_view Rfactura_view) {
        this.Rfactura_view = Rfactura_view;
    }

    public void iniciarcontrol() {
        Rfactura_view.setTitle("Registro Factura");
        Rfactura_view.setVisible(true);
        Rfactura_view.setLocationRelativeTo(null);

        Rfactura_view.getBtnbuscarproducto().addActionListener(l -> buscarprod());
        Rfactura_view.getBtnbuscarpersona().addActionListener(l -> buscarruc());
        Rfactura_view.getBtnRegistrar().addActionListener(l -> registrar());
        Rfactura_view.getTxtdescuento().setText("0.00");

    }

    public void registrar() {
        factura = factura + 1;
        String ruc = Rfactura_view.getTxtruc().getText();
        int idpersona = Integer.valueOf(Rfactura_view.getJlabelidpersona().getText());
        Date selecteddate = Rfactura_view.getjDateChooser1().getDate();
        String dateString = "";

        if (selecteddate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dateString = sdf.format(selecteddate);
        } else {
            JOptionPane.showMessageDialog(Rfactura_view, "Elige una fecha correcta");
            return; // Exit the method if no date is selected
        }

        double descuento = Double.parseDouble(Rfactura_view.getTxtdescuento().getText());
        double total = Double.parseDouble(Rfactura_view.getJlabeltotal().getText());

        // Get the table model
        DefaultTableModel tableModel = (DefaultTableModel) Rfactura_view.getTblPROD().getModel();

        // Create a list to store items
        ArrayList<ItemFactura> itemsFactura = new ArrayList<>();

        // Iterate over the rows of the table
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            int idProducto = Integer.parseInt(tableModel.getValueAt(i, 0).toString()); // Assuming the ID is in the first column
            int cantidad = Integer.parseInt(tableModel.getValueAt(i, 4).toString()); // Assuming the quantity is in the fifth column
            double subtotal = Double.parseDouble(tableModel.getValueAt(i, 5).toString()); // Assuming the subtotal is in the sixth column

            // Create an ItemFactura object for each row
            ItemFactura itemFactura = new ItemFactura();
            itemFactura.setIdItemFactura(item);
            itemFactura.setIdFcatura(factura);
            itemFactura.setIdProducto(idProducto);
            itemFactura.setCantidad(cantidad);
            itemFactura.setSubtotal(subtotal);

            // Add the ItemFactura object to the list
            itemsFactura.add(itemFactura);
        }

        // Call the service method to register the factura with items
        peti.registrarFacturaConItems(factura, ruc, idpersona, dateString, 1, descuento, total, itemsFactura);
    }

    public void buscarruc() {
        String ruc = Rfactura_view.getTxtruc().getText();

        int idpersona = peti.buscarP(ruc);
        Rfactura_view.getJlabelidpersona().setText(String.valueOf(idpersona));
    }

    public void buscarprod() {
        String id = Rfactura_view.getTxtidproducto().getText();
        try {

            Producto producto = peti.buscarProductoPorId(Integer.parseInt(id));
            Clasificacion clasificacion = producto.getIdClasificacion();
            Proveedores proveedor = producto.getIdProveedor();
            iniciarcontrolrevision(id, producto, clasificacion, proveedor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Rfactura_view, "Coloque correctamente los datos");
        }
    }

    public void iniciarcontrolrevision(String id, Producto producto, Clasificacion clasificacion, Proveedores proveedor) {
        vision.setTitle("Revision");
        vision.setVisible(true);
        vision.setLocationRelativeTo(null);

        noeditable();
        vision.getJlabelidproducto().setText(id);
        vision.getJSpinnerStock().setValue(producto.getStock());
        vision.getTxtprecioU().setText(String.valueOf(producto.getPrecioUnitario()));
        vision.getTxtNombre().setText(producto.getUnidad());
        vision.getjComboCateg().addItem(clasificacion.getGrupo());
        vision.getjComboProveedor().addItem(proveedor.getRuc());
        vision.getjComboiva().addItem(String.valueOf(producto.isIva()));
        vision.getJSpinnercantidad().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("value".equals(evt.getPropertyName())) {
                    double sub = calcularsubtotal();
                    vision.getjLabelsubtotal().setText(String.valueOf(sub));
                }
            }
        });

        vision.getBtnRegistrar().addActionListener(l -> mostrarproductostabla());
        vision.getBtnVolver().addActionListener(l -> vision.dispose());
    }

    public void mostrarproductostabla() {
    try {
        double sub = calcularsubtotal();
        String id = vision.getJlabelidproducto().getText();
        String PrecioU = vision.getTxtprecioU().getText();
        int cantidad = (int) vision.getJSpinnercantidad().getValue();

        // Create an array to store the data for the new row
        Object[] data = {id, PrecioU, "SampleName", "SampleIVA", cantidad, sub};

        // Get the table model and add the new row
        DefaultTableModel modeloTabla = (DefaultTableModel) Rfactura_view.getTblPROD().getModel();
        modeloTabla.addRow(data);

        // Update the total
        double total = calcularTotal(modeloTabla);
        Rfactura_view.getJlabeltotal().setText(String.valueOf(total));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(Rfactura_view, e);
    }
}




    public double calcularTotal(DefaultTableModel modeloTabla) {
        double total = 0.0;
        int rowCount = modeloTabla.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            double subtotal = Double.parseDouble(modeloTabla.getValueAt(i, 5).toString());
            total += subtotal;
        }

        return total;
    }

    public double calcularsubtotal() {
        int cantidad = vision.getJSpinnercantidad().getValue();
        double preciou = Double.parseDouble(vision.getTxtprecioU().getText());

        double sub = cantidad * preciou;
        return sub;
    }

    public void noeditable() {
        vision.getJlabelidproducto().setEnabled(false);
        vision.getJSpinnerStock().setEnabled(false);
        vision.getTxtprecioU().setEditable(false);
        vision.getTxtNombre().setEditable(false);
        vision.getjComboCateg().setEditable(false);
        vision.getjComboProveedor().setEditable(false);
        vision.getjComboiva().setEditable(false);
    }

}
