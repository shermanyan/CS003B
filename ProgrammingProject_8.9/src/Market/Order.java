/*
Author: Sherman Yan, Henry Thai
 */
package Market;

/**
 * This class will handle the process of placing orders
 */
public class Order {
    private Item[] items ;

    private static double DISCOUNT_THRESHOLD = 100;

    private double total = 0, discount = 0;

    /**
     * Constructor that takes in an array of items
     * @param items
     */
    public Order(Item[] items) {
        this.items = items;
    }

    /**
     * Calculate the cost of the items
     */
    private void calculateCost(){
        for (Item i: items){
            total += i.cost;
        }
    }

    /**
     * Apply the discount of 10 dollars if DISCOUNT_THRESHOLD reached
     */
    private void applyDiscount(){
        if (total > DISCOUNT_THRESHOLD){
            discount = 10;
            total -= discount;
        }
    }

    /**
     * Checkout the order
     */
    public void checkout(){
        calculateCost();
        applyDiscount();
    }

    /**
     * Get invoice
     * @return invoice
     */
    public String getInvoice(){

        String invoice = "";

        invoice += "-------Invoice-------\n";
        invoice += "---------------------\n";


        for (Item i: items){
            invoice += i.name + ": $" + String.format("%.2f", i.cost) + "\n";
        }

        invoice += "Subtotal: $" + String.format("%.2f", (discount + total)) + "\n";
        invoice += "Discount: $" + String.format("%.2f", discount) + "\n";
        invoice += "Total: $" + String.format("%.2f", total) + "\n";

        invoice += "Thanks for Shopping!\n";

        invoice += "---------------------\n";

        return invoice;

    }
}
