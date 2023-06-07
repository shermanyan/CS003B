/*
Author: Sherman Yan
 */
import javax.swing.*;
import java.awt.*;

/**
   This component draws three star shapes.
*/
public class StarComponent extends JComponent
{
   /**
    * Draws three stars
    * @param g the <code>Graphics</code> object to protect
    */
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Star star1 = new Star(10,10);
      Star star2 = new Star(120, 10);
      Star star3 = new Star(230, 10);

      star1.draw(g2);
      star2.draw(g2);
      star3.draw(g2);

   }
}

