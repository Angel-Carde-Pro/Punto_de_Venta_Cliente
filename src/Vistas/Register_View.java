package Vistas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register_View extends javax.swing.JFrame {

    public Register_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cedulaTxt = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JLabel();
        jTextFieldNombreRegistro = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        ApellidoTxt = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        UsuarioTxt = new javax.swing.JLabel();
        jLabelContra = new javax.swing.JLabel();
        jlabelShowPassword = new javax.swing.JLabel();
        jlabelDismissPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        contraTxt = new javax.swing.JLabel();
        jCBoxRolPersonal = new javax.swing.JComboBox<>();
        RolTxt = new javax.swing.JLabel();
        Jlabelrol = new javax.swing.JLabel();
        telefonoTxt1 = new javax.swing.JLabel();
        jLabeltelefono2 = new javax.swing.JLabel();
        jTextFieldtelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        CorreoTXT = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jTextLoginTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO DE USUARIO");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanel2.add(jLabelTitulo);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        cedulaTxt.setText("CÉDULA");
        jPanel1.add(cedulaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabelCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/identification-card.png"))); // NOI18N
        jPanel1.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 30, -1));

        jTextFieldCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 263, 33));

        nombreTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        nombreTxt.setText("NOMBRE");
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jTextFieldNombreRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 263, 33));

        jLabelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jTextFieldApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 263, 33));

        ApellidoTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        ApellidoTxt.setText("APELLIDO");
        ApellidoTxt.setToolTipText("");
        jPanel1.add(ApellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabelApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 263, 33));

        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/identification-card.png"))); // NOI18N
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        UsuarioTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        UsuarioTxt.setText("USUARIO");
        jPanel1.add(UsuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabelContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lock.png"))); // NOI18N
        jPanel1.add(jLabelContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));
        jPanel1.add(jlabelShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 20, 20));
        jPanel1.add(jlabelDismissPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 20, 20));

        jPasswordField.setText("********");
        jPanel1.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 263, 38));

        contraTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 16)); // NOI18N
        contraTxt.setText("CONTRASEÑA");
        jPanel1.add(contraTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jCBoxRolPersonal.setForeground(new java.awt.Color(51, 51, 51));
        jCBoxRolPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor", "Gerente" }));
        jCBoxRolPersonal.setBorder(null);
        jPanel1.add(jCBoxRolPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 260, 30));

        RolTxt.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        RolTxt.setText("Rol");
        jPanel1.add(RolTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 40, 30));

        Jlabelrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AcercaDe.png"))); // NOI18N
        Jlabelrol.setPreferredSize(new java.awt.Dimension(28, 28));
        jPanel1.add(Jlabelrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        telefonoTxt1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        telefonoTxt1.setText("Telefono");
        jPanel1.add(telefonoTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabeltelefono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registros.png"))); // NOI18N
        jPanel1.add(jLabeltelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 30, 30));

        jTextFieldtelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 260, 33));

        jTextFieldCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 260, 33));

        jLabelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 30, 30));

        CorreoTXT.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        CorreoTXT.setText("Correo");
        jPanel1.add(CorreoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 130, 40));

        btnRegistrar.setBackground(new java.awt.Color(72, 169, 72));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registar");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 130, 40));

        jTextLoginTitle.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jTextLoginTitle.setText("Ingresa tus Datos");
        jPanel1.add(jTextLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getCorreoTXT() {
        return CorreoTXT;
    }

    public void setCorreoTXT(JLabel CorreoTXT) {
        this.CorreoTXT = CorreoTXT;
    }

    public JLabel getjLabelCorreo() {
        return jLabelCorreo;
    }

    public void setjLabelCorreo(JLabel jLabelCorreo) {
        this.jLabelCorreo = jLabelCorreo;
    }

    public JTextField getjTextFieldCorreo() {
        return jTextFieldCorreo;
    }

    public void setjTextFieldCorreo(JTextField jTextFieldCorreo) {
        this.jTextFieldCorreo = jTextFieldCorreo;
    }

    public JLabel getApellidoTxt() {
        return ApellidoTxt;
    }

    public void setApellidoTxt(JLabel ApellidoTxt) {
        this.ApellidoTxt = ApellidoTxt;
    }

    public JLabel getJlabelrol() {
        return Jlabelrol;
    }

    public void setJlabelrol(JLabel Jlabelrol) {
        this.Jlabelrol = Jlabelrol;
    }

    public JLabel getRolTxt() {
        return RolTxt;
    }

    public void setRolTxt(JLabel RolTxt) {
        this.RolTxt = RolTxt;
    }

    public JLabel getUsuarioTxt() {
        return UsuarioTxt;
    }

    public void setUsuarioTxt(JLabel UsuarioTxt) {
        this.UsuarioTxt = UsuarioTxt;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JLabel getCedulaTxt() {
        return cedulaTxt;
    }

    public void setCedulaTxt(JLabel cedulaTxt) {
        this.cedulaTxt = cedulaTxt;
    }

    public JLabel getContraTxt() {
        return contraTxt;
    }

    public void setContraTxt(JLabel contraTxt) {
        this.contraTxt = contraTxt;
    }

    public JComboBox<String> getjCBoxRolPersonal() {
        return jCBoxRolPersonal;
    }

    public void setjCBoxRolPersonal(JComboBox<String> jCBoxRolPersonal) {
        this.jCBoxRolPersonal = jCBoxRolPersonal;
    }

    public JLabel getjLabelApellido() {
        return jLabelApellido;
    }

    public void setjLabelApellido(JLabel jLabelApellido) {
        this.jLabelApellido = jLabelApellido;
    }

    public JLabel getjLabelCedula() {
        return jLabelCedula;
    }

    public void setjLabelCedula(JLabel jLabelCedula) {
        this.jLabelCedula = jLabelCedula;
    }

    public JLabel getjLabelContra() {
        return jLabelContra;
    }

    public void setjLabelContra(JLabel jLabelContra) {
        this.jLabelContra = jLabelContra;
    }

    public JLabel getjLabelNombre() {
        return jLabelNombre;
    }

    public void setjLabelNombre(JLabel jLabelNombre) {
        this.jLabelNombre = jLabelNombre;
    }

    public JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }

    public void setjLabelTitulo(JLabel jLabelTitulo) {
        this.jLabelTitulo = jLabelTitulo;
    }

    public JLabel getjLabelUsuario() {
        return jLabelUsuario;
    }

    public void setjLabelUsuario(JLabel jLabelUsuario) {
        this.jLabelUsuario = jLabelUsuario;
    }

    public JLabel getjLabeltelefono2() {
        return jLabeltelefono2;
    }

    public void setjLabeltelefono2(JLabel jLabeltelefono2) {
        this.jLabeltelefono2 = jLabeltelefono2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPasswordField getjPasswordField() {
        return jPasswordField;
    }

    public void setjPasswordField(JPasswordField jPasswordField) {
        this.jPasswordField = jPasswordField;
    }

    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }

    public void setjTextFieldApellido(JTextField jTextFieldApellido) {
        this.jTextFieldApellido = jTextFieldApellido;
    }

    public JTextField getjTextFieldCedula() {
        return jTextFieldCedula;
    }

    public void setjTextFieldCedula(JTextField jTextFieldCedula) {
        this.jTextFieldCedula = jTextFieldCedula;
    }

    public JTextField getjTextFieldNombreRegistro() {
        return jTextFieldNombreRegistro;
    }

    public void setjTextFieldNombreRegistro(JTextField jTextFieldNombreRegistro) {
        this.jTextFieldNombreRegistro = jTextFieldNombreRegistro;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public void setjTextFieldUsuario(JTextField jTextFieldUsuario) {
        this.jTextFieldUsuario = jTextFieldUsuario;
    }

    public JTextField getjTextFieldtelefono() {
        return jTextFieldtelefono;
    }

    public void setjTextFieldtelefono(JTextField jTextFieldtelefono) {
        this.jTextFieldtelefono = jTextFieldtelefono;
    }

    public JLabel getJlabelDismissPassword() {
        return jlabelDismissPassword;
    }

    public void setJlabelDismissPassword(JLabel jlabelDismissPassword) {
        this.jlabelDismissPassword = jlabelDismissPassword;
    }

    public JLabel getJlabelShowPassword() {
        return jlabelShowPassword;
    }

    public void setJlabelShowPassword(JLabel jlabelShowPassword) {
        this.jlabelShowPassword = jlabelShowPassword;
    }

    public JLabel getNombreTxt() {
        return nombreTxt;
    }

    public void setNombreTxt(JLabel nombreTxt) {
        this.nombreTxt = nombreTxt;
    }

    public JLabel getTelefonoTxt1() {
        return telefonoTxt1;
    }

    public void setTelefonoTxt1(JLabel telefonoTxt1) {
        this.telefonoTxt1 = telefonoTxt1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoTxt;
    private javax.swing.JLabel CorreoTXT;
    private javax.swing.JLabel Jlabelrol;
    private javax.swing.JLabel RolTxt;
    private javax.swing.JLabel UsuarioTxt;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel cedulaTxt;
    private javax.swing.JLabel contraTxt;
    private javax.swing.JComboBox<String> jCBoxRolPersonal;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelContra;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabeltelefono2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombreRegistro;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldtelefono;
    private javax.swing.JLabel jTextLoginTitle;
    private javax.swing.JLabel jlabelDismissPassword;
    private javax.swing.JLabel jlabelShowPassword;
    private javax.swing.JLabel nombreTxt;
    private javax.swing.JLabel telefonoTxt1;
    // End of variables declaration//GEN-END:variables
}
