package vistas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RItemFactura_View extends javax.swing.JFrame {

    public RItemFactura_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabelidrol = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblmensajeerror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboiva = new javax.swing.JComboBox<>();
        txtrol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jlabelidcompetencia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombrecompe1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jlabelidrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, 30));

        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
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
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 130, 40));

        jLabel9.setText("Rol:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 130, 40));

        jLabel11.setText("ID ROL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jComboiva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jPanel1.add(jComboiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, -1));
        jPanel1.add(txtrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 169, -1));

        jLabel10.setText("Nombre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, -1));
        jPanel1.add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 169, -1));

        jLabel12.setText("ID Competencia");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(jlabelidcompetencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 100, 30));

        jLabel7.setText("Descripcion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel1.add(txtnombrecompe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 169, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

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

    public JLabel getJlabelidrol() {
        return jlabelidrol;
    }

    public void setJlabelidrol(JLabel jlabelidrol) {
        this.jlabelidrol = jlabelidrol;
    }

    public JLabel getLblmensajeerror() {
        return lblmensajeerror;
    }

    public void setLblmensajeerror(JLabel lblmensajeerror) {
        this.lblmensajeerror = lblmensajeerror;
    }

    public JTextField getTxtrol() {
        return txtrol;
    }

    public void setTxtrol(JTextField txtrol) {
        this.txtrol = txtrol;
    }

    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboiva;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelidcompetencia;
    private javax.swing.JLabel jlabelidrol;
    private javax.swing.JLabel lblmensajeerror;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtnombrecompe1;
    private javax.swing.JTextField txtrol;
    // End of variables declaration//GEN-END:variables
}
