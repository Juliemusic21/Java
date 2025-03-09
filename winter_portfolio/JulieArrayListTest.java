/* Julie Sakai
CSD-405
Module 4 Programming Assignment
11/8/24 */

import java.util.ArrayList;
import java.util.Scanner;

public class JulieArrayListTest {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop): ");
        list = new ArrayList<>();

        while (true) {
            System.out.println("Enter number: ");
            //Display next entered integer
            int value = input.nextInt();
            //Add input to ArrayList
            list.add(value);
            //Stop input if user enters 0
            if (value == 0) {
                break;
            }
        }

        Integer largestValue = max(list);
        //Display the largest value in the ArrayList
        System.out.println("The largest value is: " + largestValue);
    }

    public static Integer max(ArrayList<Integer> list) {
        //Arraylist is sent in empty the method return 0
        if (list.isEmpty()) {
            return 0;
        }
        Integer max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}