package controlador;

import vistas.*;

/**
 *
 * @author angel
 */
public class Controller_Main {

    private Main_View main_View;

    public Controller_Main(Main_View main_View) {
        this.main_View = main_View;
    }

    public void IniciarControl() {
        main_View.setTitle("MENU");
        main_View.setVisible(true);
        main_View.setLocationRelativeTo(null);

        main_View.getjButtonFac().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                Register_View rl = new Register_View();
//                Controller_Register cr1 = new Controller_Register(rl);
//                cr1.IniciarControl();
            }
        });
    }
}
