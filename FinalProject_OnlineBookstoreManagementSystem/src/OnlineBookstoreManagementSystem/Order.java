/*
Author: Sherman Yan
Description: This class will handle the process of placing orders. It will have methods for adding items to order,
calculating the total cost, applying discounts, and generating an invoice
and removing books from the inventory.
 */
package OnlineBookstoreManagementSystem;

/**
 * This class will handle the process of placing orders. It will have methods for adding items to order,
 * calculating the total cost, applying discounts, and generating an invoice
 */
public class Order {
    private boolean paid;
    private Book[] books;
    private static double DISCOUNT_THRESHOLD = 100;

    private double total, discount;

    /**
     * Default Constructor create a sample order
     */
    public Order() {
        this(new Book[]{new Book("Book1","Author","Genre",123.00)});
    }

    /**
     * Constructor that takes in an array of items
     * @param books books to add
     */
    public Order(Book[] books) {
        this.books = books;
        total = 0;
        discount = 0;
    }

    /**
     * Calculate the cost of the items
     */
    private void calculateCost() {

        total = 0;

        for (Book i : books) {
            total += i.getPrice();
        }
    }

    /**
     * Apply the discount of 10 dollars if DISCOUNT_THRESHOLD reached
     */
    private void applyDiscount() {
        if (total > DISCOUNT_THRESHOLD) {
            discount = 10;
            total -= discount;
        }
    }

    /**
     * Checkout the order
     */
    public void checkout() {
        calculateCost();
        applyDiscount();

        if( Payment.requestPayment(total)){
            System.out.println("Purchase completed...");
            paid = true;
        } else{
            System.out.println("Purchase incomplete...");
        }
    }

    /**
     * Get invoice
     *
     * @return invoice
     */
    public String getInvoice() {
        String invoice = "";

        invoice += "---------------------\n";

        if (paid) {
            invoice += "-------Invoice-------\n";
        } else {
            calculateCost();
            applyDiscount();
            invoice += "-PAYMENT--INCOMPLETE-\n";
        }

        invoice += "---------------------\n";

        for (Book i : books) {
            invoice += i.getTitle() + ": $" + String.format("%.2f", i.getPrice()) + "\n";
        }

        invoice += "Subtotal: $" + String.format("%.2f", (discount + total)) + "\n";
        invoice += "Discount: $" + String.format("%.2f", discount) + "\n";
        invoice += "Total: $" + String.format("%.2f", total) + "\n";

        if (paid) {
            invoice += "Thanks for Shopping!\nHappy reading!\n";
        }

        invoice += "---------------------\n";


        return invoice;
    }

    /**
     * Check if order is paid
     * @return true if paid
     */
    public boolean isPaid() {
        return paid;
    }
}