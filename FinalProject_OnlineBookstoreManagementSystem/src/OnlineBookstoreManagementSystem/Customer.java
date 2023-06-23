/*
Author: Sherman Yan
Description: This class will manage the inventory of books in the online bookstore
It will provide methods for adding new books, updating book details, searching for books,
and removing books from the inventory.
 */
package OnlineBookstoreManagementSystem;

/**
 * This class will store customer information, including name, phone number, and address.
 * It also provides methods for registering new customers and managing their information
 */
public class Customer {
    private String name, address;
    private int phoneNumber;
    private ShoppingCart cart;
    /**
     * Constructor that creates a customer profile
     *
     * @param name        name of customer
     * @param address     address of customer
     * @param phoneNumber phone number of customer
     */
    public Customer(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cart = new ShoppingCart();
    }

    /**
     * Get the name of customer
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Modify the name of customer
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address of customer
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Modify address of customer
     *
     * @param address new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the phone number of customer
     *
     * @return phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Modify the phone number
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Add book to shopping cart
     * @param book
     */
    public void addToShoppingCart(Book book){
        cart.addBook(book);
    }

    /**
     * Remove book from cart
     * @param book book to remove
     */
    public void removeFromCart(Book book){
        cart.removeBook(book);
    }

    /**
     * Get the customers shopping cart
     * @return shopping cart of customer
     */
    public Book[] getCart() {
        return cart.getCart();
    }
}
