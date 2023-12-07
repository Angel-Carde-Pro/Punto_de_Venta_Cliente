package controlador;

import vistas.*;

/**
 *
 * @author angel
 */
public class Controller_Login {

    private Login_View login_View;

    public Controller_Login(Login_View login_View) {
        this.login_View = login_View;
        //this.user = user;
    }

    public void IniciarControl() {
        login_View.setTitle("Login");
        login_View.setVisible(true);
        login_View.setLocationRelativeTo(null);

        login_View.getjBtnREGISTER().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseBtn();
            }
        });
    }

    public void RegistrarseBtn() {
        login_View.dispose();
        Register_View rl = new Register_View();
        Controller_Register cr1 = new Controller_Register(rl);
        cr1.IniciarControl();
    }
}
