
package MetodoGeneral;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MetodoGeneral {
    public static void colocarImagen(JLabel lbl, String ruta) {
        ImageIcon image = new ImageIcon(ruta);
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
    }
}
