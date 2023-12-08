package controlador;

import javax.swing.JOptionPane;
import vistas.*;
import ws.Peticiones;
import ws.Peticiones_Service;
import ws.Proveedores;

/**
 *
 * @author angel
 */
    public class Controller_Add_Prod {

    Peticiones_Service service = new Peticiones_Service();
    Peticiones cliente = service.getPeticionesPort();

    private Productos_Dialog productos_Dialog;
    private int id_producto, stock;
    private double precio_unitario;
    private String unidad;
    private int proveedor;
    private int clasificacion;
    private boolean iva;

    public Controller_Add_Prod(Productos_Dialog productos_Dialog) {
        this.productos_Dialog = productos_Dialog;
    }

    public void IniciarControl() {
        productos_Dialog.setTitle("Agregar nuevo producto");
        productos_Dialog.setVisible(true);
        productos_Dialog.setLocationRelativeTo(null);

        productos_Dialog.getBtnGuardar().addActionListener(l -> CrearProducto());
        LimpiarDatos();

//        Proveedores prov = cliente.listarProveedores();
//        for (Personal listPC : listaDePCuidadores) {
//
//        }
        productos_Dialog.getjComboBoxProveedor().addItem("");
//        for (Personal listPC : listaDePCuidadores) {
//            //---> Añadir las opciones de los cuidadores
//            jCBoxCuidador.addItem("ID: " + listPC.getId_Personal() + " - Nombre: " + listPC.getNombre());
//        }
    }

    public void CrearProducto() {
        ValidarDatos();
        if (cliente.crearProducto(id_producto, stock, precio_unitario, unidad, null, null, iva, unidad)) {
            JOptionPane.showMessageDialog(productos_Dialog, "Registro Exitoso!\n Desea crear otro producto?");
            int respuesta = JOptionPane.showConfirmDialog(null, "Desea crear otro producto?",
                    "Registro Exitoso!", JOptionPane.YES_NO_OPTION);
            if (respuesta == 1) {
                productos_Dialog.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(productos_Dialog, "Por favor, ingese todos los datos o verifique la integridad de los mismos.");
        }
    }

    public void ValidarDatos() {
        id_producto = Integer.parseInt(productos_Dialog.getLbl_id().getText());
        stock = Integer.parseInt(productos_Dialog.getjSpinnerStock().getValue().toString());
        precio_unitario = Double.parseDouble(productos_Dialog.getjSpinnerprecioU().getValue().toString());
        unidad = productos_Dialog.getTxtUnidad().getText();
        iva = (productos_Dialog.getjComboBoxIVA().getSelectedItem().toString().contains("Tiene IVA"));

        if (productos_Dialog.getTxtUnidad().getText().isEmpty()) {
            JOptionPane.showMessageDialog(productos_Dialog, "Ingrese un nombre para el producto");
            return;
        }
    }

    public void LimpiarDatos() {
        productos_Dialog.getLbl_id().setText("");
        productos_Dialog.getjSpinnerStock().setValue(1);
        productos_Dialog.getjSpinnerprecioU().setValue(1);
        productos_Dialog.getTxtUnidad().setText("");

        productos_Dialog.getjComboBoxClasificacion().removeAllItems();
        productos_Dialog.getjComboBoxProveedor().removeAllItems();
    }
}