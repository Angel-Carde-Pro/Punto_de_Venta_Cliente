package controlador;

import AppPackage.AnimationClass;
import Vistas.Main_View;
import Vistas.Login_View;
import Vistas.Register_View;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import ws.Peticiones;
import ws.Peticiones_Service;

/**
 *
 * @author angel
 */
public class Controller_Login {

    private Login_View login_View;
    Peticiones_Service service = new Peticiones_Service();
    Peticiones cliente = service.getPeticionesPort();

    private ImageIcon iFondo = new ImageIcon("src\\Imagenes\\Login\\fondo.png"),
            idFondos1 = new ImageIcon("src\\Imagenes\\Login\\imagen1.png"),
            idiconoLogin = new ImageIcon("src\\Imagenes\\Login\\logoLogin.png"),
            imagenProd1 = new ImageIcon("src\\Imagenes\\Product_1.jpg"),
            showPassword = new ImageIcon("src\\Imagenes\\Login\\eye-open1.png"),
            dissmisPassword = new ImageIcon("src\\Imagenes\\Login\\eye-close.png"),
            imagenProd2 = new ImageIcon("src\\Imagenes\\Product_2.jpg");

    public Controller_Login(Login_View login_View) {
        this.login_View = login_View;
    }

    public void IniciarControl() {
        login_View.setTitle("Login");
        login_View.setVisible(true);
        login_View.setLocationRelativeTo(null);

        login_View.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/money-bag.png")).getImage());

        login_View.getjBtnLogin().addActionListener(l -> IniciarSesion());
        login_View.getjBtnREGISTER().addActionListener(l -> RegistrarseBtn());
        login_View.getjButton1().addActionListener(l -> AccionesBotonesAnimados1());
        login_View.getjButton2().addActionListener(l -> AccionesBotonesAnimados2());
        login_View.getjButton3().addActionListener(l -> AccionesBotonesAnimados3());
        login_View.getAlertusuBtxt().setVisible(false);
        login_View.getAlertContraBtxt().setVisible(false);
        ValidadcionesInputs();
        crarImagenesDeLaInterfaz();
    }

    public void crarImagenesDeLaInterfaz() {
        login_View.getJlabelShowPassword().setIcon(EscalarImagen(showPassword, login_View.getJlabelShowPassword()));
        login_View.getJlabelDismissPassword().setIcon(EscalarImagen(dissmisPassword, login_View.getJlabelDismissPassword()));
        login_View.getjImagenmorsa().setIcon(EscalarImagen(imagenProd1, login_View.getjImagenmorsa()));
        login_View.getjImageFAnimal().setIcon(EscalarImagen(imagenProd2, login_View.getjImageFAnimal()));
        login_View.getjPanelFondo().setBackground(Color.WHITE);
        login_View.getjImageFondo().setIcon(EscalarImagen(iFondo, login_View.getjImageFondo()));
        login_View.getjImageFPassword().setIcon(EscalarImagen(idFondos1, login_View.getjImageFPassword()));
        login_View.getjImageIconoLogin().setIcon(EscalarImagen(idiconoLogin, login_View.getjImageIconoLogin()));
        login_View.getJlabelDismissPassword().setVisible(false);
    }

    public ImageIcon EscalarImagen(ImageIcon imagenATransformar, JLabel tamañoPanel) {
        ImageIcon imagenEscalada = new ImageIcon(imagenATransformar.getImage().getScaledInstance(tamañoPanel.getWidth(),
                tamañoPanel.getHeight(), Image.SCALE_AREA_AVERAGING));
        return imagenEscalada;
    }

    public void IniciarSesion() {
        if (Validaciones()) {
            String usuario = login_View.getjTextFieldUsuario().getText();
            char[] passchars = login_View.getjTextFieldContraseña().getPassword();
            String contraseña = new String(passchars);

//            String a = cliente.loginUsuario(usuario, contraseña);
//            login_View.setTitle(a);
//            if (a.contains("exitoso")) {
            login_View.dispose();
            Main_View ml = new Main_View();
            Controller_Main cr1 = new Controller_Main(ml);
            cr1.IniciarControl();
//            } else {
//                JOptionPane.showMessageDialog(login_View, "Usuario o Contraseña incorrectos");
//            }
        }
    }

    public boolean Validaciones() {
        if (login_View.getjTextFieldUsuario().getText().equals("Ingrese su nombre de usuario") || login_View.getjTextFieldUsuario().getText().isEmpty()) {
            JOptionPane.showMessageDialog(login_View, "Por favor, ingrese correctamente los datos");
            return false;
        }
        if (String.valueOf(login_View.getjTextFieldContraseña().getPassword()).equals("********") || String.valueOf(login_View.getjTextFieldContraseña().getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(login_View, "Por favor, ingrese una contraseña correctamente los datos");
            return false;
        }
        return true;
    }

    public void RegistrarseBtn() {
        login_View.dispose();
        Register_View rl = new Register_View();
        Controller_Register cr1 = new Controller_Register(rl);
        cr1.IniciarControl();
    }

    public void ValidadcionesInputs() {
        login_View.getJlabelShowPassword().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login_View.getjTextFieldContraseña().setEchoChar((char) 0);
                login_View.getJlabelShowPassword().setVisible(false);
                login_View.getJlabelDismissPassword().setVisible(true);
            }
        });
        login_View.getJlabelDismissPassword().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login_View.getjTextFieldContraseña().setEchoChar('*');
                login_View.getJlabelShowPassword().setVisible(true);
                login_View.getJlabelDismissPassword().setVisible(false);
            }
        });

        login_View.getjTextFieldUsuario().addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (login_View.getjTextFieldUsuario().getText().equals("Ingrese su nombre de usuario")) {
                    login_View.getjTextFieldUsuario().setText("");
                }
                if (String.valueOf(login_View.getjTextFieldContraseña().getPassword()).isEmpty()) {
                    login_View.getjTextFieldContraseña().setText("********");
                }
            }
        });

        login_View.getjTextFieldContraseña().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                if (evt.getKeyChar() == '\n') {
                    IniciarSesion();
                }
            }
        });

        login_View.getjTextFieldContraseña().addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (String.valueOf(login_View.getjTextFieldContraseña().getPassword()).equals("********")) {
                    login_View.getjTextFieldContraseña().setText("");
                }
                if (login_View.getjTextFieldUsuario().getText().isEmpty()) {
                    login_View.getjTextFieldUsuario().setText("Ingrese su nombre de usuario");
                }
            }
        });
    }

    public void AccionesBotonesAnimados1() {
        AnimationClass animationClass = new AnimationClass();
        login_View.getjButton1().setEnabled(true);
        login_View.getjButton2().setSelected(false);
        login_View.getjButton3().setSelected(false);
        if (login_View.getjImageFAnimal().getX() == 0) {
            animationClass.jLabelXRight(0, 450, 25, 5, login_View.getjImageFAnimal());
            animationClass.jLabelXRight(-420, 0, 25, 5, login_View.getjImageFPassword());
        } else {
            animationClass.jLabelXRight(0, 870, 25, 5, login_View.getjImagenmorsa());
            animationClass.jLabelXRight(-420, 0, 25, 5, login_View.getjImageFPassword());
        }
    }

    public void AccionesBotonesAnimados2() {
        AnimationClass animationClass = new AnimationClass();
        login_View.getjButton1().setEnabled(false);
        login_View.getjButton2().setSelected(true);
        login_View.getjButton3().setSelected(false);
        if (login_View.getjImageFPassword().getX() == 0) {
            animationClass.jLabelXLeft(450, 0, 25, 5, login_View.getjImageFAnimal());
            animationClass.jLabelXLeft(0, -420, 25, 5, login_View.getjImageFPassword());
        } else {
            animationClass.jLabelXLeft(450, 0, 25, 5, login_View.getjImageFAnimal());
            animationClass.jLabelXRight(0, 870, 25, 5, login_View.getjImagenmorsa());
        }
    }

    public void AccionesBotonesAnimados3() {
        AnimationClass animationClass = new AnimationClass();
        login_View.getjButton1().setEnabled(false);
        login_View.getjButton2().setSelected(false);
        login_View.getjButton3().setSelected(true);
        if (login_View.getjImageFPassword().getX() == 0) {
            animationClass.jLabelXLeft(0, -420, 25, 5, login_View.getjImageFPassword());
            animationClass.jLabelXLeft(870, 0, 20, 5, login_View.getjImagenmorsa());
        } else {
            animationClass.jLabelXLeft(870, 0, 25, 5, login_View.getjImagenmorsa());
            animationClass.jLabelXRight(0, 450, 25, 5, login_View.getjImageFAnimal());
        }
    }
}
