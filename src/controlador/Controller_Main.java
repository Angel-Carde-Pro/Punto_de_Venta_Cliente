package controlador;

import Vistas.Main.Dashboard;
import Vistas.*;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ws.Peticiones;
import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Main {

    private Main_View main_View;
    private Dashboard dashboardView;

    public Controller_Main(Main_View main_View) {
        this.main_View = main_View;
    }

    public void IniciarControl() {
        main_View.setTitle("Sistema De Facturación");
        main_View.setVisible(true);
        main_View.setLocationRelativeTo(null);

        main_View.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/money-bag.png")).getImage());

        showForm(dashboardView = new Dashboard());
        Controller_Dasboard cDash = new Controller_Dasboard(dashboardView, main_View);
        cDash.IniciarControl();

        main_View.getSalir().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CerrarVentana();
            }
        });
    }

    public void showForm(Component com) {
        main_View.getContent().removeAll();
        main_View.getContent().add(com);
        main_View.getContent().repaint();
        main_View.getContent().revalidate();
    }

    public void CerrarVentana() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar Sesion?",
                "Cerrar Sesion", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            main_View.dispose();
            Login_View vl = new Login_View();
            Controller_Login ctl = new Controller_Login(vl);
            ctl.IniciarControl();
        }
    }
}
