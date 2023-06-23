/*
Author: Sherman Yan
Description: This class will handle the payment process,
integrating with a payment gateway to process credit cards or other payment methods.
 */
package OnlineBookstoreManagementSystem;

import java.util.Random;
import java.util.Scanner;

/**
 * This class will handle the payment process,
 * integrating with a payment gateway to process credit cards or other payment methods.
 */
public class Payment {
    static private final Scanner in = new Scanner(System.in);

    /**
     * Request payment
     * @return true if payment confirmed, false if declined
     */
    public static boolean requestPayment(double amount){

        System.out.printf("Amount Due: $%.2f%n", amount);
        System.out.println("Select from the following payment methods");
        System.out.println("A - Credit Card");
        System.out.println("B - Cash");

        String option = in.next();

        switch (option) {
            case "A" -> {
                return promptCreditCard(amount);
            }
            case "B" -> {
                return promptCash(amount);
            }
            default -> {
                System.out.println("Error: Invalid input, try again");
                return requestPayment(amount);
            }
        }

    }

    /**
     * Prompt a credit card payment option
     * @param amount how much to request
     * @return true if payment successful else false
     */
    private static boolean promptCreditCard(double amount){
        String num = "";
        do {
            System.out.print("Enter card number: ");

            num = in.next();

            if(num.length() != 10){
                System.out.println("Error: Invalid card number, try again");
                num = "";
            }

        } while (num.isEmpty());


        Random random = new Random();

        //Random card acceptance
        if(random.nextBoolean()){

            System.out.print("Insufficient Funds. Would you like to try another card? (Y or any key to cancel): ");
            String input = in.next();

            switch (input) {
                case "Y" -> {
                    return promptCreditCard(amount);
                }
                case "N" -> {
                    return false;
                }
                default -> {
                    System.out.println("Payment cancelled...");
                    return false;
                }
            }
        } else {
            System.out.println("Payment accepted...");
            System.out.println("Payment complete...");
            return true;
        }

    }

    /**
     * Prompt a cash payment option
     * @param amount how much to request
     * @return true if payment successful else false
     */
    private static boolean promptCash(double amount){

        double cash = 0;

        do{
            System.out.print("Enter cash amount: ");
            cash += in.nextDouble();

            if(cash < amount){
                System.out.print("Insufficient funds, Would you like to enter more (Y or any key to cancel)?: ");
                String option = in.next();
                if (!option.equals("Y")) {
                    System.out.println("Payment cancelled...");
                    return false;
                } else {
                    System.out.printf("Balance Remaining: $%.2f %n", amount - cash);
                }
            }

        } while (cash < amount);

        if(cash > amount){
            System.out.printf("Your change: $%.2f%n", Math.abs(amount - cash));
        }

        System.out.println("Payment complete...");

        return true;

    }
}
