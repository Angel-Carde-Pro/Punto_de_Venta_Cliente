package controlador;

import javax.swing.JOptionPane;
import vistas.*;
import ws.Peticiones;
import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Register {

    Peticiones_Service servicio = new Peticiones_Service();
    Peticiones app = servicio.getPeticionesPort();
    private Register_View register_View;
    int idRol = 1;
    int idUsuario = 1; // Debes implementar tu propia lógica para obtener el próximo ID
    int idPersona = 1;

    public Controller_Register(Register_View register_View) {
        this.register_View = register_View;
    }

    public void IniciarControl() {
        register_View.setTitle("Registro");
        register_View.setVisible(true);
        register_View.setLocationRelativeTo(null);
        register_View.getBtnVolver().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverBtn();
            }
        });
        register_View.getBtnRegistrar().addActionListener(l -> RegistrarseBtn());
    }

    public void RegistrarseBtn() {
        
        try {
            
        
        // Obtener los datos del usuario
        int idUsuario = obtenerProximoIdUsuario(); // Debes implementar tu propia lógica para obtener el próximo ID
        int idPersona = obtenerProximoIdPersona(); // Debes implementar tu propia lógica para obtener el próximo ID
        String nombreUsuario = register_View.getTxtnombre().getText();
        String contraseña = register_View.getTxtpassword().getText();
        String nombrePersona = register_View.getTxtnombre().getText();
        String apellidoPersona = register_View.getTxtapellido().getText();
        String dniPersona = register_View.getTxtCedula().getText();
        String celularPersona = register_View.getTxtNTelefono().getText();
        String correoPersona = register_View.getTxtemail().getText();

        // Otros datos de la persona...
        idRol = obtenerProximoIdRol(); // Debes implementar tu propia lógica para obtener el próximo ID
        String nombreRol = register_View.getjComboBox1().getSelectedItem().toString();
        boolean estadoRol = true;
        boolean registro = app.registrarUsuarioPersonaRol(1, 1, nombreUsuario, contraseña, nombrePersona, apellidoPersona, dniPersona, celularPersona, correoPersona, 1, nombreRol, true);
        if (registro) {
            JOptionPane.showMessageDialog(register_View, "Registro correcto");
        } else {
            JOptionPane.showMessageDialog(register_View, "Registro incorrecto");

        }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(register_View, e);
        }
        
    }

    public int obtenerProximoIdUsuario() {
        idUsuario = idUsuario + 1;

        return idUsuario;
    }

    public int obtenerProximoIdPersona() {
        idPersona = idPersona + 1;

        return idPersona;
    }

    public int obtenerProximoIdRol() {
        idRol = idRol + 1;
        return idRol;
    }

    public void VolverBtn() {
        register_View.dispose();
        Login_View vl = new Login_View();
        Controller_Login ctl = new Controller_Login(vl);
        ctl.IniciarControl();
    }
}
