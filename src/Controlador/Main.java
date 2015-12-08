
package Controlador;

import Vistas.Vista_Principal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author MrDrulix
 */
public class Main {
    static Vista_Principal v;
    public static void main(String args[]){
        try {
            UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());
            
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
            SwingUtilities.updateComponentTreeUI(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Controlador(new Vista_Principal()).iniciarMain();
    }
}
