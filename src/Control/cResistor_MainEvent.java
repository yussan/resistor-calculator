package Control;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cResistor_MainEvent  {
    public cResistor_MainEvent() {
    //super();
    }

    // Method
    public void openingScene() {
        
    }

    public void closingScene() {
        if (JOptionPane.showConfirmDialog(null, "aplication will close", "Caution",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void changePanel(JPanel panelA, JPanel panelB) {
        if(panelA.isVisible()) {
            panelA.setVisible(false);
            panelB.setVisible(true);
        } 
    }    
}
