/*
Author: Sherman Yan
*/

/**
 * Class that performs conversions
 * from (fl. oz, gal, oz, lb, in, ft, mi)
 * to (ml, l, g, kg, mm, cm, m, km)
 */
public class UnitConverter {
    private enum Units{
        METRIC_LENGTH, METRIC_MASS, IMPERIAL_LENGTH, IMPERIAL_MASS, INVALID;
    }
    private static final String imperialMass[] = {"fl.oz", "gal", "oz", "lb"} ;
    private static final String imperialLength[] = {"in", "ft", "mi"} ;
    private static final String metricMass[] = {"ml", "l", "g", "kg"};
    private static final String metricLength[] = {"mm", "cm", "m", "km"};


    /**
     * Validate conversion from
     * @param unit
     * @return true if valid
     */
    public static boolean validateFrom(String unit){
        Units type = getUnitType(unit);
        return type == Units.IMPERIAL_MASS || type == Units.IMPERIAL_LENGTH;
    }

    /**
     * Validate conversion to
     * @param unit
     * @return true if valid
     */
    public static boolean validateTo(String unit){
        Units type = getUnitType(unit);
        return type == Units.METRIC_MASS || type == Units.METRIC_LENGTH;

    }

    /**
     * Get the unit type
     * @param unit unit type in string
     * @return Units enum
     */
    private static Units getUnitType(String unit){
        for (String s : metricMass) {
            if (s.equals(unit))
                return Units.METRIC_MASS;
        }
        for (String s : metricLength) {
            if (s.equals(unit))
                return Units.METRIC_LENGTH;
        }
        for (String s : imperialMass) {
            if (s.equals(unit))
                return Units.IMPERIAL_MASS;
        }
        for (String s : imperialLength) {
            if (s.equals(unit))
                return Units.IMPERIAL_LENGTH;
        }

        return Units.INVALID;
    }

    /**
     * Validate conversion
     * @param from unit to convert from (fl. oz, gal, oz, lb, in, ft, mi)
     * @param to unit to convert to (ml, l, g, kg, mm, cm, m, km)
     * @return true if conversion valid
     */
    public static boolean validateConversion(String from, String to){

        switch (getUnitType(from)){
            case IMPERIAL_LENGTH:
                return getUnitType(to) == Units.METRIC_LENGTH;
            case IMPERIAL_MASS:
                return getUnitType(to) == Units.METRIC_MASS;
            default:
                return false;
        }
    }

    /**
     * Convert from imperial to metric units
     * @param from unit to convert from (fl. oz, gal, oz, lb, in, ft, mi)
     * @param to unit to convert to (ml, l, g, kg, mm, cm, m, km)
     * @param value value to convert
     * @return converted value
     */
    public static double convert(String from, String to, double value){
        double val = 0;

        if (validateConversion(from,to)){
            switch (getUnitType(from)) {
                case IMPERIAL_LENGTH:
                    // default converts everything to m
                    val = switch (from) {
                        case "in" -> value / 39.37;
                        case "ft" -> value / 3.281;
                        case "mi" -> value * 1609.344;
                        default -> value;
                    };
                    return switch (to) {
                        case "mm" -> val * 1000;
                        case "cm" -> val * 100;
                        case "km" -> val / 1000;
                        default -> val;
                    };
                case IMPERIAL_MASS:
                    // default converts everything to kg
                    val = switch (from) {
                        case "fl.oz" -> value * 0.03;
                        case "gal" -> value * 3.7854;
                        case "oz" -> value / 35.274;
                        case "lb" -> value / 2.205;
                        default -> value;
                    };
                    return switch (to) {
                        case "ml", "g" -> val * 1000;
                        // if to = kg or l
                        default -> val;
                    };

            }
        }
        return val;
    }

}