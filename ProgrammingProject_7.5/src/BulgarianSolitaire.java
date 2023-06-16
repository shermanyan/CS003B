/*
 * Author:Sherman Yan, Henry Thai
 */

import java.util.Arrays;
import java.util.Random;

/**
 * Class that simulates the bulgarian solitaire game
 */
public class BulgarianSolitaire {
    private static final int ARRAY_SIZE = 10;
    private static final int NUMBER_OF_CARDS = 45;
    private static final int[] RESULT = new int[] {1,2,3,4,5,6,7,8,9};

    /**
     * Perform a game step
     * @param array
     * @return
     */
    private static int[] performSolitaireStep(int[] array) {
        int sum = 0;
        int[] result = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[i] = array[i] - 1;
                sum++;
            }
        }

        result[result.length - 1] = sum;
        result = removeZeros(result);

        return result;
    }

    /**
     * Remove zeros from array
     * @param array input array
     * @return output array with no zeros
     */
    private static int[] removeZeros(int[] array) {
        int countZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZeros++;
            } else if (countZeros > 0) {
                array[i - countZeros] = array[i];
                array[i] = 0;
            }
        }
        return Arrays.copyOf(array, array.length - countZeros);


    }

    /**
     * Check if game matches the final result
     * @param array
     * @return
     */
    private static boolean match(int[] array) {

        return Arrays.equals(array, RESULT);

    }

    /**
     * Convert to String
     * @param array input array
     * @return output string
     */
    private static String toString(int[] array) {
        return Arrays.toString(array);
    }

    /**
     * Run the game simulation with steps and result outputted to console
     */
    public static void runSimulation(){
        int[] array = new int[ARRAY_SIZE];

        int remainingCards = NUMBER_OF_CARDS;
        int currentIndex = 0;
        Random random = new Random();

        while (remainingCards > 0) {
            int randomNum = random.nextInt(remainingCards) + 1;
            array[currentIndex] = randomNum;
            currentIndex++;
            remainingCards -= randomNum;
        }

        array = removeZeros(array);

        System.out.println("Start: " + toString(array));


        while (!match(array)) {
            array = performSolitaireStep(array);
            Arrays.sort(array);
            System.out.println(toString(array));
        }

        System.out.println("Final configuration: " + toString(array));

    }
}

