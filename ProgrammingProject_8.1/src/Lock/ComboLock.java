/*
Author: Sherman Yan
 */

package Lock;

import java.util.Arrays;

public class ComboLock
{
    private int[] secret , combo;

    private char[] turnPattern;
    private int comboIdx;
    private final int MAX_POS = 39;
    private char[] TURN_PATTERN_SECRET = new char[]{'R','L','R'};


    /**
     * Constructor to create a combo lock with the three secrets
     * @param secret1
     * @param secret2
     * @param secret3
     */
    public ComboLock(int secret1, int secret2, int secret3) {
        secret = new int[]{secret1,secret2,secret3};
        reset();
    }

    /**
     * Reset the lock to combo 0;
     */
    public void reset() {
        combo = new int[]{0,0,0};
        turnPattern = new char[3];
        comboIdx = 0;
    }

    /**
     * Turn left by given ticks
     * @param ticks
     */
    public void turnLeft(int ticks) {
        int newPos = (combo[Math.max(comboIdx - 1, 0)] + ticks) % 40;

        if(turnPattern[comboIdx] == 'L') {
            combo[comboIdx - 1] = newPos;
        } else{
            turnPattern[comboIdx] = 'L';
            combo[comboIdx] = newPos;
            comboIdx++;
        }

    }

    /**
     * Turn right by given ticks
     * @param ticks
     */
    public void turnRight(int ticks) {
        int newPos = (combo[Math.max(comboIdx - 1, 0)] - ticks) % 40;

        if(newPos < 0){
            newPos = 40 + newPos;
        }

        if(turnPattern[comboIdx] == 'R') {
            combo[comboIdx - 1] = newPos;
        } else{
            turnPattern[comboIdx] = 'R';
            combo[comboIdx] = newPos;
            comboIdx++;
        }
    }

    /**
     * Attempt to open the lock
     * @return true if open, false if incorrect combo
     */
    public boolean open() {
        return (Arrays.equals(combo, secret) && Arrays.equals(turnPattern, TURN_PATTERN_SECRET));
    }

    /**
     * Print the status of the combo lock
     */
    public void printStatus(){
        System.out.println("Combo: " + Arrays.toString(combo));
        System.out.println("Turn Pattern: " + Arrays.toString(turnPattern));

    }
}