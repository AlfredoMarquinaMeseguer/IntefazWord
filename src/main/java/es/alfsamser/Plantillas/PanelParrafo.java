/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Plantillas;

/**
 *
 * @author Alfre
 */
public class PlantillaLineas extends javax.swing.JPanel {

    /**
     * Creates new form PlantillaLineas
     */
    public PlantillaLineas() {
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

        jLabel9 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        tbOrdenPuntos = new javax.swing.JToggleButton();
        tbOrdenPuntosFlecha = new javax.swing.JToggleButton();
        tbOrdenNumeros = new javax.swing.JToggleButton();
        tbOrdenNumerosFlecha = new javax.swing.JToggleButton();
        bOrdenFormato = new javax.swing.JButton();
        bOrdenFormatoFlecha = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        sangriaIzq = new javax.swing.JButton();
        sangriaDerch = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        bAaZ = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        bMarcasFormato = new javax.swing.JToggleButton();
        jSeparator5 = new javax.swing.JSeparator();
        tbAlineadoIzq = new javax.swing.JToggleButton();
        tbAlineadoCentro = new javax.swing.JToggleButton();
        tbAlineadoDerch = new javax.swing.JToggleButton();
        tbAlineadoJustificado = new javax.swing.JToggleButton();
        jSeparator6 = new javax.swing.JSeparator();
        bInterlineado = new javax.swing.JButton();
        bInterlineadoFlecha = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        bColorFondo = new javax.swing.JButton();
        bColorFondoFlecha = new javax.swing.JButton();
        bLineaBorde = new javax.swing.JButton();
        bLineaBordeFlecha = new javax.swing.JButton();
        etiquetaInferior = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();
        bIcono = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setMinimumSize(new java.awt.Dimension(254, 120));
        setPreferredSize(new java.awt.Dimension(254, 120));
        setLayout(new java.awt.BorderLayout());

        contenido.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 20));

        tbOrdenPuntos.setBackground(new java.awt.Color(242, 242, 242));
        tbOrdenPuntos.setText("a");
        tbOrdenPuntos.setBorderPainted(false);
        tbOrdenPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbOrdenPuntosActionPerformed(evt);
            }
        });
        contenido.add(tbOrdenPuntos);

        tbOrdenPuntosFlecha.setBackground(new java.awt.Color(242, 242, 242));
        tbOrdenPuntosFlecha.setText("˅");
        tbOrdenPuntosFlecha.setBorderPainted(false);
        contenido.add(tbOrdenPuntosFlecha);

        tbOrdenNumeros.setBackground(new java.awt.Color(242, 242, 242));
        tbOrdenNumeros.setText("1");
        tbOrdenNumeros.setBorderPainted(false);
        tbOrdenNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbOrdenNumerosActionPerformed(evt);
            }
        });
        contenido.add(tbOrdenNumeros);

        tbOrdenNumerosFlecha.setBackground(new java.awt.Color(242, 242, 242));
        tbOrdenNumerosFlecha.setText("˅");
        tbOrdenNumerosFlecha.setBorderPainted(false);
        contenido.add(tbOrdenNumerosFlecha);

        bOrdenFormato.setBackground(new java.awt.Color(242, 242, 242));
        bOrdenFormato.setText("f");
        bOrdenFormato.setBorderPainted(false);
        contenido.add(bOrdenFormato);

        bOrdenFormatoFlecha.setBackground(new java.awt.Color(242, 242, 242));
        bOrdenFormatoFlecha.setText("˅");
        bOrdenFormatoFlecha.setBorderPainted(false);
        contenido.add(bOrdenFormatoFlecha);

        jSeparator2.setBackground(new java.awt.Color(255, 102, 51));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMinimumSize(new java.awt.Dimension(3, 15));
        jSeparator2.setPreferredSize(new java.awt.Dimension(3, 15));
        contenido.add(jSeparator2);

        sangriaIzq.setBackground(new java.awt.Color(242, 242, 242));
        sangriaIzq.setText("<");
        sangriaIzq.setBorderPainted(false);
        contenido.add(sangriaIzq);

        sangriaDerch.setBackground(new java.awt.Color(242, 242, 242));
        sangriaDerch.setText(">");
        sangriaDerch.setBorderPainted(false);
        contenido.add(sangriaDerch);

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setMinimumSize(new java.awt.Dimension(3, 15));
        jSeparator3.setPreferredSize(new java.awt.Dimension(3, 15));
        contenido.add(jSeparator3);

        bAaZ.setBackground(new java.awt.Color(242, 242, 242));
        bAaZ.setText("A");
        bAaZ.setBorderPainted(false);
        contenido.add(bAaZ);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        contenido.add(jSeparator4);

        bMarcasFormato.setBackground(new java.awt.Color(242, 242, 242));
        bMarcasFormato.setText("]");
        bMarcasFormato.setBorderPainted(false);
        contenido.add(bMarcasFormato);

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setMinimumSize(new java.awt.Dimension(3, 15));
        jSeparator5.setPreferredSize(new java.awt.Dimension(3, 15));
        contenido.add(jSeparator5);

        tbAlineadoIzq.setBackground(new java.awt.Color(242, 242, 242));
        tbAlineadoIzq.setText("I");
        tbAlineadoIzq.setBorderPainted(false);
        contenido.add(tbAlineadoIzq);

        tbAlineadoCentro.setBackground(new java.awt.Color(242, 242, 242));
        tbAlineadoCentro.setText("C");
        tbAlineadoCentro.setBorderPainted(false);
        contenido.add(tbAlineadoCentro);

        tbAlineadoDerch.setBackground(new java.awt.Color(242, 242, 242));
        tbAlineadoDerch.setText("D");
        tbAlineadoDerch.setBorderPainted(false);
        contenido.add(tbAlineadoDerch);

        tbAlineadoJustificado.setBackground(new java.awt.Color(242, 242, 242));
        tbAlineadoJustificado.setText("J");
        tbAlineadoJustificado.setBorderPainted(false);
        contenido.add(tbAlineadoJustificado);

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setMinimumSize(new java.awt.Dimension(3, 15));
        jSeparator6.setPreferredSize(new java.awt.Dimension(3, 15));
        contenido.add(jSeparator6);

        bInterlineado.setBackground(new java.awt.Color(242, 242, 242));
        bInterlineado.setText("↨");
        bInterlineado.setBorderPainted(false);
        contenido.add(bInterlineado);

        bInterlineadoFlecha.setBackground(new java.awt.Color(242, 242, 242));
        bInterlineadoFlecha.setText("˅");
        bInterlineadoFlecha.setBorderPainted(false);
        contenido.add(bInterlineadoFlecha);

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setMinimumSize(new java.awt.Dimension(3, 15));
        jSeparator7.setPreferredSize(new java.awt.Dimension(3, 15));
        contenido.add(jSeparator7);

        bColorFondo.setBackground(new java.awt.Color(242, 242, 242));
        bColorFondo.setText("C");
        bColorFondo.setBorderPainted(false);
        contenido.add(bColorFondo);

        bColorFondoFlecha.setBackground(new java.awt.Color(242, 242, 242));
        bColorFondoFlecha.setText("˅");
        bColorFondoFlecha.setBorderPainted(false);
        contenido.add(bColorFondoFlecha);

        bLineaBorde.setBackground(new java.awt.Color(242, 242, 242));
        bLineaBorde.setText("C");
        bLineaBorde.setBorderPainted(false);
        contenido.add(bLineaBorde);

        bLineaBordeFlecha.setBackground(new java.awt.Color(242, 242, 242));
        bLineaBordeFlecha.setText("˅");
        bLineaBordeFlecha.setBorderPainted(false);
        bLineaBordeFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLineaBordeFlechaActionPerformed(evt);
            }
        });
        contenido.add(bLineaBordeFlecha);

        add(contenido, java.awt.BorderLayout.CENTER);

        etiquetaInferior.setLayout(new java.awt.GridBagLayout());

        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Etiqueta");
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
        bIcono.setText("O");
        bIcono.setBorder(null);
        bIcono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIconoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        etiquetaInferior.add(bIcono, gridBagConstraints);

        add(etiquetaInferior, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void bLineaBordeFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLineaBordeFlechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLineaBordeFlechaActionPerformed

    private void tbOrdenPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbOrdenPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbOrdenPuntosActionPerformed

    private void tbOrdenNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbOrdenNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbOrdenNumerosActionPerformed

    private void bIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIconoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIconoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAaZ;
    private javax.swing.JButton bColorFondo;
    private javax.swing.JButton bColorFondoFlecha;
    private javax.swing.JButton bIcono;
    private javax.swing.JButton bInterlineado;
    private javax.swing.JButton bInterlineadoFlecha;
    private javax.swing.JButton bLineaBorde;
    private javax.swing.JButton bLineaBordeFlecha;
    private javax.swing.JToggleButton bMarcasFormato;
    private javax.swing.JButton bOrdenFormato;
    private javax.swing.JButton bOrdenFormatoFlecha;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JPanel etiquetaInferior;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton sangriaDerch;
    private javax.swing.JButton sangriaIzq;
    private javax.swing.JToggleButton tbAlineadoCentro;
    private javax.swing.JToggleButton tbAlineadoDerch;
    private javax.swing.JToggleButton tbAlineadoIzq;
    private javax.swing.JToggleButton tbAlineadoJustificado;
    private javax.swing.JToggleButton tbOrdenNumeros;
    private javax.swing.JToggleButton tbOrdenNumerosFlecha;
    private javax.swing.JToggleButton tbOrdenPuntos;
    private javax.swing.JToggleButton tbOrdenPuntosFlecha;
    // End of variables declaration//GEN-END:variables
}