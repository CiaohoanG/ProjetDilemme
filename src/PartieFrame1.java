/**
 *
 * @author Ciao_hoanG
 */

import jeudilemme.Partie;

public class PartieFrame1 extends javax.swing.JFrame {

    public PartieFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        partie = new jeudilemme.Partie();
        synthesePanel1 = synthesePanel1 = new SynthesePanel(partie);
        controlePanel1 = controlePanel1 = new ControlePanel(partie);
        histoirePanel1 = histoirePanel1 = new HistoirePanel(partie);
        proc_coup = new javax.swing.JLabel();
        histoire = new javax.swing.JLabel();
        synthese = new javax.swing.JLabel();
        manipPanel1 = manipPanel1 = new ManipPanel(partie);
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Partie Dilemme");

        synthesePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        controlePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        controlePanel1.setToolTipText("");

        proc_coup.setFont(new java.awt.Font("Luminari", 1, 14)); // NOI18N
        proc_coup.setText("Prochain coup");

        histoire.setFont(new java.awt.Font("Luminari", 1, 14)); // NOI18N
        histoire.setText("Historique");

        synthese.setFont(new java.awt.Font("Luminari", 1, 14)); // NOI18N
        synthese.setText("Synthèse");

        manipPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Luminari", 1, 14)); // NOI18N
        jLabel1.setText("Manipuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(proc_coup)
                    .addComponent(controlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(synthesePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(synthese))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(manipPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(histoire)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(histoirePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proc_coup)
                    .addComponent(histoire))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(controlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(synthese)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(synthesePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(manipPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histoirePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/
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
            java.util.logging.Logger.getLogger(PartieFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartieFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartieFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartieFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartieFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ControlePanel controlePanel1;
    private javax.swing.JLabel histoire;
    private HistoirePanel histoirePanel1;
    private javax.swing.JLabel jLabel1;
    private ManipPanel manipPanel1;
    private jeudilemme.Partie partie;
    private javax.swing.JLabel proc_coup;
    private javax.swing.JLabel synthese;
    private SynthesePanel synthesePanel1;
    // End of variables declaration//GEN-END:variables
}
