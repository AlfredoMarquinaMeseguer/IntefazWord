/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Paneles;

/**
 *
 * @author Alfre
 */
public class PanelSuperior extends javax.swing.JPanel {

    /**
     * Creates new form Carta
     */
    public PanelSuperior() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        lArchivo = new javax.swing.JLabel();
        pHome = new javax.swing.JPanel();
        panelPortapapeles1 = new es.alfsamser.Paneles.Inicio.PanelPortapapeles();
        jSeparator1 = new javax.swing.JSeparator();
        panelFuente1 = new es.alfsamser.Paneles.Inicio.PanelFuente();
        jSeparator2 = new javax.swing.JSeparator();
        panelParrafo2 = new es.alfsamser.Paneles.Inicio.PanelParrafo();
        jSeparator3 = new javax.swing.JSeparator();
        panelEditar1 = new es.alfsamser.Paneles.Inicio.PanelEditar();
        lInsertar = new javax.swing.JLabel();
        lDiseño = new javax.swing.JLabel();
        lDisposicion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pVista = new javax.swing.JPanel();
        panelVistas1 = new es.alfsamser.Paneles.Vista.PanelVistas();
        jSeparator4 = new javax.swing.JSeparator();
        panelMovimientoPagina1 = new es.alfsamser.Paneles.Vista.PanelMovimientoPagina();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setBackground(new java.awt.Color(55, 122, 190));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        lArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lArchivo.setText("Archivo");
        jTabbedPane1.addTab("Archivo", lArchivo);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0);
        flowLayout1.setAlignOnBaseline(true);
        pHome.setLayout(flowLayout1);

        panelPortapapeles1.setMinimumSize(new java.awt.Dimension(158, 90));
        panelPortapapeles1.setPreferredSize(new java.awt.Dimension(211, 90));
        pHome.add(panelPortapapeles1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setEnabled(false);
        jSeparator1.setMaximumSize(new java.awt.Dimension(10, 90));
        jSeparator1.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator1.setName(""); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(10, 85));
        jSeparator1.setRequestFocusEnabled(false);
        pHome.add(jSeparator1);

        panelFuente1.setMinimumSize(new java.awt.Dimension(297, 90));
        panelFuente1.setPreferredSize(new java.awt.Dimension(280, 90));
        pHome.add(panelFuente1);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setEnabled(false);
        jSeparator2.setMaximumSize(new java.awt.Dimension(10, 90));
        jSeparator2.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator2.setName(""); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(10, 85));
        jSeparator2.setRequestFocusEnabled(false);
        pHome.add(jSeparator2);

        panelParrafo2.setMinimumSize(new java.awt.Dimension(254, 90));
        panelParrafo2.setPreferredSize(new java.awt.Dimension(254, 90));
        pHome.add(panelParrafo2);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setEnabled(false);
        jSeparator3.setMaximumSize(new java.awt.Dimension(10, 90));
        jSeparator3.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator3.setName(""); // NOI18N
        jSeparator3.setPreferredSize(new java.awt.Dimension(10, 85));
        jSeparator3.setRequestFocusEnabled(false);
        pHome.add(jSeparator3);
        pHome.add(panelEditar1);

        jTabbedPane1.addTab("Inicio", pHome);

        lInsertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInsertar.setText("Insertar");
        jTabbedPane1.addTab("Insertar", lInsertar);

        lDiseño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDiseño.setText("Diseño");
        jTabbedPane1.addTab("Diseño", lDiseño);

        lDisposicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDisposicion.setText("Disposición");
        jTabbedPane1.addTab("Disposición", lDisposicion);

        jLabel3.setText("jLabel3");
        jTabbedPane1.addTab("Referencias", jLabel3);

        jLabel4.setText("jLabel4");
        jTabbedPane1.addTab("Correspondecias", jLabel4);

        jLabel5.setText("jLabel5");
        jTabbedPane1.addTab("Revisar", jLabel5);

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0);
        flowLayout2.setAlignOnBaseline(true);
        pVista.setLayout(flowLayout2);

        panelVistas1.setPreferredSize(new java.awt.Dimension(200, 90));
        pVista.add(panelVistas1);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setEnabled(false);
        jSeparator4.setMaximumSize(new java.awt.Dimension(10, 90));
        jSeparator4.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator4.setName(""); // NOI18N
        jSeparator4.setPreferredSize(new java.awt.Dimension(10, 85));
        jSeparator4.setRequestFocusEnabled(false);
        pVista.add(jSeparator4);

        panelMovimientoPagina1.setPreferredSize(new java.awt.Dimension(125, 89));
        pVista.add(panelMovimientoPagina1);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setEnabled(false);
        jSeparator5.setMaximumSize(new java.awt.Dimension(10, 90));
        jSeparator5.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator5.setName(""); // NOI18N
        jSeparator5.setPreferredSize(new java.awt.Dimension(10, 85));
        jSeparator5.setRequestFocusEnabled(false);
        pVista.add(jSeparator5);

        jLabel7.setText("Mostrar");
        pVista.add(jLabel7);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setEnabled(false);
        jSeparator6.setMaximumSize(new java.awt.Dimension(10, 90));
        jSeparator6.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator6.setName(""); // NOI18N
        jSeparator6.setPreferredSize(new java.awt.Dimension(10, 85));
        jSeparator6.setRequestFocusEnabled(false);
        pVista.add(jSeparator6);

        jTabbedPane1.addTab("Vista", pVista);

        add(jTabbedPane1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lArchivo;
    private javax.swing.JLabel lDiseño;
    private javax.swing.JLabel lDisposicion;
    private javax.swing.JLabel lInsertar;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pVista;
    private es.alfsamser.Paneles.Inicio.PanelEditar panelEditar1;
    private es.alfsamser.Paneles.Inicio.PanelFuente panelFuente1;
    private es.alfsamser.Paneles.Vista.PanelMovimientoPagina panelMovimientoPagina1;
    private es.alfsamser.Paneles.Inicio.PanelParrafo panelParrafo2;
    private es.alfsamser.Paneles.Inicio.PanelPortapapeles panelPortapapeles1;
    private es.alfsamser.Paneles.Vista.PanelVistas panelVistas1;
    // End of variables declaration//GEN-END:variables
}
