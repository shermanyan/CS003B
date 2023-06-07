/*
Author: Sherman Yan, Henry Thai
 */

/**
 A class that simulates a bank account.
 */
public class BankAccount {
    private double balance;
    private double fee;
    private int transactionCount;
    private int freeTransactionCount;

    /**
     * Default constructor creates a bank account with no balance no fee and no translations
     */
    public BankAccount() {
        balance = 0;
        fee = 0;
        transactionCount = 0;
        freeTransactionCount = 0;
    }

    /**
     * Constructor that creates an account with given initial balance with no fee
     * @param initialBalance initial balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
        fee = 0;
        transactionCount = 0;
        freeTransactionCount = 0;
    }

    /**
     * Constructor that creates an account with given initial balance, fee, and free transactions amount
     * @param initialBalance initial balance amount
     * @param fee fee amount
     * @param freeTransactionCount amount of free transactions
     */
    public BankAccount(double initialBalance, double fee, int freeTransactionCount) {
        balance = initialBalance;
        this.fee = fee;
        this.freeTransactionCount = freeTransactionCount;
        transactionCount = 0;
    }

    /**
     * Set the fee amount
     * @param fee amount
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Deposit amount into bank
     * @param amount amount
     */
    public void deposit(double amount) {
        balance += amount - fee;
        transactionCount++;
    }

    /**
     * Withdraw amount
     * @param amount amount
     */
    public void withdraw(double amount) {
        balance -= amount + fee;
        transactionCount++;
    }

    /**
     * Deduct a monthly charge from account
     */
    public void deductMonthlyCharge() {
        int billableTransactions = Math.max(transactionCount , freeTransactionCount);
        double monthlyCharge = billableTransactions * fee;
        balance -= monthlyCharge;
        transactionCount = 0;
    }

    /**
     * Returns account balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the number of transactions
     * @return
     */
    public int getTransactionCount() {
        return transactionCount;
    }
}

