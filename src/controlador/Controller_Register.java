package controlador;

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
    }

    public void RegistrarseBtn() {
        // Obtener los datos del usuario
        int idUsuario = obtenerProximoIdUsuario(); // Debes implementar tu propia lógica para obtener el próximo ID
        int idPersona = obtenerProximoIdPersona(); // Debes implementar tu propia lógica para obtener el próximo ID
        String nombreUsuario = register_View.getTxtnombre().getText();
        String contraseña = new String(register_View.getTxtpassword().getPassword());
        String nombrePersona = register_View.getTxtNombrePersona().getText();
        // Otros datos de la persona...
        int idRol = obtenerProximoIdRol(); // Debes implementar tu propia lógica para obtener el próximo ID
        String nombreRol = register_View.getTxtNombreRol().getText();
        boolean estadoRol = register_View.getCheckBoxEstadoRol().isSelected();
        app.registrarUsuarioPersonaRol(0, 0, nombreUsuario, passwordUsuario, nombrePersona, apellidoPersona, dniPersona, celularPersona, correoPersona, 0, nombreRol, true)
    }

    public void VolverBtn() {
        register_View.dispose();;
        Login_View vl = new Login_View();
        Controller_Login ctl = new Controller_Login(vl);
        ctl.IniciarControl();
    }
}
