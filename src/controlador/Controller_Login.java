package controlador;

import javax.swing.JOptionPane;
import vistas.*;
import ws.Peticiones;
import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Login {
    private Login_View login_View;
    Peticiones_Service service = new Peticiones_Service();
    Peticiones cliente = service.getPeticionesPort();

    public Controller_Login(Login_View login_View) {
        this.login_View = login_View;
    }

    public void IniciarControl() {
        login_View.setTitle("Login");
        login_View.setVisible(true);
        login_View.setLocationRelativeTo(null);

        login_View.getjBtnLogin().addActionListener(l -> IniciarSesion());
        login_View.getjBtnREGISTER().addActionListener(l -> RegistrarseBtn());

        ValidadcionesInputs();
    }

    public void IniciarSesion() {
        
        if (Validaciones()) {
            login_View.dispose();
            Main_View ml = new Main_View();
            Controller_Main cr1 = new Controller_Main(ml);
            cr1.IniciarControl();
        }
    }

    public boolean Validaciones() {
        if (login_View.getUserTxt().getText().equals("Ingrese su nombre de usuario") || login_View.getUserTxt().getText().isEmpty()) {
            JOptionPane.showMessageDialog(login_View, "Por favor, ingrese correctamente los datos");
            return false;
        }
        if (String.valueOf(login_View.getPassTxt().getPassword()).equals("********") || String.valueOf(login_View.getPassTxt().getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(login_View, "Por favor, ingrese una contraseña correctamente los datos");
            return false;
        }
        return true;
    }

    public void RegistrarseBtn() {
        login_View.dispose();
        Register_View rl = new Register_View();
        Controller_Register cr1 = new Controller_Register(rl);
        cr1.IniciarControl();
    }

    public void ValidadcionesInputs() {
        login_View.getUserTxt().addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (login_View.getUserTxt().getText().equals("Ingrese su nombre de usuario")) {
                    login_View.getUserTxt().setText("");
                }
                if (String.valueOf(login_View.getPassTxt().getPassword()).isEmpty()) {
                    login_View.getPassTxt().setText("********");
                }
            }
        });

        login_View.getPassTxt().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    IniciarSesion();
                }
            }
        });

        login_View.getPassTxt().addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(login_View.getPassTxt().getPassword()).equals("********")) {
                    login_View.getPassTxt().setText("");
                }
                if (login_View.getUserTxt().getText().isEmpty()) {
                    login_View.getUserTxt().setText("Ingrese su nombre de usuario");
                }
            }
        });
    }
}
