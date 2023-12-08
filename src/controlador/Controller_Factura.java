package controlador;

import vistas.*;

/**
 *
 * @author joelu
 */
public class Controller_Factura {
    Factura_View facturaview;

    public Controller_Factura(Factura_View facturaview) {
        this.facturaview = facturaview;
    }
    
    public void iniciarcontrol(){
        facturaview.setVisible(true);
        facturaview.getBtnCrear().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Productos_Dialog rl = new Productos_Dialog();
                Controller_Add_Prod cr1 = new Controller_Add_Prod(rl);
                cr1.IniciarControl();
            }
        });
    }
}
