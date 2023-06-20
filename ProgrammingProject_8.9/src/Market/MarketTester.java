/*
Author: Sherman Yan, Henry Thai
Input: None
Processing: Generate sample of a market ordering, checkout, and printing an invoice.
Output: See Sample run
 */

package Market;

/**
 * Class to test the Customer, Order, ShoppingCart classes
 */
public class MarketTester {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Smith", "123 Main St, Pasadena CA, 91103", 1234556123);

        // Create a shopping cart for the customer
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Item 1", 50.0);
        cart.addItem("Item 2", 40.0);

        // Get the cart items
        Item[] items = cart.getCart();

        // Create an order with the items from the cart
        Order order = new Order(items);

        // Checkout the order
        order.checkout();

        // Get the invoice
        String invoice = order.getInvoice();

        // Print the invoice
        System.out.println(invoice);

        // Make additional purchases
        cart.addItem("Item 3", 15.0);
        cart.addItem("Item 4", 10.0);

        cart.removeItem("Item 3");

        // Get the updated cart items
        items = cart.getCart();

        // Create a new order with the updated items
        order = new Order(items);

        // Checkout the order
        order.checkout();

        // Get the updated invoice
        invoice = order.getInvoice();

        // Print the updated invoice
        System.out.println(invoice);
    }
}

/* Sample Run
-------Invoice-------
---------------------
Item 1: $50.00
Item 2: $40.00
Subtotal: $90.00
Discount: $0.00
Total: $90.00
Thanks for Shopping!
---------------------

-------Invoice-------
---------------------
Item 1: $50.00
Item 2: $40.00
Item 3: $15.00
Item 4: $10.00
Subtotal: $115.00
Discount: $10.00
Total: $105.00
Thanks for Shopping!
---------------------
 */