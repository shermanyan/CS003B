/*
Author: Sherman Yan
 */
import java.util.ArrayList;
import java.util.Random;

/**
 * Runs class that prints runs for dice rolls
 */
public class LongestRuns{

    ArrayList<Integer> values = new ArrayList<Integer>();

    /**
     * Default constructor that generates random 20 dice rolls
     */
    LongestRuns(){
        reroll();
    }

    /**
     * Constructor that uses the given array for processing
     * @param rolls array
     */
    LongestRuns(int[] rolls){

        for (int i : rolls) {
            values.add(i);
        }

    }

    /**
     * Regenerate new dice rolls
     */
    public void reroll(){
        Random ran = new Random();

        for (int i = 0; i< 20 ;i++){
            values.add(ran.nextInt(6)+1);
        }
    }

    /**
     * Get the longest run index
     * @return index of the longest run
     */
    private int getLongestRunIndex(){
        int longest = 0, pos = -1;
        int counter = 0, runPos = 0;
        boolean inRun = false;

        for (int i = 0; i < values.size(); i++) {
            if (inRun && !values.get(i).equals(values.get(i - 1))) {
                inRun = false;
                if (counter > longest){
                    longest = counter;
                    pos = runPos;
                }
            }
            if (!inRun && i + 1 < values.size() && values.get(i).equals( values.get(i + 1))) {
                inRun = true;
                counter = 0;
                runPos = i;
            }

            if (inRun){
                counter++;
            }
        }
        if (inRun){
            if (counter > longest){
                pos = runPos;
            }
        }

        return pos;
    }
    /**
     * Print () around the longest roll in the simulated dice roll to the terminal
     */
    public void printRuns() {

        int pos =  getLongestRunIndex();

        boolean inRun = false;

        for (int i = 0; i < values.size(); i++) {

            if (!inRun && i == pos) {
                inRun = true;
                System.out.print('(');
            }
            if (inRun && !values.get(i).equals(values.get(pos))) {
                System.out.print(')');
                inRun = false;
            }

            System.out.print(values.get(i));

        }
        if (inRun){
            System.out.print(')');
        }

    }
}
