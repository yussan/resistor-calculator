package Control;

import javax.swing.JOptionPane;


public class Resistor_Main {

    public Resistor_Main() {
    }
     // Method
    public void openingScene() {
        
    }

    public void closingScene() {
        if (JOptionPane.showConfirmDialog(null, "Aplikasi Akan Ditutup?", "Caution",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
          		System.exit(0);
            } 
    }
       
}