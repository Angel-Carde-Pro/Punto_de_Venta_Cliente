package controlador;

import Vistas.*;
import Vistas.Main.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author angel
 */
public class Controller_Dasboard {

    public Dashboard dashboardView;
    public Main_View main;

    public Controller_Dasboard(Dashboard dashboardView, Main_View main) {
        this.dashboardView = dashboardView;
        this.main = main;
    }

    public void IniciarControl() {
        dashboardView.setVisible(true);
        dashboardView.getClasificacionesBTN().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                OpenClasificaciones();
            }
        });
    }

    public void OpenClasificaciones() {

    }
}
