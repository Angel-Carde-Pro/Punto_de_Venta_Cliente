package vistas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Main_View extends javax.swing.JFrame {

    public Main_View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOpcionesAdministracion = new javax.swing.JPanel();
        jButtonFac = new javax.swing.JPanel();
        tituloCa5 = new javax.swing.JLabel();
        jLabelHabitadsFoto = new javax.swing.JLabel();
        infoHabitadstxt = new javax.swing.JLabel();
        jButtonRProductos = new javax.swing.JPanel();
        txtRPERSONAL = new javax.swing.JLabel();
        jlabelRPersonal = new javax.swing.JLabel();
        jlbalePersonaltxt = new javax.swing.JLabel();
        jTexttitle = new javax.swing.JLabel();
        jTextsubTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelOpcionesAdministracion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOpcionesAdministracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonFac.setBackground(new java.awt.Color(247, 247, 247));
        jButtonFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCa5.setBackground(new java.awt.Color(255, 51, 51));
        tituloCa5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tituloCa5.setForeground(new java.awt.Color(255, 255, 255));
        tituloCa5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCa5.setText("FACTURAS");
        tituloCa5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tituloCa5.setFocusable(false);
        tituloCa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tituloCa5.setOpaque(true);
        jButtonFac.add(tituloCa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 34));

        jLabelHabitadsFoto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHabitadsFoto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelHabitadsFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHabitadsFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHabitadsFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/facturas.png"))); // NOI18N
        jLabelHabitadsFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHabitadsFoto.setOpaque(true);
        jButtonFac.add(jLabelHabitadsFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 130));

        infoHabitadstxt.setBackground(new java.awt.Color(0, 0, 0));
        infoHabitadstxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoHabitadstxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoHabitadstxt.setText("Registro y consultas de facturas");
        jButtonFac.add(infoHabitadstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 176, 240, 32));

        jPanelOpcionesAdministracion.add(jButtonFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 240, 210));

        jButtonRProductos.setBackground(new java.awt.Color(247, 247, 247));
        jButtonRProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRPERSONAL.setBackground(new java.awt.Color(255, 153, 102));
        txtRPERSONAL.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtRPERSONAL.setForeground(new java.awt.Color(255, 255, 255));
        txtRPERSONAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRPERSONAL.setText("Productos");
        txtRPERSONAL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRPERSONAL.setFocusable(false);
        txtRPERSONAL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtRPERSONAL.setOpaque(true);
        jButtonRProductos.add(txtRPERSONAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 34));

        jlabelRPersonal.setBackground(new java.awt.Color(255, 255, 255));
        jlabelRPersonal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlabelRPersonal.setForeground(new java.awt.Color(255, 255, 255));
        jlabelRPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelRPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/productos.png"))); // NOI18N
        jlabelRPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelRPersonal.setOpaque(true);
        jButtonRProductos.add(jlabelRPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 36, 230, 140));

        jlbalePersonaltxt.setBackground(new java.awt.Color(0, 0, 0));
        jlbalePersonaltxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbalePersonaltxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbalePersonaltxt.setText("Registro, consultas, etc");
        jButtonRProductos.add(jlbalePersonaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 179, 230, 30));

        jPanelOpcionesAdministracion.add(jButtonRProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 230, 210));

        jTexttitle.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jTexttitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTexttitle.setText("Sistema de Facturación");
        jPanelOpcionesAdministracion.add(jTexttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 310, 40));

        jTextsubTitle.setBackground(new java.awt.Color(153, 153, 153));
        jTextsubTitle.setFont(new java.awt.Font("MV Boli", 0, 20)); // NOI18N
        jTextsubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextsubTitle.setText("Por favor, seleccione una opcion");
        jPanelOpcionesAdministracion.add(jTextsubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 410, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 963, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelOpcionesAdministracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelOpcionesAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getjButtonFac() {
        return jButtonFac;
    }

    public void setjButtonFac(JPanel jButtonFac) {
        this.jButtonFac = jButtonFac;
    }

    public JPanel getjButtonRProductos() {
        return jButtonRProductos;
    }

    public void setjButtonRProductos(JPanel jButtonRProductos) {
        this.jButtonRProductos = jButtonRProductos;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoHabitadstxt;
    private javax.swing.JPanel jButtonFac;
    private javax.swing.JPanel jButtonRProductos;
    private javax.swing.JLabel jLabelHabitadsFoto;
    private javax.swing.JPanel jPanelOpcionesAdministracion;
    private javax.swing.JLabel jTextsubTitle;
    private javax.swing.JLabel jTexttitle;
    private javax.swing.JLabel jlabelRPersonal;
    private javax.swing.JLabel jlbalePersonaltxt;
    private javax.swing.JLabel tituloCa5;
    private javax.swing.JLabel txtRPERSONAL;
    // End of variables declaration//GEN-END:variables
}
