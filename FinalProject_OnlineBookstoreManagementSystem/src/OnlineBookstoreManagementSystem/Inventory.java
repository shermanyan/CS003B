/*
Author: Sherman Yan
Description: This class will manage the inventory of books in the online bookstore
It will provide methods for adding new books, updating book details, searching for books,
and removing books from the inventory.
 */

package OnlineBookstoreManagementSystem;

import java.util.ArrayList;

/**
 * This class will manage the inventory of books in the online bookstore.
 * It will provide methods for adding new books, updating book details, searching for books,
 * and removing books from the inventory.
 */
public class Inventory {
    private final ArrayList<Book> books;

    /**
     * Default constructor creates an empty inventory of books
     */
    public Inventory() {
        books = new ArrayList<>();
    }

    /**
     * Add a new book to inventory
     *
     * @param book book to add
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Remove book from inventory
     *
     * @param book book to remove
     */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /**
     * Change book availability
     * @param book book to change
     * @param availability true or false
     */
    public void changeBookAvailability(Book book, boolean availability) {
        books.get(books.indexOf(book)).setAvailability(availability);
    }

    /**
     * Returns a list of books in the inventory
     *
     * @return String of books and details
     */
    public String browseBooks() {
        String output = "--Inventory--\n";
        int counter = 1;
        for (Book b: books){
            output += counter++ + ": ";
            output += b.toString() + "\n";
        }
        return output;
    }

    /**
     * Get the book based on title
     * @param title title of book
     * @return empty book if not found
     */
    public Book getBook(String title){
        for (int i = 0; i< books.size(); i++) {
            if(books.get(i).getTitle().equals(title)) {
                return books.get(i);
            }
        }
        return new Book();
    }
}
