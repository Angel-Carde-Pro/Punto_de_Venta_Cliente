package vistas;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class RFacturas_view extends javax.swing.JFrame {

    public RFacturas_view() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        lblmensajeerror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jlabeltotal = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jlabelidpersona = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtdescuento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        btnbuscarproducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPROD = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jlabelidfactura1 = new javax.swing.JLabel();
        btnbuscarpersona = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ruc");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setText("ID Persona");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Productos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        jLabel8.setText("Descuento: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, -1, -1));
        jPanel1.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 240, -1));
        jPanel1.add(lblmensajeerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 503, 320, -1));

        jPanel2.setBackground(new java.awt.Color(158, 200, 229));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanel2.add(jLabelTitulo);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        btnRegistrar.setBackground(new java.awt.Color(72, 169, 72));
        btnRegistrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Crear Factura");
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 160, 40));

        jLabel9.setText("Fecha:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 59, -1));

        jlabeltotal.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jPanel1.add(jlabeltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 160, 30));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 130, 40));
        jPanel1.add(jlabelidpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 120, 20));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));
        jPanel1.add(txtdescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 160, -1));

        jLabel11.setText("Total:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, -1, -1));

        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel1.add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, -1));

        btnbuscarproducto.setText("Buscar");
        jPanel1.add(btnbuscarproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        tblPROD.setBorder(new javax.swing.border.MatteBorder(null));
        tblPROD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Precio U", "Unidad", "IVA", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tblPROD);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 860, 250));

        jLabel5.setText("ID Factura");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(jlabelidfactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 20));

        btnbuscarpersona.setText("Buscar");
        jPanel1.add(btnbuscarpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
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

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JButton getBtnbuscarpersona() {
        return btnbuscarpersona;
    }

    public void setBtnbuscarpersona(JButton btnbuscarpersona) {
        this.btnbuscarpersona = btnbuscarpersona;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JButton getBtnbuscarproducto() {
        return btnbuscarproducto;
    }

    public void setBtnbuscarproducto(JButton btnbuscarproducto) {
        this.btnbuscarproducto = btnbuscarproducto;
    }

    public JLabel getJlabelidfactura1() {
        return jlabelidfactura1;
    }

    public void setJlabelidfactura1(JLabel jlabelidfactura1) {
        this.jlabelidfactura1 = jlabelidfactura1;
    }

    public JLabel getJlabelidpersona() {
        return jlabelidpersona;
    }

    public void setJlabelidpersona(JLabel jlabelidpersona) {
        this.jlabelidpersona = jlabelidpersona;
    }

    public JLabel getJlabeltotal() {
        return jlabeltotal;
    }

    public void setJlabeltotal(JLabel jlabeltotal) {
        this.jlabeltotal = jlabeltotal;
    }

    public JLabel getLblmensajeerror() {
        return lblmensajeerror;
    }

    public void setLblmensajeerror(JLabel lblmensajeerror) {
        this.lblmensajeerror = lblmensajeerror;
    }

    public JTable getTblPROD() {
        return tblPROD;
    }

    public void setTblPROD(JTable tblPROD) {
        this.tblPROD = tblPROD;
    }

    public JTextField getTxtdescuento() {
        return txtdescuento;
    }

    public void setTxtdescuento(JTextField txtdescuento) {
        this.txtdescuento = txtdescuento;
    }

    public JTextField getTxtidproducto() {
        return txtidproducto;
    }

    public void setTxtidproducto(JTextField txtidproducto) {
        this.txtidproducto = txtidproducto;
    }

    public JTextField getTxtruc() {
        return txtruc;
    }

    public void setTxtruc(JTextField txtruc) {
        this.txtruc = txtruc;
    }


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnbuscarpersona;
    private javax.swing.JButton btnbuscarproducto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelidfactura1;
    private javax.swing.JLabel jlabelidpersona;
    private javax.swing.JLabel jlabeltotal;
    private javax.swing.JLabel lblmensajeerror;
    private javax.swing.JTable tblPROD;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
}
