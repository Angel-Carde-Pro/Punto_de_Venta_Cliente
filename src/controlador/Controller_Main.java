package controlador;

import java.awt.event.MouseEvent;
import vistas.*;
import ws.Peticiones;
import ws.Peticiones_Service;

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
        
        main_View.getjButtonFac().addMouseListener( new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Factura_View p2 = new Factura_View();
                Controller_Factura control = new Controller_Factura(p2);
                control.iniciarcontrol();
            }
        });
    }
   
     
}
