/**
 * This class contains a name, number, and address
 */
public class Person {
    private String name;
    private int number;
    private String address;

    /**
     * Default constructor
     * name = Person
     * number = 123456789
     * address = 12345 Main Street, Pasadena CA
     */
    public Person() {
        this.name = "Person";
        this.number = 123456789;
        this.address = "12345 Main Street, Pasadena CA";
    }
    /**
     * Constructor that sets the variables to the provided input
     * @param name
     * @param number
     * @param address
     */
    public Person(String name, int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }
    /**
     * Get the stored name of person
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Set name of person
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get phone number
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set phone number
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Get the address
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Overridden toString() returns the data of this class as String
     * @return
     */
    public String toString() {
        return "name=" + name + ", number=" + number + ", address=" + address;
    }
}
