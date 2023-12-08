package Vistas.Main;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Productos_Dialog extends javax.swing.JDialog {

    public Productos_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JComboBox<String> getjComboBoxSexo() {
        return jComboBoxSexo;
    }

    public void setjComboBoxSexo(JComboBox<String> jComboBoxSexo) {
        this.jComboBoxSexo = jComboBoxSexo;
    }

    public JComboBox<String> getjComboBoxSexo1() {
        return jComboBoxSexo1;
    }

    public void setjComboBoxSexo1(JComboBox<String> jComboBoxSexo1) {
        this.jComboBoxSexo1 = jComboBoxSexo1;
    }

    public JComboBox<String> getjComboBoxSexo2() {
        return jComboBoxSexo2;
    }

    public void setjComboBoxSexo2(JComboBox<String> jComboBoxSexo2) {
        this.jComboBoxSexo2 = jComboBoxSexo2;
    }

    public JLabel getjLabelTitulo() {
        return jLabelTitulo;
    }

    public void setjLabelTitulo(JLabel jLabelTitulo) {
        this.jLabelTitulo = jLabelTitulo;
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

    public JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public JSpinner getjSpinnerPrecioU() {
        return jSpinnerPrecioU;
    }

    public void setjSpinnerPrecioU(JSpinner jSpinnerPrecioU) {
        this.jSpinnerPrecioU = jSpinnerPrecioU;
    }

    public JLabel getLbl_ID_TXT() {
        return lbl_ID_TXT;
    }

    public void setLbl_ID_TXT(JLabel lbl_ID_TXT) {
        this.lbl_ID_TXT = lbl_ID_TXT;
    }

    public JLabel getLbl_id() {
        return lbl_id;
    }

    public void setLbl_id(JLabel lbl_id) {
        this.lbl_id = lbl_id;
    }

    public JLabel getLbl_nombre2() {
        return lbl_nombre2;
    }

    public void setLbl_nombre2(JLabel lbl_nombre2) {
        this.lbl_nombre2 = lbl_nombre2;
    }

    public JLabel getLbl_sexo() {
        return lbl_sexo;
    }

    public void setLbl_sexo(JLabel lbl_sexo) {
        this.lbl_sexo = lbl_sexo;
    }

    public JLabel getLbl_sexo1() {
        return lbl_sexo1;
    }

    public void setLbl_sexo1(JLabel lbl_sexo1) {
        this.lbl_sexo1 = lbl_sexo1;
    }

    public JLabel getLbl_sexo2() {
        return lbl_sexo2;
    }

    public void setLbl_sexo2(JLabel lbl_sexo2) {
        this.lbl_sexo2 = lbl_sexo2;
    }

    public JLabel getLbl_telefono() {
        return lbl_telefono;
    }

    public void setLbl_telefono(JLabel lbl_telefono) {
        this.lbl_telefono = lbl_telefono;
    }

    public JLabel getLbl_telefono1() {
        return lbl_telefono1;
    }

    public void setLbl_telefono1(JLabel lbl_telefono1) {
        this.lbl_telefono1 = lbl_telefono1;
    }

    public JLabel getLbl_telefono2() {
        return lbl_telefono2;
    }

    public void setLbl_telefono2(JLabel lbl_telefono2) {
        this.lbl_telefono2 = lbl_telefono2;
    }

    public JLabel getLbl_telefono3() {
        return lbl_telefono3;
    }

    public void setLbl_telefono3(JLabel lbl_telefono3) {
        this.lbl_telefono3 = lbl_telefono3;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNombre1() {
        return txtNombre1;
    }

    public void setTxtNombre1(JTextField txtNombre1) {
        this.txtNombre1 = txtNombre1;
    }

    public JTextField getTxtNombre2() {
        return txtNombre2;
    }

    public void setTxtNombre2(JTextField txtNombre2) {
        this.txtNombre2 = txtNombre2;
    }

    public JTextField getTxtNombre3() {
        return txtNombre3;
    }

    public void setTxtNombre3(JTextField txtNombre3) {
        this.txtNombre3 = txtNombre3;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_ID_TXT = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        lbl_id = new javax.swing.JLabel();
        lbl_nombre2 = new javax.swing.JLabel();
        jComboBoxSexo1 = new javax.swing.JComboBox<>();
        lbl_sexo1 = new javax.swing.JLabel();
        jSpinnerPrecioU = new javax.swing.JSpinner();
        lbl_telefono1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        lbl_telefono2 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        txtNombre3 = new javax.swing.JTextField();
        lbl_telefono3 = new javax.swing.JLabel();
        lbl_sexo2 = new javax.swing.JLabel();
        jComboBoxSexo2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitulo.setBackground(new java.awt.Color(76, 179, 255));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("AGREGAR PRODUCTOS");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanelTitulo.add(jLabelTitulo);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ID_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ID_TXT.setText("ID:");
        jPanel2.add(lbl_ID_TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 150, -1));

        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono.setText("ID CLASIFICACIÓN: ");
        jPanel2.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        lbl_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sexo.setText("Proveedor:");
        jPanel2.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(86, 148, 229));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(72, 169, 72));
        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 130, 40));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Example1", "Example2" }));
        jPanel2.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 120, -1));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_id.setText("XXX - XXX");
        jPanel2.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, -1));

        lbl_nombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre2.setText("Nombre:");
        jPanel2.add(lbl_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jComboBoxSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiene IVA", "No tiene IVA" }));
        jPanel2.add(jComboBoxSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, -1));

        lbl_sexo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sexo1.setText("Iva:");
        jPanel2.add(lbl_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jSpinnerPrecioU.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerPrecioU.setBorder(null);
        jPanel2.add(jSpinnerPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));

        lbl_telefono1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono1.setText("Precio Unitario:");
        jPanel2.add(lbl_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, -1));

        lbl_telefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono2.setText("Unidad:");
        jPanel2.add(lbl_telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));
        jPanel2.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 150, -1));
        jPanel2.add(txtNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, -1));

        lbl_telefono3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono3.setText("ID PROVEEDOR: ");
        jPanel2.add(lbl_telefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        lbl_sexo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sexo2.setText("Clasificación:");
        jPanel2.add(lbl_sexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jComboBoxSexo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Example1", "Example2" }));
        jPanel2.add(jComboBoxSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 120, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxSexo1;
    private javax.swing.JComboBox<String> jComboBoxSexo2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSpinner jSpinnerPrecioU;
    private javax.swing.JLabel lbl_ID_TXT;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nombre2;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sexo1;
    private javax.swing.JLabel lbl_sexo2;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_telefono1;
    private javax.swing.JLabel lbl_telefono2;
    private javax.swing.JLabel lbl_telefono3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre3;
    // End of variables declaration//GEN-END:variables
}
