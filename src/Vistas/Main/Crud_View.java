package Vistas.Main;

import javax.swing.JLabel;

public class Crud_View extends javax.swing.JPanel {

    public Crud_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt_Buscar = new javax.swing.JLabel();
        lblAlertaResultado = new javax.swing.JLabel();
        jtextfield_Buscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();

        setBackground(new java.awt.Color(241, 241, 241));
        setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        txt_Buscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txt_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        txt_Buscar.setText("Buscar");

        lblAlertaResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblAlertaResultado.setText("No hay coincidencias");

        btnBuscar.setText("Buscar");

        btnCrear.setBackground(new java.awt.Color(255, 51, 51));
        btnCrear.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txt_Buscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAlertaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(483, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtextfield_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAlertaResultado)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jtextfield_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Buscar)
                    .addComponent(btnCrear))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        TABLE.setBorder(new javax.swing.border.MatteBorder(null));
        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "STOCK", "PRECIO UNITARIO", "UNIDAD", "ID PROV", "IVA"
            }
        ));
        jScrollPane1.setViewportView(TABLE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLE;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtextfield_Buscar;
    private javax.swing.JLabel lblAlertaResultado;
    private javax.swing.JLabel txt_Buscar;
    // End of variables declaration//GEN-END:variables
}
