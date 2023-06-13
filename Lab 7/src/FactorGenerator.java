/**
 * This class generates all the factors of a number.
 */
public class FactorGenerator {
    private int number; //store the input number
    private int factor; //store the current factor
    
    /**
     * Creates a FactorGenerator object used to determine the factors of an input value.
     * @param input is the input value
     */
    public FactorGenerator(int input) {
        number = input;
        factor = 2; // smallest prime factor
    }
    
    /**
     * Determine whether or not there are more factors.
     * @return true if there are more factors, false otherwise
     */
    public boolean hasMoreFactors() {

        return (factor <= number);
    }
    
    /**
     * Calculate the next factor of the value.
     * @return the next factor
     */
    public int nextFactor() {
        while (number % factor != 0) {
            factor++;
        }
        number/= factor;

        return factor;
    }
}
