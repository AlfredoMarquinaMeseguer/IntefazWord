/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Paneles.Inicio;

/**
 *
 * @author Alfre
 */
public class PanelPortapapeles extends javax.swing.JPanel {

    /**
     * Creates new form Plantilla
     */
    public PanelPortapapeles() {
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

        contenido = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        etiquetaInferior = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();
        bIcono = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        contenido.setBackground(new java.awt.Color(241, 241, 241));
        contenido.setOpaque(false);
        contenido.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(241, 241, 241));
        jButton1.setForeground(new java.awt.Color(112, 108, 108));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Portapapeles/Pegar36x36.png"))); // NOI18N
        jButton1.setText("Pegar");
        jButton1.setBorder(null);
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        contenido.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(241, 241, 241));
        jButton2.setForeground(new java.awt.Color(112, 108, 108));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Portapapeles/cortar18x18.png"))); // NOI18N
        jButton2.setText("Cortar");
        jButton2.setBorder(null);
        jButton2.setEnabled(false);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        contenido.add(jButton2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(241, 241, 241));
        jButton3.setForeground(new java.awt.Color(112, 108, 108));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Portapapeles/copiar18x18.png"))); // NOI18N
        jButton3.setText("Copiar");
        jButton3.setBorder(null);
        jButton3.setEnabled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        contenido.add(jButton3, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(241, 241, 241));
        jButton4.setForeground(new java.awt.Color(112, 108, 108));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Portapapeles/copiarFormato18x18.png"))); // NOI18N
        jButton4.setText("Copiar formato");
        jButton4.setBorder(null);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        contenido.add(jButton4, gridBagConstraints);

        add(contenido, java.awt.BorderLayout.CENTER);

        etiquetaInferior.setBackground(new java.awt.Color(241, 241, 241));
        etiquetaInferior.setOpaque(false);
        etiquetaInferior.setLayout(new java.awt.GridBagLayout());

        etiqueta.setBackground(new java.awt.Color(241, 241, 241));
        etiqueta.setForeground(new java.awt.Color(112, 108, 108));
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Portapapeles");
        etiqueta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        etiqueta.setFocusable(false);
        etiqueta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        etiqueta.setOpaque(true);
        etiqueta.setPreferredSize(new java.awt.Dimension(200, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.weightx = 1.0;
        etiquetaInferior.add(etiqueta, gridBagConstraints);

        bIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaInferiorIzq8.png"))); // NOI18N
        bIcono.setBorder(null);
        bIcono.setContentAreaFilled(false);
        bIcono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bIcono.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        etiquetaInferior.add(bIcono, gridBagConstraints);

        add(etiquetaInferior, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIcono;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JPanel etiquetaInferior;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
