package vistas;

import com.toedter.components.JSpinField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RevisionProductos_Voew extends javax.swing.JFrame {

    public RevisionProductos_Voew() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabelidproducto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtprecioU = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblmensajeerror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JSpinnercantidad = new com.toedter.components.JSpinField();
        jComboCateg = new javax.swing.JComboBox<>();
        jComboiva = new javax.swing.JComboBox<>();
        jComboProveedor = new javax.swing.JComboBox<>();
        jLabelsubtotal = new javax.swing.JLabel();
        JSpinnerStock = new com.toedter.components.JSpinField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jlabelidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 100, 30));

        jLabel3.setText("Stock");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("Unidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, -1));

        jLabel5.setText("Proveedor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, -1));

        jLabel6.setText("IVA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel8.setText("Categoria:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel1.add(txtprecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 169, -1));
        jPanel1.add(lblmensajeerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 503, 320, -1));

        jPanel2.setBackground(new java.awt.Color(158, 200, 229));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REVISAR PRODUCTOS");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanel2.add(jLabelTitulo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        btnRegistrar.setBackground(new java.awt.Color(72, 169, 72));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Continuar");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, 40));

        jLabel9.setText("Precio U:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 59, -1));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 130, 40));

        jLabel11.setText("ID Producto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(JSpinnercantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jPanel1.add(jComboCateg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 160, -1));

        jPanel1.add(jComboiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 160, -1));

        jPanel1.add(jComboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 160, -1));
        jPanel1.add(jLabelsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 80, 20));
        jPanel1.add(JSpinnerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, -1));

        jLabel12.setText("Subtotal: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 80, -1));

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


    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JSpinField getJSpinnercantidad() {
        return JSpinnercantidad;
    }

    public void setJSpinnercantidad(JSpinField JSpinnercantidad) {
        this.JSpinnercantidad = JSpinnercantidad;
    }

    public JLabel getjLabelsubtotal() {
        return jLabelsubtotal;
    }

    public void setjLabelsubtotal(JLabel jLabelsubtotal) {
        this.jLabelsubtotal = jLabelsubtotal;
    }

   

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JComboBox<String> getjComboCateg() {
        return jComboCateg;
    }

    public void setjComboCateg(JComboBox<String> jComboCateg) {
        this.jComboCateg = jComboCateg;
    }

    public JComboBox<String> getjComboProveedor() {
        return jComboProveedor;
    }

    public void setjComboProveedor(JComboBox<String> jComboProveedor) {
        this.jComboProveedor = jComboProveedor;
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

    public JSpinField getJSpinnerStock() {
        return JSpinnercantidad;
    }

    public void setJSpinnerStock(JSpinField JSpinnerStock) {
        this.JSpinnercantidad = JSpinnerStock;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtprecioU() {
        return txtprecioU;
    }

    public void setTxtprecioU(JTextField txtprecioU) {
        this.txtprecioU = txtprecioU;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.components.JSpinField JSpinnerStock;
    private com.toedter.components.JSpinField JSpinnercantidad;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboCateg;
    private javax.swing.JComboBox<String> jComboProveedor;
    private javax.swing.JComboBox<String> jComboiva;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelsubtotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelidproducto;
    private javax.swing.JLabel lblmensajeerror;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtprecioU;
    // End of variables declaration//GEN-END:variables
}
