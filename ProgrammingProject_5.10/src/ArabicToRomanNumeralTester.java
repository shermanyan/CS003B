/*
Author: Sherman Yan, Henry Thai
Input: Year between 1000 and 3999
Processing: Validate input and convert to roman numerals
Output: Result of conversion
 */

import java.util.Scanner;

/**
 * This class tests the ArabicToRomanNumeral class
 */
public class ArabicToRomanNumeralTester {
    private static final Scanner IN = new Scanner(System.in);

    /**
     * Get input from user validates and returns
     * @return input
     */
    private static int getInput(){

        System.out.print("Enter arabic year between 1000 and 3999?: ");

        int input = IN.nextInt();

        if (!ArabicToRomanNumeral.validateYear(input)){
            System.out.println("ERROR: Invalid year entered.");
            input = getInput();
        }

        return input;

    }

    /**
     * Gets input and converts it to roman numerals
     * @param args
     */
    public static void main(String[] args) {

        int input = getInput();

        System.out.println("The year " + input + " in Roman Numerals is: " + ArabicToRomanNumeral.convert(input));


    }
}

/* Sample Output
Enter arabic year between 1000 and 3999?: 100
ERROR: Invalid year entered.
Enter arabic year between 1000 and 3999?: 12345
ERROR: Invalid year entered.
Enter arabic year between 1000 and 3999?: 2510
The year 2510 in Roman Numerals is: MMDX
 */