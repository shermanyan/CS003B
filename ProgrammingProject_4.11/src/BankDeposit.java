/*
Author: Sherman Yan, Henry Thai
Input: none
Processing: calculates interest after 3 months
Output: balance after each month
 */

/**
 * Prints the initial balance, calculates and displays the balances after the first three months
 */
public class BankDeposit {
    private static final double ANNUAL_INTEREST_RATE = 6.0;

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        double initialBalance = 1000.00;
        double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12.0 / 100.0;

        System.out.printf("Initial balance: $%.2f%n", initialBalance);
        System.out.printf("Annual interest rate: %.1f%%%n", ANNUAL_INTEREST_RATE);

        for (int month = 1; month <= 3; month++) {
            double interest = initialBalance * monthlyInterestRate;
            initialBalance += interest;

            System.out.printf("After month %d: $%.2f%n", month, initialBalance);
        }
    }
}

/* Sample Output
Initial balance: $1000.00
Annual interest rate: 6.0%
After month 1: $1005.00
After month 2: $1010.03
After month 3: $1015.08

 */