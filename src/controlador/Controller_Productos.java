package controlador;

import vistas.*;

/**
 *
 * @author angel
 */
public class Controller_Productos {

    private Productos_View productos_View;

    public Controller_Productos(Productos_View productos_View) {
        this.productos_View = productos_View;
    }

    public void IniciarControl() {
        productos_View.setTitle("MENU");
        productos_View.setVisible(true);
        productos_View.setLocationRelativeTo(null);

        productos_View.getBtnCrear().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Productos_Dialog pl = new Productos_Dialog();
                Controller_Add_Prod pa = new Controller_Add_Prod(pl);
                pa.IniciarControl();
            }
        });
    }
}
