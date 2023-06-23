/*
Author: Sherman Yan
Description: This class will represent a book and store information such as title, author,
genre, price, and availability
 */
package OnlineBookstoreManagementSystem;

/**
 * This class will represent a book and store information such as title, author, genre, price, and availability
 */
public class Book {
    private boolean availability;
    private String title, author, genre;
    private double price;

    /**
     * Default constructor sets everything to its default value and availability to true
     */
    public Book() {
        title = null;
        author = null;
        genre = null;
        price = 0.0;
        availability = true;
    }

    /**
     * Constructor sets instance variables to parameters with availability to true
     *
     * @param title title of book
     * @param author author of book
     * @param genre genre of book
     * @param price price of book
     */
    public Book(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.availability = true;

    }

    /**
     * Constructor sets all instance variables to parameters values
     *
     * @param title title of book
     * @param author author of book
     * @param genre genre of book
     * @param price price of book
     * @param availability availability of book
     */
    public Book(String title, String author, String genre, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.availability = availability;
    }

    /**
     * Returns the title of the book
     *
     * @return title of book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the book
     *
     * @param title title of book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the author
     *
     * @return author or book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Set the author
     *
     * @param author author of book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Get genre
     *
     * @return genre of book
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set Genre
     *
     * @param genre genre of book
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Get the price
     *
     * @return price of book
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set price
     *
     * @param price price of book
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Check availability
     *
     * @return true if available else false
     */
    public boolean isAvailable() {
        return availability;
    }

    /**
     * Set availability
     *
     * @param availability true or false
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * Convert book details to string
     * @return details
     */
    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +'\'' +
                ", availability=" + availability +'\'';
    }
}
