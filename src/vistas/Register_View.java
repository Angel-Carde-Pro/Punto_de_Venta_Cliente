package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Register_View extends javax.swing.JFrame {

    public Register_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtDirreccion = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txtconfirmpassword = new javax.swing.JTextField();
        txtNTelefono = new javax.swing.JTextField();
        lblmensajeerror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setText("Nro. Celular:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, -1));

        jLabel5.setText("Nombre De Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, -1));

        jLabel6.setText("Contraseña:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel7.setText("Rol:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 169, -1));
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 169, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 169, -1));
        jPanel1.add(txtDirreccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 169, -1));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 169, -1));
        jPanel1.add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 169, -1));
        jPanel1.add(txtNTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 169, -1));
        jPanel1.add(lblmensajeerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 503, 320, -1));

        jPanel2.setBackground(new java.awt.Color(158, 200, 229));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanel2.add(jLabelTitulo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 463, -1));

        btnRegistrar.setBackground(new java.awt.Color(72, 169, 72));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registar");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, 40));

        jLabel9.setText("Cedula:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 59, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 169, -1));

        jLabel10.setText("Confirmar Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor", "Gerente" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 170, -1));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public JLabel getLblmensajeerror() {
        return lblmensajeerror;
    }

    public void setLblmensajeerror(JLabel lblmensajeerror) {
        this.lblmensajeerror = lblmensajeerror;
    }

    public JTextField getTxtapellido() {
        return txtapellido;
    }

    public void setTxtapellido(JTextField txtapellido) {
        this.txtapellido = txtapellido;
    }

    public JTextField getTxtconfirmpassword() {
        return txtconfirmpassword;
    }

    public void setTxtconfirmpassword(JTextField txtconfirmpassword) {
        this.txtconfirmpassword = txtconfirmpassword;
    }

    public JTextField getTxtemail() {
        return txtDirreccion;
    }

    public void setTxtemail(JTextField txtemail) {
        this.txtDirreccion = txtemail;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxtpassword() {
        return txtpassword;
    }

    public void setTxtpassword(JTextField txtpassword) {
        this.txtpassword = txtpassword;
    }

    public JTextField getTxtsaldo() {
        return txtNTelefono;
    }

    public void setTxtsaldo(JTextField txtsaldo) {
        this.txtNTelefono = txtsaldo;
    }

    public JTextField getTxtuser() {
        return txtCedula;
    }
    public void setTxtuser(JTextField txtuser) {
        this.txtCedula = txtuser;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblmensajeerror;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDirreccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNTelefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtconfirmpassword;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
