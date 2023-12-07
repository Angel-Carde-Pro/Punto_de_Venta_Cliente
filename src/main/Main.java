package main;

import controlador.Controller_Login;
import vistas.Login_View;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
//            WSOperaciones client = service.getWSOperacionesPort();
//            //client.cargarClientes();
//            client.cargaDatos();
            Login_View vl = new Login_View();
            Controller_Login ctl = new Controller_Login(vl);
            ctl.IniciarControl();
    }

}
