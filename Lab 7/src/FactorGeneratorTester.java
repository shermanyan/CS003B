/*
Author: Sherman Yan, Henry Thai
Input: None
Processing: Generate prime factors for 60
Output: Generated results and expected results
 */
/**
 * FactorGenerator class tester
 */
public class FactorGeneratorTester {
    public static void main(String[] args) {
        FactorGenerator generator = new FactorGenerator(2 * 2 * 3 * 5);
        System.out.println(generator.hasMoreFactors());
        System.out.println("Expected: true");
        System.out.println(generator.nextFactor());
        System.out.println("Expected: 2");
        System.out.println(generator.hasMoreFactors());
        System.out.println("Expected: true");
        System.out.println(generator.nextFactor());
        System.out.println("Expected: 2");
        System.out.println(generator.hasMoreFactors());
        System.out.println("Expected: true");
        System.out.println(generator.nextFactor());
        System.out.println("Expected: 3");
        System.out.println(generator.hasMoreFactors());
        System.out.println("Expected: true");
        System.out.println(generator.nextFactor());
        System.out.println("Expected: 5");
        System.out.println(generator.hasMoreFactors());
        System.out.println("Expected: false");
    }
}

/* Sample Output
true
Expected: true
2
Expected: 2
true
Expected: true
2
Expected: 2
true
Expected: true
3
Expected: 3
true
Expected: true
5
Expected: 5
false
Expected: false
 */