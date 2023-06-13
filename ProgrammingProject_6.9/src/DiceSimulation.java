/*
Author: Sherman Yan
Input: None
Processing: Simulates two die games.
            Game 1 calculates how many times you can roll a 6 when rolling the die 4 times
            Game 2 calculates how many times you can roll two 6's when rolling two die 24 times
Output: Results show that you have an average higher chance of winning game 1
        and most likely will lose game 2
 */


import java.util.Random;

/**
 * Dice Simulation class that prints the simulated dice games
 */
public class DiceSimulation {

    /**
     * Main of the class
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("---Game 1---");

        Random dice = new Random();

        int win = 0, lose = 0;
        boolean won = false;

        for(int i = 0;i <1000000; i++){
            for(int j = 0; j<4 && !won ; j++){
                if(dice.nextInt(6) + 1 == 6) {
                    win++;
                    won = true;
                }
            }
            if (!won) {
                lose++;
            }
            won = false;
        }
        System.out.println("Win: " + win);
        System.out.println("Lose: " + lose);


        System.out.println("---Game 2 --");

        win = 0;
        lose = 0;
        won = false;

        for(int i = 0;i <1000000; i++){
            for(int j = 0; j<4 && !won ; j++){
                if(dice.nextInt(6) + 1 == 6 && dice.nextInt(6) + 1 == 6 ) {
                    win++;
                    won = true;
                }
            }
            if (!won) {
                lose++;
            }
            won = false;
        }

        System.out.println("Win: " + win);
        System.out.println("Lose: " + lose);
    }
}

/* Sample Output
---Game 1---
Win: 517187
Lose: 482813
---Game 2 --
Win: 107120
Lose: 892880
 */