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

        main_View.getjButtonRProductos().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Productos_View pl = new Productos_View();
                Controller_Productos cp1 = new Controller_Productos(pl);
                cp1.IniciarControl();
            }
        });
    }
}
