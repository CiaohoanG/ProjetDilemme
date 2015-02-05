
import java.util.Observable;
import java.util.Observer;
import jeudilemme.Partie;



/**
 *
 * @author Ciao_hoanG
 */
public class ControlePanel extends javax.swing.JPanel implements Observer {

    private Partie partie;
    
    /**
     * Creates new form ControlePanel
     */
    public ControlePanel(){
        initComponents();
    }
    
    public ControlePanel(Partie partie){
        this.partie = partie;
        partie.addObserver(this);
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CC = new javax.swing.JToggleButton();
        CN = new javax.swing.JToggleButton();
        NC = new javax.swing.JToggleButton();
        NN = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        CC.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        CC.setText("CC");
        CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCActionPerformed(evt);
            }
        });

        CN.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        CN.setText("CD");
        CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNActionPerformed(evt);
            }
        });

        NC.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        NC.setText("DC");
        NC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NCActionPerformed(evt);
            }
        });

        NN.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        NN.setText("DD");
        NN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        jLabel1.setText("Fait défaut");

        jLabel2.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        jLabel2.setText("Coopère");

        jLabel3.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        jLabel3.setText("Coopère");

        jLabel4.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        jLabel4.setText("Fait défaut");

        jLabel5.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        jLabel5.setText("A \\ B");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(NN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(CN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCActionPerformed
        partie.coopere(true, true);
    }//GEN-LAST:event_CCActionPerformed

    private void CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNActionPerformed
        partie.coopere(true, false);
    }//GEN-LAST:event_CNActionPerformed

    private void NCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCActionPerformed
        partie.coopere(false, true);
    }//GEN-LAST:event_NCActionPerformed

    private void NNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NNActionPerformed
        partie.coopere(false, false);
    }//GEN-LAST:event_NNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CC;
    private javax.swing.JToggleButton CN;
    private javax.swing.JToggleButton NC;
    private javax.swing.JToggleButton NN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
       
    }

    
}
