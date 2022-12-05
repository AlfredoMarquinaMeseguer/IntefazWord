/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.alfsamser.interfazwordmaven;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Sergio
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    //Botones de Zoom del panel inferior
    JButton menosZoom, masZoom;
    JSlider sZoomInferior;

    //Botones de diseño de vista del panel inferior
    JToggleButton modoLecturaInferior, dImpresionInferior,
            dWebInferior, tbAutxiliar;

    // Componentes del Panel fuente
    JComboBox cbFuente, cbTamannoFuente;
    JButton aumentarTamannoF, reducirTamannoF, borrarFormato;
    JToggleButton tbNegrita, tbCursiva, tbSubrayado;

    //Jlist del panel Estilos
    JList listaEstilos;

    //Componenetes panel vistas
    JToggleButton modoLecturaSuperior, dImpresionSuperior, dWebSuperior,
            esquemaSuperior, borradorSuperior;

    //Componentes Panel Zoom
    JComboBox cbZoom;
    JButton bCien;

    // Componentes Panel Modo Oscuro
    JToggleButton modoOscuro;

    //Componentes Panel Central
    JTextArea textAreaCentral;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        JPanel panelAux;
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //***********Declarar Objetos Panel Inferior***********//
        // Objetos de Componentes de Zoom panel inferior
        menosZoom = (JButton) panelInferior1.getComponent(9);
        masZoom = (JButton) panelInferior1.getComponent(10);
        sZoomInferior = (JSlider) panelInferior1.getComponent(8);

        // Objetos Vistas Panel Inferior
        modoLecturaInferior = (JToggleButton) panelInferior1.getComponent(4);
        dImpresionInferior = (JToggleButton) panelInferior1.getComponent(5);
        dWebInferior = (JToggleButton) panelInferior1.getComponent(6);
        tbAutxiliar = (JToggleButton) panelInferior1.getComponent(11);

        //***********Declarar Objetos Panel Superior***********//
        JTabbedPane panelSuperior = (JTabbedPane) this.panelSuperior2.
                getComponent(0);

        /////Panel Inicio
        JPanel panelInicio = (JPanel) panelSuperior.getComponent(1);

        ////////Panel Portapapeles
        /*
        Nada
         */
        ////////Panel Fuente
        JPanel panelFuente = (JPanel) panelInicio.getComponent(2);
        panelFuente = (JPanel) panelFuente.getComponent(0);

        ///////////Fila Superior
        panelAux = (JPanel) panelFuente.getComponent(0);

        cbFuente = (JComboBox) panelAux.getComponent(0);
        cbTamannoFuente = (JComboBox) panelAux.getComponent(1);
        aumentarTamannoF = (JButton) panelAux.getComponent(2);
        reducirTamannoF = (JButton) panelAux.getComponent(3);
        borrarFormato = (JButton) panelAux.getComponent(7);

        ///////////Fila Inferior
        panelAux = (JPanel) panelFuente.getComponent(1);

        tbNegrita = (JToggleButton) panelAux.getComponent(0);
        tbCursiva = (JToggleButton) panelAux.getComponent(1);
        tbSubrayado = (JToggleButton) panelAux.getComponent(2);

        ////////Panel Párrafo
        /*
        Nada
         */
        ////////Panel Estilos
        JPanel panelEstilos = (JPanel) panelInicio.getComponent(6);

        JScrollPane contenedorJlist = (JScrollPane) panelEstilos.getComponent(0);

        JViewport otroContenedoJlist = (JViewport) contenedorJlist.getComponent(0);
        listaEstilos = (JList) otroContenedoJlist.getComponent(0);

        ////////Panel Editar
        /*
        Nada
         */
        /////Panel Vista
        JPanel panelVista = (JPanel) panelSuperior.getComponent(8);

        ////////Panel Vistas
        /*Coger Panel de vistas*/
        JPanel panelVistas = (JPanel) panelVista.getComponent(0);
        /*Coger sub panel del contenido*/
        panelVistas = (JPanel) panelVistas.getComponent(0);
        /*Declarar Botones del primer sub panel con botones */
        panelAux = (JPanel) panelVistas.getComponent(0);
        modoLecturaSuperior = (JToggleButton) panelAux.getComponent(0);
        dImpresionSuperior = (JToggleButton) panelAux.getComponent(1);
        dWebSuperior = (JToggleButton) panelAux.getComponent(2);

        /*Declarar Botones del segundo sub panel con botones */
        panelAux = (JPanel) panelVistas.getComponent(1);
        esquemaSuperior = (JToggleButton) panelAux.getComponent(0);
        borradorSuperior = (JToggleButton) panelAux.getComponent(1);
        ////////Panel Movimiento Página
        /*No se necesita hacer ningún listener de estos botones*/
        ////////Panel Mostrar
        //TODO
        ////////Panel Zoom
        JPanel panelZoom = (JPanel) panelVista.getComponent(6);
        panelZoom = (JPanel) panelZoom.getComponent(0);

        cbZoom = (JComboBox) panelZoom.getComponent(1);
        bCien = (JButton) panelZoom.getComponent(2);

        ////////Panel Modo Oscuro
        JPanel panelModoOscuro = (JPanel) panelVista.getComponent(8);
        modoOscuro = (JToggleButton) ((JPanel) panelModoOscuro.getComponent(0)).getComponent(0);

        //***********Declarar componentes panel medio***********//
        JScrollPane panelMedio = (JScrollPane) panelCentral1.getComponent(0);

        //JScrollPane contenedorTextArea = (JScrollPane) panelMedio.getComponent(0);
        JViewport contenedorTextArea2 = (JViewport) panelMedio.getComponent(0);
        textAreaCentral = (JTextArea) contenedorTextArea2.getComponent(0);

        //***********Declarar y asignar listeners panel inferior***********//
        //Escuchador cambio de Slider
        sZoomInferior.addChangeListener((ChangeEvent e) -> {
            panelSuperior2.actualizarZoom(sZoomInferior.getValue());
        });

        //Escuchador Pulsa boton menosZoom
        menosZoom.addActionListener((ActionEvent e) -> {
            panelSuperior2.actualizarZoom(sZoomInferior.getValue() - 5);
        });

        //Escuchador Pulsa boton masZoom
        masZoom.addActionListener((ActionEvent e) -> {
            panelSuperior2.actualizarZoom(sZoomInferior.getValue() + 5);
        });

        ////Escuchadores botones de vistas inferiores
        //Escuchador boton modoLecturaInferior
        modoLecturaInferior.addActionListener((ActionEvent e) -> {
            //Selecciona boton correspondiente en panel superior
            modoLecturaSuperior.doClick();
        });

        //Escuchador boton diseño de impresion inferior
        dImpresionInferior.addActionListener((ActionEvent e) -> {
            //Selecciona boton correspondiente en panel superior
            dImpresionSuperior.doClick();
        });

        //Escuchador boton diseño de web inferior
        dWebInferior.addActionListener((ActionEvent e) -> {
            //Selecciona boton correspondiente en panel superior
            dWebSuperior.doClick();
        });

        //***********Declarar y asignar listeners panel superior***********//
        //// Escuchadores Panel Inicio
        ////// Escuchadorea Sub Panel Fuente
        /*
            Escuchador de combo box fuente.
            Actualiza la fuente del text Area
         */
        cbFuente.addActionListener((ActionEvent e) -> {
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });

        /*
            Escuchador de combo box tamaño fuente.
            Actualiza la fuente del text Area
         */
        cbTamannoFuente.addActionListener((ActionEvent e) -> {
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });
        /*
            Escuchador de boton aumentar tamaño fuente.
            Espera un poco, a que se ejecute el listener local,
                y actualiza la fuente del text Area.
         */
        aumentarTamannoF.addActionListener((ActionEvent e) -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });
        /*
            Escuchador de boton reducir tamaño fuente.
            Espera un poco, a que se ejecute el listener local,
                y actualiza la fuente del text Area.
         */
        reducirTamannoF.addActionListener((ActionEvent e) -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });
        /*
            Escuchador de boton borrar formato.
            Espera un poco, a que se ejecute el listener local,
                y actualiza la fuente del text Area.
         */
        borrarFormato.addActionListener((ActionEvent e) -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });

        /*
            Escuchador de toggle button Negrita.
            Actualiza la fuente del text Area.
         */
        tbNegrita.addActionListener((ActionEvent e) -> {
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });

        /*
            Escuchador de toggle button cursiva.
            Actualiza la fuente del text Area.
         */
        tbCursiva.addActionListener((ActionEvent e) -> {
            textAreaCentral.setFont(panelSuperior2.actualizarFuente());
            listaEstilos.setFont(panelSuperior2.actualizarFuente());
        });

        //// Escuchadores Panel Vista
        //////Escuchadores Panel Vistas
        // Escuchador boton modo lectura superior
        modoLecturaSuperior.addActionListener((ActionEvent e) -> {
            //Selecciona el boton correspondiente inferior
            modoLecturaInferior.doClick();
        });

        // Escuchador boton diseño de impresion superior
        dImpresionSuperior.addActionListener((ActionEvent e) -> {
            //Selecciona el boton correspondiente inferior
            dImpresionInferior.doClick();
        });

        // Escuchador boton diseño de web superior
        dWebSuperior.addActionListener((ActionEvent e) -> {
            //Selecciona el boton correspondiente inferior
            dWebInferior.doClick();
        });

        // Escuchador boton diseño de esquema superior
        esquemaSuperior.addActionListener((ActionEvent e) -> {
            /*Selecciona un boton invisible porque mno existe
            correspondiente inferior*/
            tbAutxiliar.doClick();
        });

        // Escuchador boton diseño de borrador superior
        borradorSuperior.addActionListener((ActionEvent e) -> {
            /*Selecciona un boton invisible porque mno existe
            correspondiente inferior*/
            tbAutxiliar.setSelected(true);
        });

        ////// Escuchadores Panel Zoom
        /*
            Escuchador combo box de Zoom.
            Cambia el Zoom al seleccionado en el combo box.
         */
        cbZoom.addActionListener((ActionEvent e) -> {
            sZoomInferior.setValue(cbZoom.getSelectedIndex() + 10);
        });

        /*
            Escuchador boton cien.
            Cambia el Zoom a cien
         */
        bCien.addActionListener((ActionEvent e) -> {
            //cambiar valores de superior e inferior a 100
            panelSuperior2.actualizarZoom(100);
            sZoomInferior.setValue(100);
        });

        /*
            Escuchador Modo Oscuro
            Llama a cambiar Cambia el look & feel. Si Seleccionado a oscuro
                    sino a claro
         */
        modoOscuro.addActionListener((ActionEvent e) -> {
            cambiarLookAndFeel(modoOscuro.isSelected());
        });

        //* Key Bindings //
        //***********Declarar Combinaciones de Teclas Listener**********//
        //// Panel  Inferior
        ///// Zoom Inferior
        /*
            Menos Zoom boton, combinaciones CTRL+"-", donde existen dos "-" en el
            teclado. Razón por la que tiene dos claves de diccionario.
         */
        menosZoom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT,
                        KeyEvent.CTRL_DOWN_MASK), "-");
        menosZoom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,
                        KeyEvent.CTRL_DOWN_MASK), "_");
        /*
            Se crea una bjeto acción abstracta porque se va a asignar dos veces.
            Hace click en el botón menos Zoom para activar su listener
         */
        AbstractAction reducirZoom = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menosZoom.doClick();
            }
        };
        /*
            Se asignan los input maps a la acción
         */
        menosZoom.getActionMap().put("-", reducirZoom);
        menosZoom.getActionMap().put("_", reducirZoom);

        /*
            Más Zoom boton, combinaciones CTRL+"+", donde existen dos "+" en el
            teclado. Razón por la que tiene dos claves de diccionario.
         */
        masZoom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD,
                        KeyEvent.CTRL_DOWN_MASK), "+");
        masZoom.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,
                        KeyEvent.CTRL_DOWN_MASK), "m");
        /*
            Se crea una bjeto acción abstracta porque se va a asignar dos veces.
            Hace click en el botón menos Zoom para activar su listener
         */
        AbstractAction aumentarZoom = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                masZoom.doClick();
            }
        };
        /*
            Se asignan los input maps a la acción
         */
        masZoom.getActionMap().put("+", aumentarZoom);
        masZoom.getActionMap().put("m", aumentarZoom);

        ////Panel Superior
        //////Panel Fuente
        // Key Binding Negrita, CTRL+N
        tbNegrita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_B,
                        KeyEvent.CTRL_DOWN_MASK), "B");
        tbNegrita.getActionMap().put("B", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tbNegrita.doClick();
            }
        });

        // Key Binding Cursiva, CTRL+I
        tbCursiva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_I,
                        KeyEvent.CTRL_DOWN_MASK), "I");
        tbCursiva.getActionMap().put("I", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tbCursiva.doClick();
            }
        });

        // Key Binding Subrayado, CTRL+U
        tbSubrayado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(KeyStroke.getKeyStroke(KeyEvent.VK_U,
                        KeyEvent.CTRL_DOWN_MASK), "U");
        tbSubrayado.getActionMap().put("U", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tbSubrayado.doClick();
            }
        });
    }

    /*Cambia el look and feel y lo actualiza para aplicarlo.
        oscuro -> si es true cambia a oscuro, sino a claro*/
    private void cambiarLookAndFeel(boolean oscuro) {
        try {
            if (oscuro) {
                UIManager.setLookAndFeel(new FlatDarkLaf());
            } else {
                UIManager.setLookAndFeel(new FlatLightLaf());
            }
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    //Metodo para comprobar si el usuario quiere guardar el documento
    private void cerrar() {
        String botones[] = {"No", "Si"};
        int eleccion = JOptionPane.showOptionDialog(this,
                "¿Desea guardar el fichero?", "Confirmar cierre",
                0, 3, null, botones,
                this);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            JFileChooser j = new JFileChooser();
            j.showOpenDialog(null);
            System.out.println(j.getSelectedFile().getAbsolutePath());
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTop = new javax.swing.JPanel();
        panelSuperior2 = new es.alfsamser.Paneles.PanelSuperior();
        jPMid = new javax.swing.JPanel();
        panelCentral1 = new es.alfsamser.Paneles.PanelCentral();
        jPBot = new javax.swing.JPanel();
        panelInferior1 = new es.alfsamser.Paneles.PanelInferior();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPTop.setLayout(new javax.swing.BoxLayout(jPTop, javax.swing.BoxLayout.LINE_AXIS));
        jPTop.add(panelSuperior2);

        getContentPane().add(jPTop, java.awt.BorderLayout.PAGE_START);

        jPMid.setLayout(new javax.swing.BoxLayout(jPMid, javax.swing.BoxLayout.LINE_AXIS));
        jPMid.add(panelCentral1);

        getContentPane().add(jPMid, java.awt.BorderLayout.CENTER);

        jPBot.setLayout(new javax.swing.BoxLayout(jPBot, javax.swing.BoxLayout.LINE_AXIS));
        jPBot.add(panelInferior1);

        getContentPane().add(jPBot, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPBot;
    private javax.swing.JPanel jPMid;
    private javax.swing.JPanel jPTop;
    private es.alfsamser.Paneles.PanelCentral panelCentral1;
    private es.alfsamser.Paneles.PanelInferior panelInferior1;
    private es.alfsamser.Paneles.PanelSuperior panelSuperior2;
    // End of variables declaration//GEN-END:variables
}
