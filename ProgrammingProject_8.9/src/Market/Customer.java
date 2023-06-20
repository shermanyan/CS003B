/*
Author: Sherman Yan, Henry Thai
 */
package Market;

/**
 * Customer class stores the Customers name, address, and phone number
 */
public class Customer {
    private String name, address;
    private int phoneNumber;

    /**
     * Constructor that creates a customer profile
     * @param name name of customer
     * @param address address of customer
     * @param phoneNumber phone number of customer
     */
    public Customer(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the name of customer
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Modify the name of customer
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address of customer
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Modify address of customer
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the phone number of customer
     * @return phone number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Modify the phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
