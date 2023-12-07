package controlador;

import vistas.*;
import ws.Peticiones;
import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Login {
    private Login_View login_View;

    public Controller_Login(Login_View login_View) {
        this.login_View = login_View;
    }

    public void IniciarControl() {
        login_View.setTitle("Login");
        login_View.setVisible(true);
        login_View.setLocationRelativeTo(null);
        
        login_View.getPassTxt().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    IniciarSesion();
                }
            }
        });
        
        login_View.getUserTxt().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    IniciarSesion();
                }
            }
        });
        
        login_View.getjBtnREGISTER().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseBtn();
            }
        });

        login_View.getjBtnLogin().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarSesion();
            }
        });
    }

    public void IniciarSesion() {
        login_View.dispose();
        Main_View ml = new Main_View();
        Controller_Main cr1 = new Controller_Main(ml);
        cr1.IniciarControl();
    }

    public void RegistrarseBtn() {
        login_View.dispose();
        Register_View rl = new Register_View();
        Controller_Register cr1 = new Controller_Register(rl);
        cr1.IniciarControl();
    }
}
