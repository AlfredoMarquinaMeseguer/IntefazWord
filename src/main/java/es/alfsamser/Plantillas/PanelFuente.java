/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package es.alfsamser.Plantillas;

import javax.swing.UIManager;

/**
 *
 * @author Alfre
 */
public class PanelFuente extends javax.swing.JPanel {

    /**
     * Creates new form pFuente
     */
    public PanelFuente() {
        initComponents();

    }

    private void toggle(javax.swing.JToggleButton este) {
        este.setSelected(!este.isSelected());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        contenido = new javax.swing.JPanel();
        linea1 = new javax.swing.JPanel();
        cbFuente = new javax.swing.JComboBox<>();
        cbTamannoF = new javax.swing.JComboBox<>();
        bAumetarTamannoF = new javax.swing.JButton();
        bDisminuirTamannoF = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bCambiarMayus = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        bBorrarFormato = new javax.swing.JButton();
        liena2 = new javax.swing.JPanel();
        tbNegrita = new javax.swing.JToggleButton();
        tbCursiva = new javax.swing.JToggleButton();
        tbSubrayado = new javax.swing.JToggleButton();
        tbSubrayadoFlecha = new javax.swing.JToggleButton();
        tbTachado = new javax.swing.JToggleButton();
        tbSubIndice = new javax.swing.JToggleButton();
        tbSuperIndice = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        bEfectos = new javax.swing.JButton();
        bResaltado = new javax.swing.JButton();
        bResaltadoFlecha = new javax.swing.JButton();
        bColorLetra = new javax.swing.JButton();
        bColorLetraFlecha = new javax.swing.JButton();
        etiquetaInferior = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();
        bIcono = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        contenido.setLayout(new javax.swing.BoxLayout(contenido, javax.swing.BoxLayout.Y_AXIS));

        linea1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        cbFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calibri (Body)" }));
        linea1.add(cbFuente);

        cbTamannoF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18" }));
        cbTamannoF.setPreferredSize(new java.awt.Dimension(50, 22));
        linea1.add(cbTamannoF);

        bAumetarTamannoF.setBackground(new java.awt.Color(242, 242, 242));
        bAumetarTamannoF.setForeground(new java.awt.Color(112, 108, 108));
        bAumetarTamannoF.setText("<html>A<sup><font color=#377abe>🞁</font></sup></html>");
        bAumetarTamannoF.setToolTipText("");
        bAumetarTamannoF.setAlignmentY(0.0F);
        bAumetarTamannoF.setBorder(null);
        bAumetarTamannoF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAumetarTamannoF.setMaximumSize(new java.awt.Dimension(25, 25));
        bAumetarTamannoF.setMinimumSize(new java.awt.Dimension(25, 25));
        bAumetarTamannoF.setPreferredSize(new java.awt.Dimension(25, 25));
        bAumetarTamannoF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bAumetarTamannoF.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        linea1.add(bAumetarTamannoF);

        bDisminuirTamannoF.setBackground(new java.awt.Color(242, 242, 242));
        bDisminuirTamannoF.setForeground(new java.awt.Color(112, 108, 108));
        bDisminuirTamannoF.setText("<html><font size=\"-1\">A</font><sup><font color=#377abe>🞃</font></sup></html>");
        bDisminuirTamannoF.setAlignmentY(0.0F);
        bDisminuirTamannoF.setBorder(null);
        bDisminuirTamannoF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDisminuirTamannoF.setMaximumSize(new java.awt.Dimension(25, 25));
        bDisminuirTamannoF.setMinimumSize(new java.awt.Dimension(25, 25));
        bDisminuirTamannoF.setPreferredSize(new java.awt.Dimension(25, 25));
        bDisminuirTamannoF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bDisminuirTamannoF.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        bDisminuirTamannoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDisminuirTamannoFActionPerformed(evt);
            }
        });
        linea1.add(bDisminuirTamannoF);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setMinimumSize(new java.awt.Dimension(3, 20));
        jSeparator1.setPreferredSize(new java.awt.Dimension(3, 20));
        linea1.add(jSeparator1);

        bCambiarMayus.setBackground(new java.awt.Color(242, 242, 242));
        bCambiarMayus.setForeground(new java.awt.Color(112, 108, 108));
        bCambiarMayus.setText("<html><b>Aa </b>🞃</html>");
        bCambiarMayus.setBorder(null);
        bCambiarMayus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCambiarMayus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bCambiarMayus.setMaximumSize(new java.awt.Dimension(38, 25));
        bCambiarMayus.setMinimumSize(new java.awt.Dimension(38, 25));
        bCambiarMayus.setPreferredSize(new java.awt.Dimension(38, 25));
        linea1.add(bCambiarMayus);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setMinimumSize(new java.awt.Dimension(3, 20));
        jSeparator8.setPreferredSize(new java.awt.Dimension(3, 20));
        linea1.add(jSeparator8);

        bBorrarFormato.setBackground(new java.awt.Color(242, 242, 242));
        bBorrarFormato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fuente/borrarFormato.png"))); // NOI18N
        bBorrarFormato.setBorder(null);
        bBorrarFormato.setMaximumSize(new java.awt.Dimension(25, 25));
        bBorrarFormato.setMinimumSize(new java.awt.Dimension(25, 25));
        bBorrarFormato.setPreferredSize(new java.awt.Dimension(25, 25));
        bBorrarFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarFormatoActionPerformed(evt);
            }
        });
        linea1.add(bBorrarFormato);

        contenido.add(linea1);

        liena2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        tbNegrita.setBackground(new java.awt.Color(242, 242, 242));
        tbNegrita.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbNegrita.setForeground(new java.awt.Color(112, 108, 108));
        tbNegrita.setText("B");
        tbNegrita.setBorder(null);
        tbNegrita.setMaximumSize(new java.awt.Dimension(25, 25));
        tbNegrita.setMinimumSize(new java.awt.Dimension(25, 25));
        tbNegrita.setPreferredSize(new java.awt.Dimension(25, 25));
        liena2.add(tbNegrita);

        tbCursiva.setBackground(new java.awt.Color(242, 242, 242));
        tbCursiva.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        tbCursiva.setForeground(new java.awt.Color(112, 108, 108));
        tbCursiva.setText("I");
        tbCursiva.setBorder(null);
        tbCursiva.setMaximumSize(new java.awt.Dimension(25, 25));
        tbCursiva.setMinimumSize(new java.awt.Dimension(25, 25));
        tbCursiva.setPreferredSize(new java.awt.Dimension(25, 25));
        liena2.add(tbCursiva);

        tbSubrayado.setBackground(new java.awt.Color(242, 242, 242));
        tbSubrayado.setForeground(new java.awt.Color(112, 108, 108));
        tbSubrayado.setSelected(true);
        tbSubrayado.setText("<html><u>U</u></html>");
        tbSubrayado.setActionCommand("<html><inst>U</inst></html>");
        tbSubrayado.setBorder(null);
        tbSubrayado.setMaximumSize(new java.awt.Dimension(25, 25));
        tbSubrayado.setMinimumSize(new java.awt.Dimension(25, 25));
        tbSubrayado.setPreferredSize(new java.awt.Dimension(25, 25));
        tbSubrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSubrayadoActionPerformed(evt);
            }
        });
        liena2.add(tbSubrayado);

        tbSubrayadoFlecha.setBackground(new java.awt.Color(242, 242, 242));
        tbSubrayadoFlecha.setForeground(new java.awt.Color(112, 108, 108));
        tbSubrayadoFlecha.setText("🞃");
        tbSubrayadoFlecha.setBorder(null);
        tbSubrayadoFlecha.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tbSubrayadoFlecha.setMaximumSize(new java.awt.Dimension(13, 25));
        tbSubrayadoFlecha.setMinimumSize(new java.awt.Dimension(13, 25));
        tbSubrayadoFlecha.setPreferredSize(new java.awt.Dimension(13, 25));
        tbSubrayadoFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSubrayadoFlechaActionPerformed(evt);
            }
        });
        liena2.add(tbSubrayadoFlecha);

        tbTachado.setBackground(new java.awt.Color(242, 242, 242));
        tbTachado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fuente/tachado.png"))); // NOI18N
        tbTachado.setBorder(null);
        tbTachado.setMaximumSize(new java.awt.Dimension(25, 25));
        tbTachado.setMinimumSize(new java.awt.Dimension(25, 25));
        tbTachado.setPreferredSize(new java.awt.Dimension(25, 25));
        liena2.add(tbTachado);

        tbSubIndice.setBackground(new java.awt.Color(242, 242, 242));
        tbSubIndice.setForeground(new java.awt.Color(112, 108, 108));
        tbSubIndice.setText("<html><b>x<sub><font color=#377abe size=\"-2\">2</font></sub></b></html>");
        tbSubIndice.setToolTipText("");
        tbSubIndice.setAlignmentY(0.0F);
        tbSubIndice.setBorder(null);
        tbSubIndice.setMaximumSize(new java.awt.Dimension(25, 25));
        tbSubIndice.setMinimumSize(new java.awt.Dimension(25, 25));
        tbSubIndice.setPreferredSize(new java.awt.Dimension(25, 25));
        tbSubIndice.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        tbSubIndice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbSubIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSubIndiceActionPerformed(evt);
            }
        });
        liena2.add(tbSubIndice);

        tbSuperIndice.setBackground(new java.awt.Color(242, 242, 242));
        tbSuperIndice.setForeground(new java.awt.Color(112, 108, 108));
        tbSuperIndice.setText("<html><b>x<sup><font color=#377abe size=\"-2\">2</font></sup></b></html>");
        tbSuperIndice.setAlignmentY(0.0F);
        tbSuperIndice.setBorder(null);
        tbSuperIndice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbSuperIndice.setMaximumSize(new java.awt.Dimension(25, 25));
        tbSuperIndice.setMinimumSize(new java.awt.Dimension(25, 25));
        tbSuperIndice.setPreferredSize(new java.awt.Dimension(25, 25));
        liena2.add(tbSuperIndice);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMinimumSize(new java.awt.Dimension(3, 20));
        jSeparator2.setPreferredSize(new java.awt.Dimension(3, 25));
        liena2.add(jSeparator2);

        bEfectos.setBackground(new java.awt.Color(242, 242, 242));
        bEfectos.setForeground(new java.awt.Color(112, 108, 108));
        bEfectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fuente/efectosTexto.png"))); // NOI18N
        bEfectos.setText("🞃");
        bEfectos.setBorder(null);
        bEfectos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bEfectos.setMaximumSize(new java.awt.Dimension(38, 25));
        bEfectos.setMinimumSize(new java.awt.Dimension(38, 25));
        bEfectos.setPreferredSize(new java.awt.Dimension(38, 25));
        liena2.add(bEfectos);

        bResaltado.setBackground(new java.awt.Color(242, 242, 242));
        bResaltado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fuente/colorResaltado.png"))); // NOI18N
        bResaltado.setBorder(null);
        bResaltado.setMaximumSize(new java.awt.Dimension(25, 25));
        bResaltado.setMinimumSize(new java.awt.Dimension(25, 25));
        bResaltado.setPreferredSize(new java.awt.Dimension(25, 25));
        liena2.add(bResaltado);

        bResaltadoFlecha.setBackground(new java.awt.Color(242, 242, 242));
        bResaltadoFlecha.setForeground(new java.awt.Color(112, 108, 108));
        bResaltadoFlecha.setText("🞃");
        bResaltadoFlecha.setBorder(null);
        bResaltadoFlecha.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bResaltadoFlecha.setMaximumSize(new java.awt.Dimension(13, 25));
        bResaltadoFlecha.setMinimumSize(new java.awt.Dimension(13, 25));
        bResaltadoFlecha.setPreferredSize(new java.awt.Dimension(13, 25));
        bResaltadoFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResaltadoFlechaActionPerformed(evt);
            }
        });
        liena2.add(bResaltadoFlecha);

        bColorLetra.setBackground(new java.awt.Color(242, 242, 242));
        bColorLetra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fuente/colorLetra.png"))); // NOI18N
        bColorLetra.setBorder(null);
        bColorLetra.setMaximumSize(new java.awt.Dimension(25, 25));
        bColorLetra.setMinimumSize(new java.awt.Dimension(25, 25));
        bColorLetra.setPreferredSize(new java.awt.Dimension(25, 25));
        liena2.add(bColorLetra);

        bColorLetraFlecha.setBackground(new java.awt.Color(242, 242, 242));
        bColorLetraFlecha.setForeground(new java.awt.Color(112, 108, 108));
        bColorLetraFlecha.setText("🞃");
        bColorLetraFlecha.setBorder(null);
        bColorLetraFlecha.setMargin(new java.awt.Insets(0, 0, 0, 0));
        bColorLetraFlecha.setMaximumSize(new java.awt.Dimension(13, 25));
        bColorLetraFlecha.setMinimumSize(new java.awt.Dimension(13, 25));
        bColorLetraFlecha.setPreferredSize(new java.awt.Dimension(13, 25));
        liena2.add(bColorLetraFlecha);

        contenido.add(liena2);

        add(contenido, java.awt.BorderLayout.CENTER);

        etiquetaInferior.setLayout(new java.awt.GridBagLayout());

        etiqueta.setForeground(new java.awt.Color(112, 108, 108));
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Fuente");
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
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        etiquetaInferior.add(bIcono, gridBagConstraints);

        add(etiquetaInferior, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void bIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIconoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIconoActionPerformed

    private void tbSubIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSubIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSubIndiceActionPerformed

    private void bDisminuirTamannoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDisminuirTamannoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bDisminuirTamannoFActionPerformed

    private void bResaltadoFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResaltadoFlechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bResaltadoFlechaActionPerformed

    private void bBorrarFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarFormatoActionPerformed
        this.tbNegrita.setSelected(false);
        this.tbSubrayado.setSelected(false);
        this.tbSubrayadoFlecha.setSelected(false);
        this.tbCursiva.setSelected(false);
        this.tbSubIndice.setSelected(false);
        this.tbSuperIndice.setSelected(false);
    }//GEN-LAST:event_bBorrarFormatoActionPerformed

    private void tbSubrayadoFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSubrayadoFlechaActionPerformed
        toggle(tbSubrayado);
    }//GEN-LAST:event_tbSubrayadoFlechaActionPerformed

    private void tbSubrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSubrayadoActionPerformed
        toggle(tbSubrayadoFlecha);
    }//GEN-LAST:event_tbSubrayadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAumetarTamannoF;
    private javax.swing.JButton bBorrarFormato;
    private javax.swing.JButton bCambiarMayus;
    private javax.swing.JButton bColorLetra;
    private javax.swing.JButton bColorLetraFlecha;
    private javax.swing.JButton bDisminuirTamannoF;
    private javax.swing.JButton bEfectos;
    private javax.swing.JButton bIcono;
    private javax.swing.JButton bResaltado;
    private javax.swing.JButton bResaltadoFlecha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbFuente;
    private javax.swing.JComboBox<String> cbTamannoF;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JPanel etiquetaInferior;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel liena2;
    private javax.swing.JPanel linea1;
    private javax.swing.JToggleButton tbCursiva;
    private javax.swing.JToggleButton tbNegrita;
    private javax.swing.JToggleButton tbSubIndice;
    private javax.swing.JToggleButton tbSubrayado;
    private javax.swing.JToggleButton tbSubrayadoFlecha;
    private javax.swing.JToggleButton tbSuperIndice;
    private javax.swing.JToggleButton tbTachado;
    // End of variables declaration//GEN-END:variables
}
