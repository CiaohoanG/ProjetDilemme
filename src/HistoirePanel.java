import javax.swing.table.AbstractTableModel;
import jeudilemme.Partie;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ciao_hoanG
 */
public class HistoirePanel extends javax.swing.JPanel implements Observer{
    
    private Partie partie;
    public PartieTableModel modele;
    
    /**
     * Creates new form HistoirePanel
     */
    public HistoirePanel() {
        partie = new Partie();
        modele = new PartieTableModel();
        initComponents();
    }
    
    public HistoirePanel(Partie partie) {
        this.partie = partie;
        modele = new PartieTableModel();
        partie.addObserver(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tab_histoire = new javax.swing.JTable();

        tab_histoire.setModel(modele);
        jScrollPane.setViewportView(tab_histoire);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tab_histoire;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (partie == o){
        modele.fireTableDataChanged();
        }
    } 
    
    public class PartieTableModel extends AbstractTableModel {

        private final String[] entetes = {"N°", "Choix A", "Choix B", "Gain A", "Gain B"};
        
        public PartieTableModel() {
           super();
        }

        @Override
        public String getColumnName(int columnIndex) {
            return entetes[columnIndex];
        }
         
        @Override
        public int getRowCount() {
            return partie.getNbCoups();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return rowIndex + 1;    
                case 1:
                    if(partie.aAcoopere(rowIndex + 1)==true){
                        return "C";
                        
                    }else return "D";
                case 2:
                    if(partie.bAcoopere(rowIndex + 1)==true){
                        return "C";
                        
                    }else return "D";
                case 3:
                    return partie.choix.get(rowIndex).getGainA();
                case 4:
                    return partie.choix.get(rowIndex).getGainB();
                default:
                    return null;
            }
            
        }
    }
        
        
}
