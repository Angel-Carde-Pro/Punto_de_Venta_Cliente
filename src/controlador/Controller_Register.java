package controlador;

import vistas.*;

/**
 *
 * @author angel
 */
public class Controller_Register {

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
    }

    public void VolverBtn() {
        register_View.dispose();;
        Login_View vl = new Login_View();
        Controller_Login ctl = new Controller_Login(vl);
        ctl.IniciarControl();
    }
}
