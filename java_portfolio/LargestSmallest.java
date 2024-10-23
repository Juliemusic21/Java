/**
 * Julie Sakai
 * Module 11 Assignment
 * 10/10/24
 */

/**
 * This program uses four methods to find the location of the largest
 * and smallest elements in two-dimensional array. 
 */
import java.util.Arrays;

public class LargestSmallest {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] result = {0, 0};
        double largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] result = {0, 0};
        int largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] result = {0, 0};
        double smallest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] result = {0, 0};
        int smallest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intArray = {{9, 10, 11}, {21, 12, -8}, {13, 14, -25}};
        double[][] doubleArray = {{21.21, 23.12, 56.45}, {-75.54, -57.45, 51.15}, {45.54, 26.62, 19.91}};

        System.out.println("The largest value in the double array is " + Arrays.toString(locateLargest(doubleArray)));
        System.out.println("The largest value in the int array is " + Arrays.toString(locateLargest(intArray)));

        System.out.println("The smallest value in the double array is " + Arrays.toString(locateSmallest(doubleArray)));
        System.out.println("The smallest value in the int array is " + Arrays.toString(locateSmallest(intArray)));
