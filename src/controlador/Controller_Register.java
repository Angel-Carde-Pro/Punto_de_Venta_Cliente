package controlador;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vistas.*;
import ws.Peticiones;
import ws.Rol;

import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Register {

    Peticiones_Service servicio = new Peticiones_Service();
    Peticiones app = servicio.getPeticionesPort();
    private Register_View register_View;
    int idRol = app.listarroles().size();
    int idUsuario = app.listarUsuarios().size();; // Debes implementar tu propia lógica para obtener el próximo ID
    int idPersona = app.listarPersonas().size();

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
        register_View.getTxtnombre().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char caracter = evt.getKeyChar();

                if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE) {
                    evt.consume();
                }
            }
        });
        register_View.getTxtapellido().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char caracter = evt.getKeyChar();

                if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_BACK_SPACE) {
                    evt.consume();
                }
            }
        });
        register_View.getTxtCedula().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char caracter = evt.getKeyChar();
                // Solo permitir números y el backspace
                if (!Character.isDigit(caracter) && caracter != KeyEvent.VK_BACK_SPACE) {
                    evt.consume();
                }
            }
        });
        register_View.getTxtDirreccion().addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        // Solo permitir números y el backspace
        if (!Character.isDigit(caracter) && caracter != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }
});


        llenarComboBoxRoles();
        register_View.getBtnRegistrar().addActionListener(l -> RegistrarseBtn());

    }

    private void llenarComboBoxRoles() {
       
        List<Rol> roles = app.listarroles();

        
        register_View.getjComboBox1().removeAllItems();

     
        for (Rol rol : roles) {
            register_View.getjComboBox1().addItem(rol.getRol());
        }
    }

    public void RegistrarseBtn() {
        // Obtener los datos del usuario
        int idUsuario = obtenerProximoIdUsuario(); 
        int idPersona = obtenerProximoIdPersona(); 
        String nombreUsuario = register_View.getTxtusuario().getText();
        String contraseña = new String(register_View.getTxtpassword().getText());
        String nombrePersona = register_View.getTxtnombre().getText();
        String apellidoPersona = register_View.getTxtapellido().getText();
        String dniPersona = register_View.getTxtCedula().getText();
        String celularPersona = register_View.getTxtDirreccion().getText();
        String correoPersona = register_View.getTxtNTelefono().getText();
//        // Validar nombre y apellido (solo letras)
//        if (!esCadenaValida(nombrePersona) || !esCadenaValida(apellidoPersona)) {
//            JOptionPane.showMessageDialog(null, "Nombre y apellido deben contener solo letras.");
//            return;
//        }
//
//        // Validar cédula (solo números)
//        if (!esNumeroValido(dniPersona)) {
//            JOptionPane.showMessageDialog(null, "La cédula debe contener solo números.");
//            return;
//        }
//
//        // Validar teléfono (10 dígitos)
//        if (!esTelefonoValido(celularPersona)) {
//            JOptionPane.showMessageDialog(null, "El teléfono debe contener 10 dígitos.");
//            return;
//        }
//
//        // Validar correo electrónico
//        if (!esCorreoValido(correoPersona)) {
//            JOptionPane.showMessageDialog(null, "Correo electrónico no válido.");
//            return;
//        }

        int idRol = obtenerIdRolSeleccionado();
        String nombreRol = register_View.getjComboBox1().getSelectedItem().toString();
        boolean estadoRol = true;
        System.out.println(idUsuario+" idUsuario");
        System.out.println(idPersona+" idPersona");
        boolean registroExitoso = app.registrarUsuarioPersonaRol(idUsuario, idPersona, nombreUsuario, contraseña, nombrePersona, apellidoPersona, dniPersona, celularPersona, correoPersona, idRol, nombreRol, estadoRol);

        if (registroExitoso) {
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            register_View.dispose();
               Login_View login_View= new Login_View();
            Controller_Login login= new Controller_Login(login_View);
            login.IniciarControl();
        } else {
            JOptionPane.showMessageDialog(null, "Error en el registro. Por favor, revise sus datos.");
            // Limpiar campos de texto
            //limpiarCamposTexto();
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
    private int obtenerIdRolSeleccionado() {
    // Obtener el ID del rol seleccionado en el JComboBox
    String nombreRol = register_View.getjComboBox1().getSelectedItem().toString();
    for (Rol rol : app.listarroles()) {
        if (rol.getRol().equals(nombreRol)) {
            return rol.getIdRol();
        }
    }
    return -1; // Si no se encuentra el rol, devolver -1
}

    public void VolverBtn() {
        register_View.dispose();;
        Login_View vl = new Login_View();
        Controller_Login ctl = new Controller_Login(vl);
        ctl.IniciarControl();
    }

    private void limpiarCamposTexto() {
        register_View.getTxtnombre().setText("");
        register_View.getTxtpassword().setText("");
        register_View.getTxtnombre().setText("");
        register_View.getTxtapellido().setText("");
        register_View.getTxtCedula().setText("");
        register_View.getTxtNTelefono().setText("");
        register_View.getTxtemail().setText("");
    }
    
    public static boolean esCorreoValido(String correo) {
        // Utiliza una expresión regular para validar el formato del correo electrónico
        String regexCorreo = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        return correo.matches(regexCorreo);
    }

    public static boolean esTelefonoValido(String telefono) {
        // Utiliza una expresión regular para validar que el teléfono tenga 10 dígitos
        String regexTelefono = "\\d{10}";
        return telefono.matches(regexTelefono);
    }

    public static boolean esNumeroValido(String numero) {
        // Utiliza una expresión regular para validar que la cadena contenga solo números
        String regexNumero = "\\d+";
        return numero.matches(regexNumero);
    }

    public static boolean esCadenaValida(String cadena) {
        // Utiliza una expresión regular para validar que la cadena contenga solo letras
        String regexLetras = "^[a-zA-Z]+$";
        return cadena.matches(regexLetras);
    }
}
