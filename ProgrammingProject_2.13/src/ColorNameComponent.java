import javax.swing.*;
import java.awt.*;

public class ColorNameComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Color[] colors = new Color[]{Color.BLACK,Color.BLUE,Color.CYAN,
                                    Color.GRAY,Color.darkGray,Color.LIGHT_GRAY,
                                    Color.GREEN,Color.MAGENTA,Color.ORANGE,
                                    Color.PINK,Color.RED,Color.YELLOW};

        int charSize = getFont().getSize();

        for (int i =0; i < colors.length ; i++) {
            g2.setColor(colors[i]);
            g2.drawString("Hello, World!", 10, 20 + (charSize * i));
        }
    }
}
