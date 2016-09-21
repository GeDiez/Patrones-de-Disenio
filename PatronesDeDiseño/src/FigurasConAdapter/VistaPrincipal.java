/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasConAdapter;

import javax.swing.JLabel;

/**
 *
 * @author gediez
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    AreaPintado ap = new AreaPintado();
    Forma figura = null;
    public VistaPrincipal() {
        initComponents();        
        getContentPane().add(ap);
        ap.setBounds(260, 20, 600, 500);
        setLocation(200, 50);
        setSize(1000, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcb_nomfig = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbtn_rotarDer = new javax.swing.JButton();
        jbtn_tarriba = new javax.swing.JButton();
        jbtn_tabajo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtn_tizq = new javax.swing.JButton();
        jbtn_tder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbtn_rotarIzq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dibuja Figuras");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(null);

        jcb_nomfig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Elige una figura>", "Cuadro", "Triangulo", "Texto" }));
        jcb_nomfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_nomfigActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_nomfig);
        jcb_nomfig.setBounds(60, 40, 160, 24);

        jLabel1.setText("Elige una figura");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 111, 15);

        jbtn_rotarDer.setText(">>");
        jbtn_rotarDer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_rotarDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_rotarDerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_rotarDer);
        jbtn_rotarDer.setBounds(170, 130, 54, 25);

        jbtn_tarriba.setText("Arriba");
        jbtn_tarriba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_tarriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_tarribaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_tarriba);
        jbtn_tarriba.setBounds(100, 220, 80, 25);

        jbtn_tabajo.setText("Abajo");
        jbtn_tabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_tabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_tabajoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_tabajo);
        jbtn_tabajo.setBounds(100, 290, 80, 25);

        jLabel2.setText("  Trasladar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 260, 76, 15);

        jbtn_tizq.setText("Izq.");
        jbtn_tizq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_tizq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_tizqActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_tizq);
        jbtn_tizq.setBounds(30, 260, 60, 25);

        jbtn_tder.setText("Der.");
        jbtn_tder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_tder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_tderActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_tder);
        jbtn_tder.setBounds(190, 260, 64, 25);

        jLabel3.setText("Rotar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 130, 40, 15);

        jbtn_rotarIzq.setText("<<");
        jbtn_rotarIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_rotarIzqActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_rotarIzq);
        jbtn_rotarIzq.setBounds(50, 130, 54, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_nomfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_nomfigActionPerformed
        String fig = (String) jcb_nomfig.getSelectedItem();
        if(fig.equals("Cuadro")){
            figura = new Rectangulo();                    
        }
        
        if(fig.equals("Triangulo")){
            figura = new Triangulo();                    
        }
        
        if(fig.equals("Texto")){
            Texto texto = new Texto("Hello World! ");
            //ap.add(new JLabel("hola")).setBounds(10, 10, 100, 100);
            figura = new TextoAdapter(texto, ap);
        }
        ap.setFigura(figura);
        ap.repaint();
    }//GEN-LAST:event_jcb_nomfigActionPerformed

    private void jbtn_rotarDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_rotarDerActionPerformed
        if(ap.getGrados() > 360){
            ap.setGrados(0);
        }
        ap.setGrados( ap.getGrados() - 5 );
        ap.repaint();   
    }//GEN-LAST:event_jbtn_rotarDerActionPerformed

    private void jbtn_tarribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_tarribaActionPerformed
        // TODO add your handling code here:
        ap.setPosicion(ap.getPosicionx(), ap.getPosiciony() - 10);
        ap.repaint();
    }//GEN-LAST:event_jbtn_tarribaActionPerformed

    private void jbtn_tabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_tabajoActionPerformed
        // TODO add your handling code here:
        ap.setPosicion(ap.getPosicionx(), ap.getPosiciony() + 10);
        ap.repaint();
    }//GEN-LAST:event_jbtn_tabajoActionPerformed

    private void jbtn_tizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_tizqActionPerformed
        // TODO add your handling code here:
        ap.setPosicion(ap.getPosicionx() - 10, ap.getPosiciony());
        ap.repaint();
    }//GEN-LAST:event_jbtn_tizqActionPerformed

    private void jbtn_tderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_tderActionPerformed
        // TODO add your handling code here:
        ap.setPosicion(ap.getPosicionx() + 10, ap.getPosiciony());
        ap.repaint();
    }//GEN-LAST:event_jbtn_tderActionPerformed

    private void jbtn_rotarIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_rotarIzqActionPerformed
        // TODO add your handling code here:
        if(ap.getGrados() < 0){
            ap.setGrados(360);
        }
        ap.setGrados( ap.getGrados() + 5 );
        ap.repaint();
    }//GEN-LAST:event_jbtn_rotarIzqActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtn_rotarDer;
    private javax.swing.JButton jbtn_rotarIzq;
    private javax.swing.JButton jbtn_tabajo;
    private javax.swing.JButton jbtn_tarriba;
    private javax.swing.JButton jbtn_tder;
    private javax.swing.JButton jbtn_tizq;
    private javax.swing.JComboBox<String> jcb_nomfig;
    // End of variables declaration//GEN-END:variables
}
