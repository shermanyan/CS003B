/*
Author: Sherman Yan
Input: none
Processing: generate 20 random dice rolls and find runs (two or more adjacent rolls)
Output: Parentheses around the runs
 */

/**
 * Class to test the Runs class
 */
public class RunsTester {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        Runs r = new Runs();
        r.printRuns();
    }
}

/* Sample Run
(11)(44)(22222)56(44)(33)4(66)21
 */