/*
Author: Sherman Yan
 */

/**
 * The Battery class simulates an AA battery with charging and draining functions
 */
public class Battery {
    private double capacity = 0, charge = 0;

    /**
     * Constructor to create an empty charge battery with specified capacity
     * @param capacity capacity of battery
     */
    public Battery(double capacity){
        this.capacity = capacity;

    }

    /**
     * Drain the battery a specified amount
     * @param amount
     */
    public void drain(double amount){
        charge -= amount > charge ? 0 : amount;
    }

    /**
     * Charge the battery to full capacity
     */
    public void charge(){
        charge = capacity;
    }

    /**
     * Get the current charge of battery
     * @return charge of battery
     */
    public double getRemainingCapacity(){
        return charge;
    }
}
