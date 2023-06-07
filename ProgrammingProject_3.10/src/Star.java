/*
Author: Sherman Yan
 */
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Star
{

   private int xLeft, yTop;
   private static final int WIDTH = 100, HEIGHT = 100;

   /**
      Constructs a star with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
   */
   public Star(int x, int y)
   {
      xLeft = x;
      yTop = y;
   }

   /**
      Draws the star.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      /*
      a b c
      d   e
      f g h
       */

      Point2D.Double a = new Point2D.Double(xLeft,yTop);
      Point2D.Double b = new Point2D.Double(xLeft + (WIDTH / 2.d), yTop);
      Point2D.Double c = new Point2D.Double(xLeft + WIDTH, yTop);
      Point2D.Double d = new Point2D.Double(xLeft, yTop + (HEIGHT / 2.d));
      Point2D.Double e = new Point2D.Double(xLeft+ WIDTH, yTop + (HEIGHT/ 2.d));
      Point2D.Double f = new Point2D.Double(xLeft, yTop +HEIGHT);
      Point2D.Double g = new Point2D.Double(xLeft + (WIDTH/ 2.d) ,yTop +HEIGHT);
      Point2D.Double h = new Point2D.Double(xLeft + WIDTH,yTop + HEIGHT);


      Line2D.Double horz = new Line2D.Double(d, e);
      Line2D.Double vert = new Line2D.Double(b, g);
      Line2D.Double cross1 = new Line2D.Double(a, h);
      Line2D.Double cross2 = new Line2D.Double(c, f);


      g2.draw(horz);
      g2.draw(vert);
      g2.draw(cross1);
      g2.draw(cross2);


   }
}

