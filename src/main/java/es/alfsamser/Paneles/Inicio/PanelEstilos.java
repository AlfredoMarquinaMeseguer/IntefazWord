/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Paneles.Inicio;

/**
 *
 * @author Samu
 */
public class PanelEstilos extends javax.swing.JPanel {

    /**
     * Creates new form Plantilla
     */
    public PanelEstilos() {
        initComponents();
        bIcono.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        contenido = new javax.swing.JScrollPane();
        jListEstilos = new javax.swing.JList<>();
        etiquetaInferior = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();
        bIcono = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        contenido.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        contenido.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        contenido.setMaximumSize(new java.awt.Dimension(100, 75));
        contenido.setMinimumSize(new java.awt.Dimension(100, 75));
        contenido.setPreferredSize(new java.awt.Dimension(100, 75));

        jListEstilos.setBackground(new java.awt.Color(243, 243, 243));
        jListEstilos.setBorder(null);
        jListEstilos.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jListEstilos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<html><body align=\"center\" style=\"background-color:#FFF\"><p1><font color=#000 size =\"+1\"><h>AaBbCcDd</h></font></p1><br><br><p2><font color=#706c6c size =\"+1\"> ¶ Descripc...</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><p1><font color=#000size =\"+3\"><h size=\"+2\">AaBbCcDd</h></font></p1><br><br><p2><font color=#706c6c size =\"+1\"> ¶ Normal</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><p1><font color=#000 size =\"+1\"><h>AaBbCcDd</h></font></p1><br><br><p2><font color=#706c6c size =\"+1\"> ¶ Párrafo ...</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+1\"><h>AaBbCcDd</h></font></head><br><br><p2><font color=#706c6c size =\"+1\"> ¶ Sin espa...</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+2\"><h><b>AaBbCc</b></h></font></head><br><br><p2><font color=#706c6c size =\"+1\"> Título 1</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+2\"><h><b>AaBbCc</b></h></font></head><br><br><p2><font color=#706c6c size =\"+1\"> Título</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+1\"><h>AaBbCcDd</h></font></head><br><br><p2><font color=#706c6c size =\"+1\"> Subtítulo</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+1\"><h><em>AaBbCcDd</em></h></font></head><br><br><p2><font color=#706c6c size =\"+1\">Énfasis sutil</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+1\"><h><b><em>AaBbCcDd</em></b></h></font></head><br><br><p2><font color=#706c6c size =\"+1\">Énfasis</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#377abe size =\"+1\"><h><em>AaBbCcDd</em></h></font></head><br><br><p2><font color=#706c6c size =\"+1\">Énfasis int...</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+1\"><h><b>AaBbCcDd</b></h></font></head><br><br><p2><font color=#706c6c size =\"+1\">Texto en n...</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font color=#000 size =\"+1\"><h>AaBbCcDd</h></font></head><br><br><p2><font color=#706c6c size =\"+1\">Cita</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font font color=#377abe size =\"+1\"><span style=\"text-decoration:overline\"><u><h><em>AaBbCcDd</em></h></u></span></font></head><br><br><p2><font color=#706c6c size =\"+1\">Cita desta...</font></p2></body></html>", "<html><body align=\"center\" style=\"background-color:#FFF\"><head><font font color=#000 size =\"+1\"><h><b><em>AaBbCcDd</em></b></h></font></head><br><br><p2><font color=#706c6c size =\"+1\">Título del...</font></p2></body></html>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListEstilos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListEstilos.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jListEstilos.setOpaque(false);
        jListEstilos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jListEstilos.setVisibleRowCount(1);
        contenido.setViewportView(jListEstilos);

        add(contenido, java.awt.BorderLayout.PAGE_START);

        etiquetaInferior.setMaximumSize(new java.awt.Dimension(213, 15));
        etiquetaInferior.setMinimumSize(new java.awt.Dimension(213, 15));
        etiquetaInferior.setName(""); // NOI18N
        etiquetaInferior.setLayout(new java.awt.GridBagLayout());

        etiqueta.setForeground(new java.awt.Color(112, 108, 108));
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Estilos");
        etiqueta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        etiqueta.setFocusable(false);
        etiqueta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        etiqueta.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.weightx = 1.0;
        etiquetaInferior.add(etiqueta, gridBagConstraints);

        bIcono.setBackground(new java.awt.Color(242, 242, 242));
        bIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaInferiorIzq8.png"))); // NOI18N
        bIcono.setBorder(null);
        bIcono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        etiquetaInferior.add(bIcono, gridBagConstraints);

        add(etiquetaInferior, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIcono;
    private javax.swing.JScrollPane contenido;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JPanel etiquetaInferior;
    private javax.swing.JList<String> jListEstilos;
    // End of variables declaration//GEN-END:variables
}
