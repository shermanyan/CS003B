import javax.swing.*;
import java.util.Random;

public class LotteryPrinter {

    public static void main(String[] args) {
        Random numGenerator = new Random();
        String combination = "";

        for (int i = 0; i <6 ; i++) {
            combination += numGenerator.nextInt(49) + 1;
            combination += " ";
        }

        System.out.println("Play this combination—it’ll make you rich!: " + combination);

    }
}
