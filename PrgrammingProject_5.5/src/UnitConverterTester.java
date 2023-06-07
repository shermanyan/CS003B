/*
Author: Sherman Yan
Input: From and to units and conversion value
Processing: validate units and perform conversion using the UnitConverter class
Output: Conversion results
 */

import java.util.Scanner;

/**
 * Class to test UnitConverter class
 */
public class UnitConverterTester {
    private static String from = "", to = "";
    private static double value = 0;
    private static final Scanner IN = new Scanner(System.in);

    /**
     * Gets input from user for variables from and to and validates them.
     */
    private static void getInput(){

        from = "";
        to = "";

        //read from
        while (from.isEmpty()) {
            System.out.print("Convert from?: ");

            from = IN.next();

            //validates from unit
            if (!UnitConverter.validateFrom(from)) {
                System.out.println("ERROR: Invalid unit.");
                from = "";
            }
        }
        //read to
        while (to.isEmpty()) {
            System.out.print("Convert to?: ");

            to = IN.next();

            //validates to unit
            if (!UnitConverter.validateTo(to)) {
                System.out.println("ERROR: Invalid unit.");
                to = "";
            }
            //validate if conversion is valid
            else if(!UnitConverter.validateConversion(from,to)){
                System.out.println("Error: Invalid conversion from " + from + " to " + to);
                to = "";
            }
        }
    }

    /**
     * Program that asks user for two units and a value to convert. Validates input and conversion
     * @param args
     */
    public static void main(String[] args){

        getInput();


        //read value
        System.out.print("Value?: ");
        value = IN.nextDouble();

        //print result
        System.out.printf("%.1f " + from + " = %.1f " + to ,value, UnitConverter.convert(from, to, value));

    }

}

/* Sample Output
Convert from?: ga
ERROR: Invalid unit.
Convert from?: gal
Convert to?: mm
Error: Invalid conversion from gal to mm
Convert to?: ml
Value?: 2.5
2.5 gal = 9463.5 ml
 */
