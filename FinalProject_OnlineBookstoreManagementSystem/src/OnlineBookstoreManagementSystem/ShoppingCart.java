/*
Author: Sherman Yan
Description: This class will represent a customer's shopping cart,
allowing them to add and remove books before proceeding to checkout.
 */
package OnlineBookstoreManagementSystem;

/**
 * This class will represent a customer's shopping cart,
 * allowing them to add and remove books before proceeding to checkout.
 */

import java.util.ArrayList;

/**
 * This class represents a customer's shopping cart
 */
public class ShoppingCart {
    private ArrayList<Book> books;

    /**
     * Constructor to create an empty shopping cart
     */
    public ShoppingCart() {
        books = new ArrayList<>();
    }

    /**
     * Add Book to cart
     * @param book book to add
     */
    public void addBook(Book book){
        books.add(book);
    }

    /**
     * remove a Book
     * @param book book to remove
     */
    public void removeBook(Book book) {
        books.remove(book);
    }
    /**
     * Get the cart
     * @return cart
     */
    public Book[] getCart(){
        Book[] output = new Book[books.size()];
        for (int i = 0 ;i < output.length ; i++){
            output[i] = books.get(i);
        }
        return output;
    }
}
