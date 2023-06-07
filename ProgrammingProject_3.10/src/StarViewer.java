/*
Author: Sherman Yan
Input: None
Processing: Creates three stars
Output: Graphic output of three stars
 */

import javax.swing.*;

/**
 * The viewer class for StarComponent
 */
public class StarViewer
{
   /**
    * Main for the executable
    * @param args
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(400, 400);
      frame.setTitle("Three Stars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      StarComponent component = new StarComponent();

      frame.add(component);
      frame.setVisible(true);
   }
}

