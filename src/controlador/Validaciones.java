package controlador;

import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class Validaciones {

    // ---> Se lo usara para limitar a 10 los numeros que se pueden ingresar en un jTextField
    private int contador = 0;
    private boolean dotPresent;

    public boolean validarNombre(String nomAp) {
        return nomAp.matches("[a-zA-z]{3,15}");
    }

    public void IngresarSoloNumeros(java.awt.event.KeyEvent evt) {
        // --> Validacion extra por si el usuario borra de golpe todos los numeros y por si pega.
        JTextField txt = (JTextField) evt.getComponent();
        if (txt.getText().equals("")) {
            contador = 0;
        } else if (txt.getText().length() >= 10) {
            contador = 10;
        }

        char validarnum = evt.getKeyChar();
        if (validarnum >= '0' && validarnum <= '9') {
            if (contador < 10) {
                contador++;
            } else {
                evt.consume();
            }
            //--> Hacer un decremento al contador cuando borre numeros
        } else if (validarnum == KeyEvent.VK_BACK_SPACE || validarnum == KeyEvent.VK_DELETE) {
            if (contador > 0) {
                contador--;
            }
        } else {
            evt.consume();
        }
    }

    public void IngresarSoloLetras(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }

    public void ValiSueldo(java.awt.event.KeyEvent evt) {
        JTextField txt = (JTextField) evt.getComponent();
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
        if (c == '.' && txt.getText().contains(".")) {
            evt.consume();
        }
    }

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }
}
