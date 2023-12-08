package controlador;

import Vistas.Login_View;
import Vistas.Register_View;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import ws.Peticiones;
import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Register {

    private Validaciones validaciones;

    Peticiones_Service servicio = new Peticiones_Service();
    Peticiones app = servicio.getPeticionesPort();
    private Register_View register_View;

    private ImageIcon showPassword = new ImageIcon("src\\Imagenes\\Login\\eye-open1.png"),
            dissmisPassword = new ImageIcon("src\\Imagenes\\Login\\eye-close.png");

    public Controller_Register(Register_View register_View) {
        this.register_View = register_View;
    }

    public void IniciarControl() {
        register_View.setTitle("Registro");
        register_View.setVisible(true);
        register_View.setLocationRelativeTo(null);

        register_View.getBtnVolver().addActionListener(l -> VolverBtn());

        register_View.getJlabelShowPassword().setIcon(EscalarImagen(showPassword, register_View.getJlabelShowPassword()));
        register_View.getJlabelDismissPassword().setIcon(EscalarImagen(dissmisPassword, register_View.getJlabelDismissPassword()));

        register_View.getJlabelDismissPassword().setVisible(false);
        ValidarTextField();
    }

    public ImageIcon EscalarImagen(ImageIcon imagenATransformar, JLabel tamañoPanel) {
        ImageIcon imagenEscalada = new ImageIcon(imagenATransformar.getImage().getScaledInstance(tamañoPanel.getWidth(),
                tamañoPanel.getHeight(), Image.SCALE_AREA_AVERAGING));
        return imagenEscalada;
    }

    public void RegistrarseBtn() {
        try {
            String nombreUsuario = register_View.getjTextFieldUsuario().getText();
            String contraseña = (String.valueOf(register_View.getjPasswordField().getPassword()));
            String nombrePersona = register_View.getjTextFieldNombreRegistro().getText();
            String apellidoPersona = register_View.getjTextFieldApellido().getText();
            String dniPersona = register_View.getjTextFieldCedula().getText();
            String celularPersona = register_View.getjTextFieldtelefono().getText();
            String correoPersona = register_View.getjTextFieldCorreo().getText();

            if (!validaciones.isValidEmail(register_View.getjTextFieldCorreo().getText())) {
                JOptionPane.showMessageDialog(register_View, "Ingrese un correo valido");
                return;
            }
            String nombreRol = register_View.getjCBoxRolPersonal().getSelectedItem().toString();
            boolean estadoRol = true;
            boolean registro = app.registrarUsuarioPersonaRol(1, 1, nombreUsuario, contraseña, nombrePersona, apellidoPersona, dniPersona, celularPersona, correoPersona, 1, nombreRol, true);
            if (registro) {
                JOptionPane.showMessageDialog(register_View, "Registro correcto");
            } else {
                JOptionPane.showMessageDialog(register_View, "Registro incorrecto, ingrese todos los datos necesarios.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(register_View, e);
        }
    }

    public void ValidarTextField() {
//        register_View.getjTextFieldNombreRegistro().addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyTyped(java.awt.event.KeyEvent evt) {
//                validaciones.IngresarSoloLetras(evt);
//            }
//        });
//        register_View.getjTextFieldCedula().addKeyListener(new java.awt.event.KeyEvent() {
//            public void keyTyped(java.awt.event.KeyEvent evt) {
//                validaciones.IngresarSoloNumeros(evt);
//            }
//        });
//        register_View.getjTextFieldtelefono().addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyTyped(java.awt.event.KeyEvent evt) {
//                validaciones.IngresarSoloNumeros(evt);
//            }
//        });
//        register_View.getjTextFieldApellido().addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyTyped(java.awt.event.KeyEvent evt) {
//                validaciones.IngresarSoloLetras(evt);
//            }
//        });

        register_View.getBtnVolver().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverBtn();
            }
        });
        register_View.getBtnRegistrar().addActionListener(l -> RegistrarseBtn());

        register_View.getJlabelShowPassword().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                register_View.getjPasswordField().setEchoChar((char) 0);
                register_View.getJlabelShowPassword().setVisible(false);
                register_View.getJlabelDismissPassword().setVisible(true);
            }
        });
        register_View.getJlabelDismissPassword().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                register_View.getjPasswordField().setEchoChar('*');
                register_View.getJlabelShowPassword().setVisible(true);
                register_View.getJlabelDismissPassword().setVisible(false);
            }
        });
    }

    public void VolverBtn() {
        register_View.dispose();
        Login_View vl = new Login_View();
        Controller_Login ctl = new Controller_Login(vl);
        ctl.IniciarControl();
    }
}
