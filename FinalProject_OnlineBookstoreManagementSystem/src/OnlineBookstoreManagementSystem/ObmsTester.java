/*
Author: Sherman Yan
Input: None
Processing: Create the obms and customer, add books to obms inventory, then add books to the customer's shopping cart,
place order, print invoice, and view updated inventory
Output: See sample output
 */

package OnlineBookstoreManagementSystem;

/**
 * Class to test the OnlineBookstoreManagementSystem class
 */
public class ObmsTester {

    /**
     * Main executable tester
     * @param args
     */
    public static void main(String[] args){
        //Create the obms
        OnlineBookstoreManagementSystem obms = new OnlineBookstoreManagementSystem();

        //Create customer
        Customer customer1 = new Customer("Johnny","53234 Broadway Blvd, Pasadena CA",626266626);

        //Register the customer
        obms.registerCustomer(customer1);

        //Add five books to obms inventory
        for (int i = 0 ;i < 5; i++) {

            obms.addBook(new Book("Book" + i ,"Author" + i,"Genre " + i ,i * 21.99));
        }

        //View inventory
        System.out.println(obms.browseBooks());

        //add book to shopping cart
        obms.addToShoppingCart(customer1,"Book1");
        obms.addToShoppingCart(customer1,"Book2");
        obms.addToShoppingCart(customer1,"Book3");

        //Place order
        obms.placeOrder(customer1);

        //Print invoice
        obms.printInvoice(customer1);

        //View updated inventory
        System.out.println(obms.browseBooks());

    }
}

/* Sample Output

--Inventory--
1: title='Book0', author='Author0', genre='Genre 0', price=0.0', availability=true'
2: title='Book1', author='Author1', genre='Genre 1', price=21.99', availability=true'
3: title='Book2', author='Author2', genre='Genre 2', price=43.98', availability=true'
4: title='Book3', author='Author3', genre='Genre 3', price=65.97', availability=true'
5: title='Book4', author='Author4', genre='Genre 4', price=87.96', availability=true'

Amount Due: $121.94
Select from the following payment methods
A - Credit Card
B - Cash
B
Enter cash amount: 121
Insufficient funds, Would you like to enter more (Y or any key to cancel)?: Y
Balance Remaining: $0.94
Enter cash amount: 0.95
Your change: $0.01
Payment complete...
Purchase completed...
---------------------
-------Invoice-------
---------------------
Book1: $21.99
Book2: $43.98
Book3: $65.97
Subtotal: $131.94
Discount: $10.00
Total: $121.94
Thanks for Shopping!
Happy reading!
---------------------
--Inventory--
1: title='Book0', author='Author0', genre='Genre 0', price=0.0', availability=true'
2: title='Book1', author='Author1', genre='Genre 1', price=21.99', availability=false'
3: title='Book2', author='Author2', genre='Genre 2', price=43.98', availability=false'
4: title='Book3', author='Author3', genre='Genre 3', price=65.97', availability=false'
5: title='Book4', author='Author4', genre='Genre 4', price=87.96', availability=true'
 */