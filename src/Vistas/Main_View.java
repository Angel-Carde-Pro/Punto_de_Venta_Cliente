package Vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ANGEL CARDENAS
 */
public class Main_View extends javax.swing.JFrame {

    public Main_View() {
        initComponents();
    }

    public JPanel getContent() {
        return Content;
    }

    public void setContent(JPanel Content) {
        this.Content = Content;
    }

    public JLabel getImagenAnimales() {
        return ImagenAnimales;
    }

    public void setImagenAnimales(JLabel ImagenAnimales) {
        this.ImagenAnimales = ImagenAnimales;
    }

    public JLabel getMensajeNuestrosClientes() {
        return MensajeNuestrosClientes;
    }

    public void setMensajeNuestrosClientes(JLabel MensajeNuestrosClientes) {
        this.MensajeNuestrosClientes = MensajeNuestrosClientes;
    }

    public JLabel getMensajeNuestrosClientes1() {
        return MensajeNuestrosClientes1;
    }

    public void setMensajeNuestrosClientes1(JLabel MensajeNuestrosClientes1) {
        this.MensajeNuestrosClientes1 = MensajeNuestrosClientes1;
    }

    public JPanel getMenu() {
        return Menu;
    }

    public void setMenu(JPanel Menu) {
        this.Menu = Menu;
    }

    public JLabel getSalir() {
        return Salir;
    }

    public void setSalir(JLabel Salir) {
        this.Salir = Salir;
    }

    public JPanel getExitBtn() {
        return exitBtn;
    }

    public void setExitBtn(JPanel exitBtn) {
        this.exitBtn = exitBtn;
    }

    public JPanel getHeader() {
        return header;
    }

    public void setHeader(JPanel header) {
        this.header = header;
    }

    public JLabel getImageUser() {
        return imageUser;
    }

    public void setImageUser(JLabel imageUser) {
        this.imageUser = imageUser;
    }

    public JLabel getjLabelNombreUsu() {
        return jLabelNombreUsu;
    }

    public void setjLabelNombreUsu(JLabel jLabelNombreUsu) {
        this.jLabelNombreUsu = jLabelNombreUsu;
    }

    public JLabel getjLabelRegistro() {
        return jLabelRegistro;
    }

    public void setjLabelRegistro(JLabel jLabelRegistro) {
        this.jLabelRegistro = jLabelRegistro;
    }

    public JPanel getjPanel_container() {
        return jPanel_container;
    }

    public void setjPanel_container(JPanel jPanel_container) {
        this.jPanel_container = jPanel_container;
    }

    public JPanel getjPanel_logoANDname() {
        return jPanel_logoANDname;
    }

    public void setjPanel_logoANDname(JPanel jPanel_logoANDname) {
        this.jPanel_logoANDname = jPanel_logoANDname;
    }

    public JLabel getJlabelAdministracion() {
        return jlabelAdministracion;
    }

    public void setJlabelAdministracion(JLabel jlabelAdministracion) {
        this.jlabelAdministracion = jlabelAdministracion;
    }

    public JLabel getJlabelCerrarSesiion() {
        return jlabelCerrarSesiion;
    }

    public void setJlabelCerrarSesiion(JLabel jlabelCerrarSesiion) {
        this.jlabelCerrarSesiion = jlabelCerrarSesiion;
    }

    public JLabel getJlabelHomeIcon() {
        return jlabelHomeIcon;
    }

    public void setJlabelHomeIcon(JLabel jlabelHomeIcon) {
        this.jlabelHomeIcon = jlabelHomeIcon;
    }

    public JLabel getJlabelVentas() {
        return jlabelVentas;
    }

    public void setJlabelVentas(JLabel jlabelVentas) {
        this.jlabelVentas = jlabelVentas;
    }

    public JLabel getJlabelVentas1() {
        return jlabelVentas1;
    }

    public void setJlabelVentas1(JLabel jlabelVentas1) {
        this.jlabelVentas1 = jlabelVentas1;
    }

    public JLabel getJtxtTituloMenu() {
        return jtxtTituloMenu;
    }

    public void setJtxtTituloMenu(JLabel jtxtTituloMenu) {
        this.jtxtTituloMenu = jtxtTituloMenu;
    }

    public JPanel getMinimizarBtn() {
        return minimizarBtn;
    }

    public void setMinimizarBtn(JPanel minimizarBtn) {
        this.minimizarBtn = minimizarBtn;
    }

    public JLabel getMinimizarlabel() {
        return minimizarlabel;
    }

    public void setMinimizarlabel(JLabel minimizarlabel) {
        this.minimizarlabel = minimizarlabel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_container = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        minimizarBtn = new javax.swing.JPanel();
        minimizarlabel = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        jtxtTituloMenu = new javax.swing.JLabel();
        ImagenAnimales = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jPanel_logoANDname = new javax.swing.JPanel();
        imageUser = new javax.swing.JLabel();
        jLabelNombreUsu = new javax.swing.JLabel();
        MensajeNuestrosClientes = new javax.swing.JLabel();
        MensajeNuestrosClientes1 = new javax.swing.JLabel();
        jlabelHomeIcon = new javax.swing.JLabel();
        jLabelRegistro = new javax.swing.JLabel();
        jlabelAdministracion = new javax.swing.JLabel();
        jlabelVentas = new javax.swing.JLabel();
        jlabelCerrarSesiion = new javax.swing.JLabel();
        jlabelVentas1 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        minimizarBtn.setBackground(new java.awt.Color(255, 255, 255));

        minimizarlabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        minimizarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizarlabel.setText("-");
        minimizarlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizarlabel.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout minimizarBtnLayout = new javax.swing.GroupLayout(minimizarBtn);
        minimizarBtn.setLayout(minimizarBtnLayout);
        minimizarBtnLayout.setHorizontalGroup(
            minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(minimizarlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
        );
        minimizarBtnLayout.setVerticalGroup(
            minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minimizarBtnLayout.createSequentialGroup()
                    .addComponent(minimizarlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        Salir.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("X");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Salir.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jtxtTituloMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtTituloMenu.setForeground(new java.awt.Color(204, 0, 51));
        jtxtTituloMenu.setText("Dashboard");

        ImagenAnimales.setBackground(new java.awt.Color(255, 255, 255));
        ImagenAnimales.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ImagenAnimales.setForeground(new java.awt.Color(255, 255, 255));
        ImagenAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagina-de-inicio.png"))); // NOI18N
        ImagenAnimales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImagenAnimales.setOpaque(true);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ImagenAnimales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtTituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                    .addGap(0, 1024, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                    .addContainerGap(963, Short.MAX_VALUE)
                    .addComponent(minimizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtTituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addComponent(minimizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        jPanel_container.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1, 1090, 70));

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_logoANDname.setBackground(new java.awt.Color(0, 0, 0));

        imageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin(1).png"))); // NOI18N
        imageUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelNombreUsu.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelNombreUsu.setForeground(new java.awt.Color(255, 255, 0));
        jLabelNombreUsu.setText("Angel");

        MensajeNuestrosClientes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        MensajeNuestrosClientes.setForeground(new java.awt.Color(255, 255, 255));
        MensajeNuestrosClientes.setText("SISTEMA DE");
        MensajeNuestrosClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MensajeNuestrosClientes1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        MensajeNuestrosClientes1.setForeground(new java.awt.Color(255, 255, 255));
        MensajeNuestrosClientes1.setText("FACTURACIÓN");
        MensajeNuestrosClientes1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel_logoANDnameLayout = new javax.swing.GroupLayout(jPanel_logoANDname);
        jPanel_logoANDname.setLayout(jPanel_logoANDnameLayout);
        jPanel_logoANDnameLayout.setHorizontalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MensajeNuestrosClientes1)
                    .addComponent(MensajeNuestrosClientes))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_logoANDnameLayout.setVerticalGroup(
            jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logoANDnameLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_logoANDnameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNombreUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeNuestrosClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeNuestrosClientes1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Menu.add(jPanel_logoANDname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jlabelHomeIcon.setBackground(new java.awt.Color(0, 0, 0));
        jlabelHomeIcon.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlabelHomeIcon.setForeground(new java.awt.Color(255, 255, 255));
        jlabelHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagina-de-inicio.png"))); // NOI18N
        jlabelHomeIcon.setText(" Dashboard");
        jlabelHomeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelHomeIcon.setOpaque(true);
        Menu.add(jlabelHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 179, 166, 40));

        jLabelRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRegistro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registros.png"))); // NOI18N
        jLabelRegistro.setText("Facturas");
        jLabelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistro.setOpaque(true);
        Menu.add(jLabelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 234, 166, 44));

        jlabelAdministracion.setBackground(new java.awt.Color(0, 0, 0));
        jlabelAdministracion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlabelAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jlabelAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos.png"))); // NOI18N
        jlabelAdministracion.setText("Productos");
        jlabelAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelAdministracion.setOpaque(true);
        Menu.add(jlabelAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 296, 165, 44));

        jlabelVentas.setBackground(new java.awt.Color(0, 0, 0));
        jlabelVentas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlabelVentas.setForeground(new java.awt.Color(255, 255, 255));
        jlabelVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AcercaDe.png"))); // NOI18N
        jlabelVentas.setText("Clasificaciones");
        jlabelVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelVentas.setOpaque(true);
        Menu.add(jlabelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 165, 44));

        jlabelCerrarSesiion.setBackground(new java.awt.Color(0, 0, 0));
        jlabelCerrarSesiion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlabelCerrarSesiion.setForeground(new java.awt.Color(255, 255, 255));
        jlabelCerrarSesiion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jlabelCerrarSesiion.setText("  Cerrar Sesion");
        jlabelCerrarSesiion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelCerrarSesiion.setOpaque(true);
        Menu.add(jlabelCerrarSesiion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 165, 44));

        jlabelVentas1.setBackground(new java.awt.Color(0, 0, 0));
        jlabelVentas1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlabelVentas1.setForeground(new java.awt.Color(255, 255, 255));
        jlabelVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas.png"))); // NOI18N
        jlabelVentas1.setText("Proveedores");
        jlabelVentas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelVentas1.setOpaque(true);
        Menu.add(jlabelVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 358, 165, 44));

        jPanel_container.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 650));

        Content.setBackground(new java.awt.Color(236, 236, 236));
        Content.setLayout(new java.awt.BorderLayout());
        jPanel_container.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1090, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, 1307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel ImagenAnimales;
    private javax.swing.JLabel MensajeNuestrosClientes;
    private javax.swing.JLabel MensajeNuestrosClientes1;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Salir;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imageUser;
    private javax.swing.JLabel jLabelNombreUsu;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JPanel jPanel_logoANDname;
    private javax.swing.JLabel jlabelAdministracion;
    private javax.swing.JLabel jlabelCerrarSesiion;
    private javax.swing.JLabel jlabelHomeIcon;
    private javax.swing.JLabel jlabelVentas;
    private javax.swing.JLabel jlabelVentas1;
    private javax.swing.JLabel jtxtTituloMenu;
    private javax.swing.JPanel minimizarBtn;
    private javax.swing.JLabel minimizarlabel;
    // End of variables declaration//GEN-END:variables
}
