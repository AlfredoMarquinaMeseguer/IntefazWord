/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Plantillas;

/**
 *
 * @author Alfre
 */
public class Carta extends javax.swing.JPanel {

    /**
     * Creates new form Carta
     */
    public Carta() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelPortapapeles1 = new es.alfsamser.Plantillas.PanelPortapapeles();
        jSeparator1 = new javax.swing.JSeparator();
        panelFuente1 = new es.alfsamser.Plantillas.PanelFuente();
        jSeparator2 = new javax.swing.JSeparator();
        panelParrafo1 = new es.alfsamser.Plantillas.PanelParrafo();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setBackground(new java.awt.Color(55, 122, 190));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Archivo");
        jTabbedPane1.addTab("Archivo", jLabel1);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(panelPortapapeles1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setEnabled(false);
        jSeparator1.setMaximumSize(new java.awt.Dimension(10, 80));
        jSeparator1.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator1.setName(""); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(10, 60));
        jSeparator1.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator1);
        jPanel1.add(panelFuente1);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setEnabled(false);
        jSeparator2.setMaximumSize(new java.awt.Dimension(10, 80));
        jSeparator2.setMinimumSize(new java.awt.Dimension(10, 30));
        jSeparator2.setName(""); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(10, 60));
        jSeparator2.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator2);
        jPanel1.add(panelParrafo1);

        jTabbedPane1.addTab("Home", jPanel1);

        add(jTabbedPane1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private es.alfsamser.Plantillas.PanelFuente panelFuente1;
    private es.alfsamser.Plantillas.PanelParrafo panelParrafo1;
    private es.alfsamser.Plantillas.PanelPortapapeles panelPortapapeles1;
    // End of variables declaration//GEN-END:variables
}
