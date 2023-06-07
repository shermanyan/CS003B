/*
Author: Sherman Yan, Henry Thai
Input: None
Processing: Creates a microwave and tests its methods
Output: Sample of how the microwave class could be used
 */

/**
 A class to test the Microwave class
 */
public class MicrowaveTester {
    public static void main(String[] args) {
        Microwave microwave = new Microwave();

        microwave.increaseTime(); // Press the increase time button
        microwave.switchPowerLevel(); // Press the power level button
        microwave.start(); // Press the start button

        microwave.reset(); // Press the reset button
        microwave.start(); // Press the start button after resetting
    }
}

/* Sample Output
Cooking for 30 seconds at level 2.
Cooking for 0 seconds at level 1.
 */