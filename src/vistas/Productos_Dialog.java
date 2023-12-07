package vistas;

/**
 *
 * @author Angel
 */
public class Productos_Dialog extends javax.swing.JFrame {

    public Productos_Dialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_ID_TXT = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 150, -1));

        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono.setText("ID CLASIFICACIÓN: ");
        jPanel1.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        lbl_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sexo.setText("Proveedor:");
        jPanel1.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(86, 148, 229));
        btnAceptar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Guardar");
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(72, 169, 72));
        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 130, 40));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Example1", "Example2" }));
        jPanel1.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 120, -1));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_id.setText("XXX - XXX");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, -1));

        lbl_nombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre2.setText("Nombre:");
        jPanel1.add(lbl_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jComboBoxSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiene IVA", "No tiene IVA" }));
        jPanel1.add(jComboBoxSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, -1));

        lbl_sexo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sexo1.setText("Iva:");
        jPanel1.add(lbl_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jSpinnerPrecioU.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerPrecioU.setBorder(null);
        jPanel1.add(jSpinnerPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, 30));

        lbl_telefono1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono1.setText("Precio Unitario:");
        jPanel1.add(lbl_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, -1));

        lbl_telefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono2.setText("Unidad:");
        jPanel1.add(lbl_telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 150, -1));
        jPanel1.add(txtNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, -1));

        lbl_telefono3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono3.setText("ID PROVEEDOR: ");
        jPanel1.add(lbl_telefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxSexo1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSpinner jSpinnerPrecioU;
    private javax.swing.JLabel lbl_ID_TXT;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nombre2;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sexo1;
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
