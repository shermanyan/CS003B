/*
Author: Sherman Yan
Input: none
Processing: generate 20 random dice rolls and find longest runs (two or more adjacent rolls)
Output: Parentheses around the longest runs
 */

/**
 * Class to test the LongestRuns class
 */
public class LongestRunsTester {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        LongestRuns r = new LongestRuns();
        r.printRuns();
    }
}

/* Sample Run
3664415352216131(444)1
 */