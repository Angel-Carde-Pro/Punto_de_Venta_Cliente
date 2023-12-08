package main;

import Vistas.Login_View;
import controlador.Controller_Login;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Login_View vl = new Login_View();
        Controller_Login ctl = new Controller_Login(vl);
        ctl.IniciarControl();
    }
}
