/*
Author: Sherman Yan
Input: a number
Processing: Discard all from input but the last three digits,
            reverse the digits subtract the original from the reversed,
            reverse the digits of the difference,
            adds the difference and the reversed difference,
            print the sum.
Output: The sum
 */

import java.util.Scanner;

/**
 * This class processes the last three digits of a user inputted number
 */
public class NumberProcessing{

    /**
     * Reverses an integer
     * @param input input integer
     * @return reversed integer
     */
    private static int reverseNumber(int input){
        int r = 0, n = String.valueOf(input).length();
        for (int i = 0; i < n; i++) {
            r += (int)(input % Math.pow(10, i + 1) / Math.pow(10, i)) * Math.pow(10, n-1-i);
        }
        return r;
    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args){

        int number, diff = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");

        number = in.nextInt();

        if(number > 100){
            number = number % 1000;
        }

        System.out.println("Input: " + number);

        System.out.println("Reversed: " + reverseNumber(number));

        diff = Math.abs(reverseNumber(number) - number);

        System.out.println("Difference: " + diff);

        System.out.println("Reversed: " + reverseNumber(diff));

        System.out.println("Sum: " + (diff + reverseNumber(diff)));

    }

}

/* Sample Run
Enter a number: 12345
Input: 345
Reversed: 543
Difference: 198
Reversed: 891
Sum: 1089
 */