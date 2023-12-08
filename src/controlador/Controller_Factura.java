package controlador;

import vistas.Factura_Viewer;
import vistas.Login_View;
import vistas.RFacturas_view;

/**
 *
 * @author joelu
 */
public class Controller_Factura{
    private Factura_Viewer facturaviewer;

    public Controller_Factura(Factura_Viewer facturaview) {
        this.facturaviewer = facturaview;
    }
    
    public void iniciarcontrol(){
        facturaviewer.setTitle("");
        facturaviewer.setVisible(true);
        facturaviewer.setLocationRelativeTo(null);
        facturaviewer.getBtnCrear().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RFacturas_view rl = new RFacturas_view();
                Controller_RFactura cr1 = new Controller_RFactura(rl);
                cr1.iniciarcontrol();
            }
        });
    }
}
