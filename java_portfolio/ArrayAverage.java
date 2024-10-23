/**
 * Julie Sakai
 * Module 10 Assignment
 * 10/6/24
 */

 /**
  * This program calculates the average of arrays of different data types: short,
  * int, long, and double. Each method takes an array of the type as input and returns
  * the average value. 
  */
import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        //Set of values for each array 
        short[] shortArray = {1, 2, 3, 4, 5, 6};
        int[] intArray = {1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {1.11, 1.21, 2.11, 3.21};

        //Display short array and its average value
        System.out.printf("\nShort Array: %s\n", Arrays.toString(shortArray));
        System.out.printf("Short Array Average: %d\n", average(shortArray));
        
        //Display int array and its average value
        System.out.printf("\nInt Array: %s\n", Arrays.toString(intArray));
        System.out.printf("Int Array Average: %d\n", average(intArray));

        //Display long array and its average value
        System.out.printf("\nLong Array: %s\n", Arrays.toString(longArray));
        System.out.printf("Long Array Average: %,d\n", average(longArray));

        //Display double array and its average value
        System.out.printf("\nDouble Array: %s\n", Arrays.toString(doubleArray));
        System.out.printf("Double Array Average: %.2f\n", average(doubleArray));

        System.out.println();
    }

    // Methods to calculate average of arrays of different data types
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}