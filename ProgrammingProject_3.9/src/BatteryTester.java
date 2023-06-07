/*
Author: Sherman Yan
Input: None
Processing: Constructs a battery with 2000 capacity, charges, discharges 100, amd recharges
Output: Sample of how the Battery class can be used
 */

/**
 * A class to test the Battery class
 */
public class BatteryTester {
    public static void main(String[] args){

        int num = 1;
        Battery battery = new Battery(2000);
        System.out.println("Current charge: " + battery.getRemainingCapacity());

        System.out.println("Charge battery");
        battery.charge();
        System.out.println("Current charge: " + battery.getRemainingCapacity());

        System.out.println("Discharge 100");
        battery.drain(100);
        System.out.println("Current charge: " + battery.getRemainingCapacity());

        System.out.println("Charge battery");
        battery.charge();
        System.out.println("Current charge: " + battery.getRemainingCapacity());


    }
}

/* Sample Output
Current charge: 0.0
Charge battery
Current charge: 2000.0
Discharge 100
Current charge: 1900.0
Charge battery
Current charge: 2000.0
 */