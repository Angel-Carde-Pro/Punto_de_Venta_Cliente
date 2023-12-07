package vistas;

import com.toedter.components.JSpinField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RProveedor_View extends javax.swing.JFrame {

    public RProveedor_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabelidproducto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        lblmensajeerror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboiva = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        txtpais1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jlabelidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 100, 30));

        jLabel4.setText("Telefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, -1));

        jLabel6.setText("Modelo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel8.setText("Pais:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel1.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 169, -1));
        jPanel1.add(lblmensajeerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 503, 320, -1));

        jPanel2.setBackground(new java.awt.Color(158, 200, 229));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("CREAR PROVEEDOR");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanel2.add(jLabelTitulo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        btnRegistrar.setBackground(new java.awt.Color(72, 169, 72));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registar");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 130, 40));

        jLabel9.setText("RUC:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 59, -1));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 130, 40));

        jLabel11.setText("ID Proveedor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jComboiva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", " " }));
        jPanel1.add(jComboiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 160, -1));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 169, -1));
        jPanel1.add(txtpais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 169, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    public JComboBox<String> getjComboiva() {
        return jComboiva;
    }

    public void setjComboiva(JComboBox<String> jComboiva) {
        this.jComboiva = jComboiva;
    }

    public JLabel getJlabelidproducto() {
        return jlabelidproducto;
    }

    public void setJlabelidproducto(JLabel jlabelidproducto) {
        this.jlabelidproducto = jlabelidproducto;
    }

    public JLabel getLblmensajeerror() {
        return lblmensajeerror;
    }

    public void setLblmensajeerror(JLabel lblmensajeerror) {
        this.lblmensajeerror = lblmensajeerror;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtpais1() {
        return txtpais1;
    }

    public void setTxtpais1(JTextField txtpais1) {
        this.txtpais1 = txtpais1;
    }

    public JTextField getTxtruc() {
        return txtruc;
    }

    public void setTxtruc(JTextField txtruc) {
        this.txtruc = txtruc;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboiva;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelidproducto;
    private javax.swing.JLabel lblmensajeerror;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtpais1;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
