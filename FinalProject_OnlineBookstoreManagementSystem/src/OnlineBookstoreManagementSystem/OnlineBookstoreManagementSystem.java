/*
Author: Sherman Yan
Description: This class will represent the system with interface methods to register customers,
add books to inventory, browse inventory, place order, and print invoice
 */
package OnlineBookstoreManagementSystem;

import java.util.ArrayList;

/**
 * This class represents the system with interface methods to register customers,
 * add books to inventory, browse inventory, place order, and print invoice
 */
public class OnlineBookstoreManagementSystem {
    private Inventory inventory;
    private ArrayList<Customer> customers;
    private ArrayList<Order> orders;

    /**
     * Default constructor with empty inventory, customers, and orders
     */
    public OnlineBookstoreManagementSystem() {

        inventory = new Inventory();
        customers = new ArrayList<>();
        orders = new ArrayList<>();
    }

    /**
     * Register a customer
     * @param customer new customer
     */
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Browse books
     * @return String of the inventory
     */
    public String browseBooks() {
        return inventory.browseBooks();
    }

    /**
     * Add book to inventory
     * @param book book to add
     */
    public void addBook(Book book){
        inventory.addBook(book);
    }

    /**
     * Add book to customer's shopping cart
     * @param customer customer to add
     * @param bookTitle book title to add
     */
    public void addToShoppingCart(Customer customer, String bookTitle) {
        customer.addToShoppingCart(inventory.getBook(bookTitle));
    }

    /**
     * Place customer's order
     * @param customer customer to place order for
     */
    public void placeOrder(Customer customer) {
        Order order = new Order(customer.getCart());

        //Checkout
        order.checkout();

        //Print invoice
        System.out.print(order.getInvoice());

        //Change availability
        if(order.isPaid()){
            for(Book b: customer.getCart()){
                inventory.changeBookAvailability(b,false);
            }
        }
        //Save order
        orders.add(customers.indexOf(customer),order);
    }

    /**
     * Print invoice for customer
     * @param customer customer to print invoice for
     */
    public void printInvoice(Customer customer){

        orders.get(customers.indexOf(customer)).getInvoice();

    }
}
