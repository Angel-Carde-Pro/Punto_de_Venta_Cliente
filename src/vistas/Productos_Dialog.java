package vistas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Angel
 */
public class Productos_Dialog extends javax.swing.JFrame {

    public Productos_Dialog() {
        initComponents();
    }

    public JSpinner getjSpinnerStock() {
        return jSpinnerStock;
    }

    public void setjSpinnerStock(JSpinner jSpinnerStock) {
        this.jSpinnerStock = jSpinnerStock;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JComboBox<String> getjComboBoxClasificacion() {
        return jComboBoxClasificacion;
    }

    public void setjComboBoxClasificacion(JComboBox<String> jComboBoxClasificacion) {
        this.jComboBoxClasificacion = jComboBoxClasificacion;
    }

    public JComboBox<String> getjComboBoxIVA() {
        return jComboBoxIVA;
    }

    public void setjComboBoxIVA(JComboBox<String> jComboBoxIVA) {
        this.jComboBoxIVA = jComboBoxIVA;
    }

    public JComboBox<String> getjComboBoxProveedor() {
        return jComboBoxProveedor;
    }

    public void setjComboBoxProveedor(JComboBox<String> jComboBoxProveedor) {
        this.jComboBoxProveedor = jComboBoxProveedor;
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

    public JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public JSpinner getjSpinnerprecioU() {
        return jSpinnerprecioU;
    }

    public void setjSpinnerprecioU(JSpinner jSpinnerprecioU) {
        this.jSpinnerprecioU = jSpinnerprecioU;
    }

    public JLabel getLbl_Clasificacion() {
        return lbl_Clasificacion;
    }

    public void setLbl_Clasificacion(JLabel lbl_Clasificacion) {
        this.lbl_Clasificacion = lbl_Clasificacion;
    }

    public JLabel getLbl_ID_TXT() {
        return lbl_ID_TXT;
    }

    public void setLbl_ID_TXT(JLabel lbl_ID_TXT) {
        this.lbl_ID_TXT = lbl_ID_TXT;
    }

    public JLabel getLbl_IVA() {
        return lbl_IVA;
    }

    public void setLbl_IVA(JLabel lbl_IVA) {
        this.lbl_IVA = lbl_IVA;
    }

    public JLabel getLbl_PrecioUnitario() {
        return lbl_PrecioUnitario;
    }

    public void setLbl_PrecioUnitario(JLabel lbl_PrecioUnitario) {
        this.lbl_PrecioUnitario = lbl_PrecioUnitario;
    }

    public JLabel getLbl_Proveedor() {
        return lbl_Proveedor;
    }

    public void setLbl_Proveedor(JLabel lbl_Proveedor) {
        this.lbl_Proveedor = lbl_Proveedor;
    }

    public JLabel getLbl_id() {
        return lbl_id;
    }

    public void setLbl_id(JLabel lbl_id) {
        this.lbl_id = lbl_id;
    }

    public JLabel getLbl_nombre() {
        return lbl_nombre;
    }

    public void setLbl_nombre(JLabel lbl_nombre) {
        this.lbl_nombre = lbl_nombre;
    }

    public JLabel getLbl_unidad() {
        return lbl_unidad;
    }

    public void setLbl_unidad(JLabel lbl_unidad) {
        this.lbl_unidad = lbl_unidad;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtUnidad() {
        return txtUnidad;
    }

    public void setTxtUnidad(JTextField txtUnidad) {
        this.txtUnidad = txtUnidad;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_ID_TXT = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbl_Proveedor = new javax.swing.JLabel();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        lbl_nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbl_IVA = new javax.swing.JLabel();
        jComboBoxIVA = new javax.swing.JComboBox<>();
        jSpinnerprecioU = new javax.swing.JSpinner();
        lbl_PrecioUnitario = new javax.swing.JLabel();
        lbl_unidad = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        lbl_Clasificacion = new javax.swing.JLabel();
        jComboBoxClasificacion = new javax.swing.JComboBox<>();
        jSpinnerStock = new javax.swing.JSpinner();
        lbl_PrecioUnitario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitulo.setBackground(new java.awt.Color(76, 179, 255));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("AGREGAR PRODUCTOS");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanelTitulo.add(jLabelTitulo);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ID_TXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ID_TXT.setText("ID:");
        jPanel1.add(lbl_ID_TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_id.setText("XXX - XXX");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, -1));

        btnGuardar.setBackground(new java.awt.Color(86, 148, 229));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(72, 169, 72));
        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 130, 40));

        lbl_Proveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Proveedor.setText("Proveedor:");
        jPanel1.add(lbl_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jComboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Example1", "Example2" }));
        jPanel1.add(jComboBoxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, -1));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, -1));

        lbl_IVA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_IVA.setText("Iva:");
        jPanel1.add(lbl_IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jComboBoxIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiene IVA", "No tiene IVA" }));
        jPanel1.add(jComboBoxIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, -1));

        jSpinnerprecioU.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerprecioU.setBorder(null);
        jPanel1.add(jSpinnerprecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));

        lbl_PrecioUnitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_PrecioUnitario.setText("Precio Unitario:");
        jPanel1.add(lbl_PrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lbl_unidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_unidad.setText("Unidad:");
        jPanel1.add(lbl_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));
        jPanel1.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 150, -1));

        lbl_Clasificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Clasificacion.setText("Clasificación:");
        jPanel1.add(lbl_Clasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jComboBoxClasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Example1", "Example2" }));
        jPanel1.add(jComboBoxClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 120, -1));

        jSpinnerStock.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerStock.setBorder(null);
        jPanel1.add(jSpinnerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 130, 30));

        lbl_PrecioUnitario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_PrecioUnitario1.setText("Stock:");
        jPanel1.add(lbl_PrecioUnitario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 263, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBoxClasificacion;
    private javax.swing.JComboBox<String> jComboBoxIVA;
    private javax.swing.JComboBox<String> jComboBoxProveedor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JSpinner jSpinnerprecioU;
    private javax.swing.JLabel lbl_Clasificacion;
    private javax.swing.JLabel lbl_ID_TXT;
    private javax.swing.JLabel lbl_IVA;
    private javax.swing.JLabel lbl_PrecioUnitario;
    private javax.swing.JLabel lbl_PrecioUnitario1;
    private javax.swing.JLabel lbl_Proveedor;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_unidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
