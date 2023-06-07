import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Car
{
   private int xLeft;
   private int yTop;

   private Color bodyColor = null;
   private int scale = 1;

   /**
      Constructs a car with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
   */
   public Car(int x, int y)
   {
      xLeft = x;
      yTop = y;
   }

   public void setScale(int scale){
      this.scale = scale;
   }

   /**
      Draws the car.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle body = new Rectangle(xLeft, yTop + (10 * scale), 60 * scale, 10 * scale);
      Ellipse2D.Double frontTire 
         = new Ellipse2D.Double(xLeft + (10 * scale), yTop + (20 * scale), 10 * scale, 10 * scale);
      Ellipse2D.Double rearTire 
         = new Ellipse2D.Double(xLeft + (40 * scale), yTop + (20 * scale), 10 * scale, 10 * scale);

      // The bottom of the front windshield
      Point2D.Double r1 = new Point2D.Double(xLeft + 10 * scale, yTop + (10 * scale));
      // The front of the roof
      Point2D.Double r2 = new Point2D.Double(xLeft + 20 * scale, yTop);
      // The rear of the roof
      Point2D.Double r3 = new Point2D.Double(xLeft + 40 * scale, yTop );
      // The bottom of the rear windshield
      Point2D.Double r4 = new Point2D.Double(xLeft + 50 * scale, yTop + (10 * scale) );

      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

      if (bodyColor != null) {
         g2.setColor(bodyColor);
         g2.fill(body);
         g2.setColor(Color.BLACK);
      }

      g2.fill(frontTire);
      g2.fill(rearTire);


      g2.draw(body);
      g2.draw(frontWindshield);
      g2.draw(roofTop);
      g2.draw(rearWindshield);
      g2.draw(frontTire);
      g2.draw(rearTire);


   }

   public void setColor(Color color) {
      bodyColor = color;
   }
}

