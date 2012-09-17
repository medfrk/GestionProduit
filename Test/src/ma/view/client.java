
package ma.view;

import javax.swing.JDialog;

public class client extends javax.swing.JDialog {

    public client(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTrecherche = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTcin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTnom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTtelephone = new javax.swing.JTextField();
        jBnouveau = new javax.swing.JButton();
        jBsuppression = new javax.swing.JButton();
        jBenregistrer = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("OK");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 406, 278));
        setMinimumSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  CLIENT  ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 80, 26);

        jLabel2.setText("Recherche");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 70, 30);
        getContentPane().add(jTrecherche);
        jTrecherche.setBounds(90, 60, 230, 30);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 60, 50, 30);

        jLabel3.setText("CIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 110, 70, 30);

        jTcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcinActionPerformed(evt);
            }
        });
        getContentPane().add(jTcin);
        jTcin.setBounds(90, 110, 230, 30);

        jLabel4.setText("Nom");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 70, 30);
        getContentPane().add(jTnom);
        jTnom.setBounds(90, 150, 230, 30);

        jLabel5.setText("Téléphone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 190, 70, 30);
        getContentPane().add(jTtelephone);
        jTtelephone.setBounds(90, 190, 230, 30);

        jBnouveau.setText("Nouveau");
        getContentPane().add(jBnouveau);
        jBnouveau.setBounds(40, 240, 100, 23);

        jBsuppression.setText("Supression");
        getContentPane().add(jBsuppression);
        jBsuppression.setBounds(260, 240, 100, 23);

        jBenregistrer.setText("Enregistrer");
        getContentPane().add(jBenregistrer);
        jBenregistrer.setBounds(150, 240, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcinActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                client dialog = new client(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBenregistrer;
    private javax.swing.JButton jBnouveau;
    private javax.swing.JButton jBsuppression;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTcin;
    private javax.swing.JTextField jTnom;
    private javax.swing.JTextField jTrecherche;
    private javax.swing.JTextField jTtelephone;
    // End of variables declaration//GEN-END:variables
}
