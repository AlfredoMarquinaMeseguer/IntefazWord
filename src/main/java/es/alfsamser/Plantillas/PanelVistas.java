/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Plantillas;

/**
 *
 * @author Samu
 */
public class PanelVistas extends javax.swing.JPanel {

    /**
     * Creates new form Plantilla
     */
    public PanelVistas() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        contenido = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bLectura = new javax.swing.JButton();
        bDImpresion = new javax.swing.JButton();
        bDWeb = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bEsquema = new javax.swing.JButton();
        bBorrador = new javax.swing.JButton();
        etiquetaInferior = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        contenido.setLayout(new javax.swing.BoxLayout(contenido, javax.swing.BoxLayout.LINE_AXIS));

        bLectura.setBackground(new java.awt.Color(243, 243, 243));
        bLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vista/LeerMas_1.png"))); // NOI18N
        bLectura.setText("Modo Lectura");
        bLectura.setBorder(null);
        bLectura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bLectura.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bLectura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bDImpresion.setBackground(new java.awt.Color(243, 243, 243));
        bDImpresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vista/DiseñoImpresion.png"))); // NOI18N
        bDImpresion.setText("Diseño de impresión");
        bDImpresion.setBorder(null);
        bDImpresion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDImpresion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bDImpresion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bDWeb.setBackground(new java.awt.Color(243, 243, 243));
        bDWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vista/DiseñoWeb.png"))); // NOI18N
        bDWeb.setText("Diseño Web");
        bDWeb.setBorder(null);
        bDWeb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDWeb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bDWeb.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bLectura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDImpresion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDWeb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLectura)
                    .addComponent(bDImpresion)
                    .addComponent(bDWeb))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        contenido.add(jPanel1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        bEsquema.setBackground(new java.awt.Color(243, 243, 243));
        bEsquema.setText("Esquema");
        jPanel2.add(bEsquema);

        bBorrador.setBackground(new java.awt.Color(243, 243, 243));
        bBorrador.setText("Borrador");
        jPanel2.add(bBorrador);

        contenido.add(jPanel2);

        add(contenido, java.awt.BorderLayout.CENTER);

        etiquetaInferior.setLayout(new java.awt.GridBagLayout());

        etiqueta.setForeground(new java.awt.Color(112, 108, 108));
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Vistas");
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

        add(etiquetaInferior, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrador;
    private javax.swing.JButton bDImpresion;
    private javax.swing.JButton bDWeb;
    private javax.swing.JButton bEsquema;
    private javax.swing.JButton bLectura;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JPanel etiquetaInferior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
