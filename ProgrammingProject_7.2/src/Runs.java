/*
Author: Sherman Yan
 */
import java.util.ArrayList;
import java.util.Random;

/**
 * Runs class that prints runs for dice rolls
 */
public class Runs {

    ArrayList<Integer> values = new ArrayList<Integer>();

    /**
     * Default constructor that generates random 20 dice rolls
     */
    Runs(){
        reroll();
    }

    /**
     * Constructor that uses the given array for processing
     * @param rolls array
     */
    Runs(int[] rolls){

        for (int i : rolls) {
            values.add(i);
        }

    }

    /**
     * Regenerate new dice rolls
     */
    public void reroll(){
        Random ran = new Random();

        values.clear();

        for (int i = 0; i< 20 ;i++){
            values.add(ran.nextInt(6)+1);
        }
    }
    /**
     * Print the runs in the simulated dice roll to the terminal
     */
    public void printRuns() {
        boolean inRun = false;

        for (int i = 0; i < values.size(); i++) {
            if (inRun && !values.get(i).equals(values.get(i - 1))) {
                System.out.print(')');
                inRun = false;
            }
            if (!inRun && i + 1 < values.size() && values.get(i).equals( values.get(i + 1))) {
                System.out.print('(');
                inRun = true;
            }

            System.out.print(values.get(i));
        }
        if (inRun){
            System.out.print(')');
        }

    }
}
