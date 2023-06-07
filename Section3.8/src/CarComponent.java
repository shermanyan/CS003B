import java.awt.*;
import javax.swing.JComponent;

/**
   This component draws two car shapes.
*/
public class CarComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Car car1 = new Car(60, 60);
      Car car2 = new Car(120,60);
      Car car3 = new Car(180, 60);
      Car car4 = new Car(90, 100);

      car4.setScale(2);

      car1.setColor(Color.YELLOW);
      car2.setColor(Color.RED);
      car3.setColor(Color.WHITE);

      car1.draw(g2);
      car2.draw(g2);
      car3.draw(g2);
      car4.draw(g2);

   }
}

