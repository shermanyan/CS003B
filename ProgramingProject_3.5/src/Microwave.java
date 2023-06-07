/*
Author: Sherman Yan, Henry Thai
 */

/**
 A class that simulates the features of a microwave.
 */
public class Microwave {
    private int timeInSeconds;
    private int powerLevel;

    /**
     * Constructs a microwave with default cooking time 0 and power level 0
     */
    public Microwave() {
        timeInSeconds = 0;
        powerLevel = 1;
    }

    /**
     * Increments the cooking time by 30 seconds
     */
    public void increaseTime() {
        timeInSeconds += 30;
    }

    /**
     * Increments the power level by 1
     */
    public void switchPowerLevel() {
        if (powerLevel == 1) {
            powerLevel = 2;
        } else {
            powerLevel = 1;
        }
    }

    /**
     * Resets the microwave. Sets time to 0 and power level to 1
     */
    public void reset() {
        timeInSeconds = 0;
        powerLevel = 1;
    }

    /**
     * Starts the microwave
     */
    public void start() {
        System.out.println("Cooking for " + timeInSeconds + " seconds at level " + powerLevel + ".");
    }
}
