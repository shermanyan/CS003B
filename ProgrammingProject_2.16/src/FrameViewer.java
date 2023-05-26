/*
Author: Sherman Yan
Input - None
Output - Graphics program
Processing - Modify given code
 */

import java.awt.*;
import java.util.Objects;
import javax.swing.*;

public class FrameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Hello, Sherman!");
        label.setOpaque(true);
        label.setBackground(new Color(152, 251, 152));

        ImageIcon img = new ImageIcon(Objects.requireNonNull(FrameViewer.class.getResource("monkey.jpeg")));
        JLabel icon = new JLabel(new ImageIcon(img.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));

        panel.add(label);
        panel.add(icon);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/* Sample Run

 */