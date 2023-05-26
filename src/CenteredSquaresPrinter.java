import java.awt.Rectangle;

public class CenteredSquaresPrinter {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(100,100,200,200);

        System.out.println("Before: " + square);
        System.out.println("Expected: x=100,y=100,width=200,height=200");

        square.grow(-square.width / 4,-square.height / 4);
        square.translate(-square.width/2, -square.height/2);

        System.out.println("After: " + square);
        System.out.println("Expected: x=100,y=100,width=100,height=100");

    }
}