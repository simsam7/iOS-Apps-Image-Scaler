/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iconimagescaler;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author sam
 */
public class IconImageScaler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        setLookAndFeel();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//Here I'm loading whatever I want to have show up first, I'm keeping the rest of this class clean so that I can launch other forms from it
                Main m = new Main();
                m.setTitle("Image Resizer");
                m.setIconImage(new ImageIcon(getClass().getResource("icon_56x56.png")).getImage());
                m.setVisible(true);


            }
        });
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
}
