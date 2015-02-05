import java.util.Observable;
import java.util.Observer;
import jeudilemme.Partie;
/**
 *
 * @author Ciao_hoanG
 */
public class SynthesePanel extends javax.swing.JPanel implements Observer {

    private Partie partie;
    
    public SynthesePanel() {
        initComponents();
    }
    
    public SynthesePanel(Partie partie){
        this.partie = partie;
        partie.addObserver(this);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nbCoup = new javax.swing.JLabel();
        scoreA = new javax.swing.JLabel();
        scoreB = new javax.swing.JLabel();
        resultCoup = new javax.swing.JLabel();
        resultScoreA = new javax.swing.JLabel();
        resultScoreB = new javax.swing.JLabel();

        nbCoup.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        nbCoup.setText("Nb de coups:");

        scoreA.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        scoreA.setText("Score de A:");

        scoreB.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        scoreB.setText("Score de B:");

        resultCoup.setText("0");

        resultScoreA.setText("0,0");

        resultScoreB.setText("0,0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreB)
                    .addComponent(scoreA)
                    .addComponent(nbCoup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultCoup)
                    .addComponent(resultScoreA)
                    .addComponent(resultScoreB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbCoup)
                    .addComponent(resultCoup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreA)
                    .addComponent(resultScoreA))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreB)
                    .addComponent(resultScoreB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nbCoup;
    private javax.swing.JLabel resultCoup;
    private javax.swing.JLabel resultScoreA;
    private javax.swing.JLabel resultScoreB;
    private javax.swing.JLabel scoreA;
    private javax.swing.JLabel scoreB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
         if(partie == o){
             resultCoup.setText(Integer.toString(partie.getNbCoups()));
             resultScoreA.setText(Double.toString(partie.getScoreA()));
             resultScoreB.setText(Double.toString(partie.getScoreB()));
         }
    }
}
