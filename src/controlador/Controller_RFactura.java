///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controlador;
//
//import java.beans.PropertyChangeEvent;
//import java.beans.PropertyChangeListener;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import javax.swing.JOptionPane;
//import javax.swing.event.ChangeListener;
//import javax.swing.table.DefaultTableModel;
//import vistas.RFacturas_view;
//import vistas.RevisionProductos_Voew;
//import ws.Clasificacion;
//import ws.Peticiones;
//import ws.Peticiones_Service;
//import ws.Producto;
//import ws.Proveedores;
//
///**
// *
// * @author joelu
// */
//public class Controller_RFactura {
//    int factura = 0;
//    RFacturas_view Rfactura_view;
//    RevisionProductos_Voew vision = new RevisionProductos_Voew();
//
//    Peticiones_Service service = new Peticiones_Service();
//    Peticiones peti = service.getPeticionesPort();
//
//    public Controller_RFactura(RFacturas_view Rfactura_view) {
//        this.Rfactura_view = Rfactura_view;
//    }
//
//    public void iniciarcontrol() {
//        Rfactura_view.setTitle("Registro Factura");
//        Rfactura_view.setVisible(true);
//        Rfactura_view.setLocationRelativeTo(null);
//
//        Rfactura_view.getBtnbuscarproducto().addActionListener(l -> buscarprod());
//        Rfactura_view.getBtnbuscarpersona().addActionListener(l -> buscarruc());
//        Rfactura_view.getBtnRegistrar().addActionListener(l->registrar());
//        Rfactura_view.getTxtdescuento().setText("0.00");
//
//    }
//
//    public void registrar(){
//        factura = factura + 1;
//        String ruc = Rfactura_view.getTxtruc().getText();
//        int idpersona = Integer.valueOf(Rfactura_view.getJlabelidpersona().getText());
//        Date selecteddate = Rfactura_view.getjDateChooser1().getDate();
//        String dateString = "";
//        
//        if (selecteddate != null) {
//            // Convert the Date to a String using SimpleDateFormat
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // You can change the date format as needed
//             dateString = sdf.format(selecteddate);
//
//           
//        } else {
//            
//            JOptionPane.showMessageDialog(Rfactura_view, "Elige una fecha correcta");
//        }
//    
//        peti.registrarFacturaConItems(factura, ruc, idpersona, dateString, 0, Double.NaN, Double.NaN, itemsFactura);
//    }
//    public void buscarruc() {
//        String ruc = Rfactura_view.getTxtruc().getText();
//
//        int idpersona = peti.buscarP(ruc);
//        Rfactura_view.getJlabelidpersona().setText(String.valueOf(idpersona));
//    }
//
//    public void buscarprod() {
//        String id = Rfactura_view.getTxtidproducto().getText();
//        Producto producto = peti.buscarProductoPorId(Integer.parseInt(id));
//        Clasificacion clasificacion = producto.getIdClasificacion();
//        Proveedores proveedor = producto.getIdProveedor();
//        iniciarcontrolrevision(id, producto, clasificacion, proveedor);
//
//    }
//
//    public void iniciarcontrolrevision(String id, Producto producto, Clasificacion clasificacion, Proveedores proveedor) {
//        vision.setTitle("Revision");
//        vision.setVisible(true);
//        vision.setLocationRelativeTo(null);
//        
//        noeditable();
//        vision.getJlabelidproducto().setText(id);
//        vision.getJSpinnerStock().setValue(producto.getStock());
//        vision.getTxtprecioU().setText(String.valueOf(producto.getPrecioUnitario()));
//        vision.getTxtNombre().setText(producto.getUnidad());
//        vision.getjComboCateg().addItem(clasificacion.getGrupo());
//        vision.getjComboProveedor().addItem(proveedor.getRuc());
//        vision.getjComboiva().addItem(String.valueOf(producto.isIva()));
//        vision.getJSpinnercantidad().addPropertyChangeListener(new PropertyChangeListener() {
//            @Override
//            public void propertyChange(PropertyChangeEvent evt) {
//                if ("value".equals(evt.getPropertyName())) {
//                    double sub = calcularsubtotal();
//                    vision.getjLabelsubtotal().setText(String.valueOf(sub));
//                }
//            }
//        });
//        
//        
//        
//        vision.getBtnRegistrar().addActionListener(l -> mostrarproductostabla());
//        vision.getBtnVolver().addActionListener(l -> vision.dispose());
//    }
//
//    public void mostrarproductostabla() {
//        String id = vision.getJlabelidproducto().getText();
//        String PrecioU = vision.getTxtprecioU().getText();
//        String Unidad = vision.getTxtNombre().getText();
//        String iva = vision.getjComboiva().getSelectedItem().toString();
//        String cantidad = String.valueOf(vision.getJSpinnercantidad().getValue());
//        String sub = vision.getjLabelsubtotal().getText();
//       Object [] columnas = {"ID", "Precio U", "Unidad", "IVA", "Cantidad", "Subtotal"};
//       DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
//       Object[] data = {id,PrecioU,Unidad,iva,cantidad,sub };
//       modeloTabla.addRow(data);
//       Rfactura_view.getTblPROD().setModel(modeloTabla);
//       
//       
//        double total = calcularTotal(modeloTabla);
//        Rfactura_view.getJlabeltotal().setText(String.valueOf(total));
//}
//
//public double calcularTotal(DefaultTableModel modeloTabla) {
//    double total = 0.0;
//    int rowCount = modeloTabla.getRowCount();
//
//    for (int i = 0; i < rowCount; i++) {
//        double subtotal = Double.parseDouble(modeloTabla.getValueAt(i, 5).toString());
//        total += subtotal;
//    }
//
//    return total;
//}
//    public double calcularsubtotal(){
//        int cantidad = vision.getJSpinnercantidad().getValue();
//        double preciou = Double.parseDouble(vision.getTxtprecioU().getText());
//        
//        double sub = cantidad * preciou;
//        return sub;
//    }
//    public void noeditable() {
//        vision.getJlabelidproducto().setEnabled(false);
//        vision.getJSpinnerStock().setEnabled(false);
//        vision.getTxtprecioU().setEditable(false);
//        vision.getTxtNombre().setEditable(false);
//        vision.getjComboCateg().setEditable(false);
//        vision.getjComboProveedor().setEditable(false);
//        vision.getjComboiva().setEditable(false);
//    }
//
//}
