import javax.swing.*;

public class ColorNameViewer {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(500, 500);

        frame.setTitle("12 String Viewer");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorNameComponent component = new ColorNameComponent();
        frame.add(component);

        frame.setVisible(true);

    }

}
