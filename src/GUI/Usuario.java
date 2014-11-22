/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estadm
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form PeticionDatos
     */
    public Usuario() {
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

        Pfondo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Pmsj = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Bsend = new javax.swing.JButton();
        Text_IPNumber = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Pfondo.setBackground(new java.awt.Color(153, 153, 0));
        Pfondo.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel4.setText("CEDMS");
        Pfondo.add(jLabel4);
        jLabel4.setBounds(120, 80, 220, 110);

        getContentPane().add(Pfondo);
        Pfondo.setBounds(10, 0, 450, 300);

        Pmsj.setBackground(new java.awt.Color(204, 255, 204));
        Pmsj.setForeground(new java.awt.Color(102, 255, 255));
        Pmsj.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Pmsj.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 360, 191);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("TO:");
        Pmsj.add(jLabel2);
        jLabel2.setBounds(10, 10, 26, 18);
        Pmsj.add(jTextField1);
        jTextField1.setBounds(70, 40, 78, 20);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Puerto:");
        Pmsj.add(jLabel1);
        jLabel1.setBounds(10, 40, 54, 18);

        Bsend.setText("Send");
        Bsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsendActionPerformed(evt);
            }
        });
        Pmsj.add(Bsend);
        Bsend.setBounds(370, 280, 57, 23);

        Text_IPNumber.setText("IP Number");
        Text_IPNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text_IPNumberMouseClicked(evt);
            }
        });
        Text_IPNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IPNumberActionPerformed(evt);
            }
        });
        Text_IPNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Text_IPNumberFocusGained(evt);
            }
        });
        Pmsj.add(Text_IPNumber);
        Text_IPNumber.setBounds(69, 12, 216, 20);

        getContentPane().add(Pmsj);
        Pmsj.setBounds(0, 20, 430, 310);

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Mensajes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Imprimir Grafo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Camino más Corto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Cambiar Peso de Conexiones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Ver Nodos Adyacentes");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Salir");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void Text_IPNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IPNumberActionPerformed
        
    }//GEN-LAST:event_Text_IPNumberActionPerformed

    private void Text_IPNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_IPNumberMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_IPNumberMouseClicked

    private void Text_IPNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Text_IPNumberFocusGained
       System.out.println("enter");
        Text_IPNumber.setText("");
    }//GEN-LAST:event_Text_IPNumberFocusGained

    private void BsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BsendActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Pfondo.setVisible(true);
        Pfondo.setBounds(0,0, 450, 400);
        Pmsj.setVisible(false);
        Pmsj.setBounds(0,0,450,400);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Pfondo.setVisible(false);
        Pmsj.setVisible(true);        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsend;
    private javax.swing.JPanel Pfondo;
    private javax.swing.JPanel Pmsj;
    private javax.swing.JTextField Text_IPNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}