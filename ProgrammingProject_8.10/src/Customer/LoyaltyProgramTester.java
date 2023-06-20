/*
Author: Sherman Yan
Input: none
Processing: Test the Customer class
Output: Test cases, see sample output
 */
package Customer;

/**
 * Class to test the Customer class
 */
public class LoyaltyProgramTester {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.makePurchase(100,10);

        customer.printStatus();
        System.out.println("Discount Reached: " + customer.discountReached());
        System.out.println("Expected: false");

        customer.makePurchase(1,2);

        customer.printStatus();
        System.out.println("Discount Reached: " + customer.discountReached());
        System.out.println("Expected: false");

        customer.makePurchase(2,2);

        customer.printStatus();
        System.out.println("Discount Reached: " + customer.discountReached());
        System.out.println("Expected: false");

        customer.makePurchase(2,3);

        customer.printStatus();
        System.out.println("Discount Reached: " + customer.discountReached());
        System.out.println("Expected: true");

    }

}

/* Sample Output
Total: $100.00
Store Count: 1
Discount Reached: false
Expected: false
Total: $101.00
Store Count: 2
Discount Reached: false
Expected: false
Total: $103.00
Store Count: 2
Discount Reached: false
Expected: false
Total: $105.00
Store Count: 3
Discount Reached: true
Expected: true
 */