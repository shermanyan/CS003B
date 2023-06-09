/*
Author: Sherman Yan, Henry Thai
 */
public class ArabicToRomanNumeral {

    /**
     * Validate year
     * @param year
     * @return true if between 1000 and 3999
     */
    public static boolean validateYear(int year){
        return year >= 1000 && year <= 3999;
    }

    /**
     * Converts year to roman numerals
     * @param arabicYear
     * @return String of roman numerals
     */
    public static String convert(int arabicYear){
        int pre = arabicYear;
        int thouPlace, hunPlace, tenPlace, onePlace;
        String result = "";

        // breakdown
        thouPlace = pre / 1000;
        pre -= (thouPlace * 1000);
        hunPlace = pre / 100;
        pre -= hunPlace * 100;
        tenPlace = pre / 10;
        pre -= (tenPlace * 10);
        onePlace = pre;

        result += getRomanString(thouPlace, "M","", "");

        result += getRomanString(hunPlace, "C", "D", "M");

        result += getRomanString(tenPlace, "X", "L", "C");

        result += getRomanString(onePlace, "I", "V", "X");

        return result;

    }

    /**
     * Get the roman numeral string for an integer
     * @param integer input
     * @param a char for 1
     * @param b char for 5
     * @param c char for 10
     * @return
     */
    private static String getRomanString(int integer, String a, String b, String c) {
        String result = "";

        //convert number into roman numerals
        switch (integer) {
            case 0 -> result = "";
            case 1 -> result += a;
            case 2 -> result += a + a;
            case 3 -> result += a + a + a;
            case 4 -> result += a + b;
            case 5 -> result += b;
            case 6 -> result += b + a;
            case 7 -> result += b + a + a;
            case 8 -> result += b + a + a + a;
            case 9 -> result += a + c;
            default -> {
            }
        }
        return result;
    }
}
