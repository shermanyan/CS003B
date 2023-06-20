/*
Author: Sherman Yan
 */
package Customer;

import java.util.ArrayList;

/**
 * Class that holds the total purchases and stores the customer shopped at
 */
public class Customer {
    private ArrayList<Integer> shops = new ArrayList<>();
    private double total;

    private final double DISCOUNT_THRESHOLD = 100;

    /**
     * Default constructor creates a 0 shopping total and store count
     */
    public Customer() {
        total = 0;
    }

    /**
     * Logs the purchases the customer made
     * @param amount the amount made
     * @param shopId the id of the store
     */
    public void makePurchase(double amount, int shopId) {
        total += amount;
        if (shopId >= 1 && shopId <= 20 && !this.shops.contains(shopId)) {
            this.shops.add(shopId);
        }
    }

    /**
     * Check the status of the customer getting the discount
     * @return Returns true if discount threshold of 100 is met
     */
    public boolean discountReached() {
        return (total >= DISCOUNT_THRESHOLD) && shops.size() >= 3;
    }

    /**
     * Print the status and detail of the customer to the console
     */
    public void printStatus() {
        System.out.printf("Total: $%.2f%n",total);
        System.out.println("Store Count: " + shops.size());

    }
}
