/**
 * Julie Sakai
 * 10/10/24
 * Module 12 Assignment
 * Redo Module 9 Assignment
 */
/**
 * This program calculate the data to find the highest value, lowest value, 
 * average, and the sum of the array of integers entered by the user. 
 */
import java.util.Scanner;

public class IntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int sum = 0;
        double average;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

       //User inputs the array
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        //Calculate the average
        average = (double) sum / numbers.length;

        //Displaying the results
        System.out.println("Highest Value: " + max);
        System.out.println("Lowest Value: " + min);
        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
    }
}