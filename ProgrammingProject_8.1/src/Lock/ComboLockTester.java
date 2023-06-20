/*
Author: Sherman Yan
Input: none
Processing: Tests the Lock.ComboLock class
Output: Three test cases: see sample output
 */

package Lock;

/**
 * This class tests that Lock.ComboLock class
 */
public class ComboLockTester {
    public static void main(String[] args) {
        ComboLock lock = new ComboLock(10,20,30);

        System.out.println("--- Test 1 ---");

        lock.turnRight(30);
        lock.turnLeft(10);
        lock.turnRight(30);

        lock.printStatus();
        System.out.println("Open: " + lock.open() + "\nExpected: true \n");

        lock.reset();

        System.out.println("--- Test 2 ---");

        lock.turnLeft(10);
        lock.turnLeft(10);
        lock.turnLeft(10);

        lock.printStatus();
        System.out.println("Open: " + lock.open() + "\nExpected: false \n");

        lock.reset();

        System.out.println("--- Test 3 ---");

        lock.turnRight(10);
        lock.turnLeft(40);
        lock.turnRight(20);

        lock.printStatus();
        System.out.println("Open: " + lock.open() + "\nExpected: false \n");

    }
}

/* Sample Output
--- Test 1 ---
Combo: [10, 20, 30]
Turn Pattern: [R, L, R]
Open: true
Expected: true

--- Test 2 ---
Combo: [10, 20, 30]
Turn Pattern: [L, L, L]
Open: false
Expected: false

--- Test 3 ---
Combo: [30, 30, 10]
Turn Pattern: [R, L, R]
Open: false
Expected: false

 */