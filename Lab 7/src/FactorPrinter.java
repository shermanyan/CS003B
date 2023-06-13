/*
Author: Sherman Yan, Henry Thai
Input: Positive integer
Processing: Generate factors for input
Output: Factors of input
 */
import java.util.Scanner;

/**
 * This class prints factors of user inputted numbers using the FactorGenerator class
 */
public class FactorPrinter {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Get the input number from user and validates it
     * @return valid number
     */
    private static int getInput(){
        // Read an integer from the user
        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();


        if (input <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            input = getInput();
        }


        return input;

    }

    /**
     * Outputs the input's factors to the terminal
     * @param input input integer
     */
    private static void output(int input){

        FactorGenerator generator = new FactorGenerator(input);
        System.out.print("Prime factors of " + input + ": ");

        while (generator.hasMoreFactors()) {
            System.out.print(generator.nextFactor() );

            if (generator.hasMoreFactors()){
                System.out.print( " x ");
            }
        }

        System.out.println();

    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {

        do{
            int input = getInput();
            output(input);

            System.out.print("Get prime factors for new number? Y for yes or any key to exit: ");

        } while (scanner.next().equals("Y"));

        scanner.close();

    }
}

/* Sample Run
Enter a positive integer: -1
Invalid input. Please enter a positive integer.
Enter a positive integer: 12345
Prime factors of 12345: 3 x 5 x 823
Get prime factors for new number? Y for yes or any key to exit: Y
Enter a positive integer: 2520
Prime factors of 2520: 2 x 2 x 2 x 3 x 3 x 5 x 7
Get prime factors for new number? Y for yes or any key to exit: Y
Enter a positive integer: 150
Prime factors of 150: 2 x 3 x 5 x 5
Get prime factors for new number? Y for yes or any key to exit: N
 */

