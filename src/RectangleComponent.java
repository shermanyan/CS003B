import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;


public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);
        g2.fill(new Rectangle(0, 0, 500, 500));

        g2.setColor(Color.YELLOW);
        g2.fill(new Rectangle(125, 125, 250, 250));

    }

}

