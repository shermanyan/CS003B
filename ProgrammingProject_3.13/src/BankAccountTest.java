/*
Author: Sherman Yan
Input: None
Processing: Creates a three students and tests Student's methods
Output: Sample of how the Student class can be used
 */

/**
 A class to test the BankAccount class
 */

public class BankAccountTest {
    public static void main(String[] args) {
        // Initial balance, fee, and free transaction count
        BankAccount account = new BankAccount(1000.0, 1.0, 5);
        System.out.println("Initial balance: $" + account.getBalance());

        account.setFee(10);

        // Does transactions for 3 months
        for (int i = 1; i <= 3; i++) {
            System.out.println("----------------------------");
            System.out.println("Month " + i);

            account.deposit(100.0);
            account.withdraw(50.0);
            account.deposit(200.0);
            account.withdraw(75.0);

            System.out.println("Current balance: $" + account.getBalance());
            System.out.println("Transaction count: " + account.getTransactionCount());

            account.deductMonthlyCharge();
            System.out.println("Balance after deducting monthly charge: $" + account.getBalance());
            System.out.println("----------------------------");

        }
    }
}

/* Sample Output
Initial balance: $1000.0
----------------------------
Month 1
Current balance: $1135.0
Transaction count: 4
Balance after deducting monthly charge: $1085.0
----------------------------
----------------------------
Month 2
Current balance: $1220.0
Transaction count: 4
Balance after deducting monthly charge: $1170.0
----------------------------
----------------------------
Month 3
Current balance: $1305.0
Transaction count: 4
Balance after deducting monthly charge: $1255.0
----------------------------
 */
