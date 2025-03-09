/* Julie Sakai
CSD-405
Module 5 Programming Assignment
Program 1
11/16/24 */

import java.util.ArrayList;
import java.util.Scanner;

 class StringArrayList {
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("Abyssinian");
         list.add("American Bobtail");
         list.add("Bengal");
         list.add("Burmese");
         list.add("Maine Coon");
         list.add("Munchkin");
         list.add("Persian");
         list.add("Ragdoll");
         list.add("Scottish Fold");
         list.add("Siamese");

         //Print the ArrayList using for-each loop
         for (String cat : list) {
             System.out.println(cat);
         }

         //Ask user which element they would like to see again
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the index of the cat breed you want to see again: ");

         try {
             //Auto-unboxing from Integer to int
             int index = Integer.parseInt(input.nextLine());

             System.out.println("Element at index " + index + " is: " + list.get(index));
         } catch (NumberFormatException e) {
             System.out.println("Invalid input. Please enter a valid integer index.");
         } catch (IndexOutOfBoundsException e) {
             System.out.println("Out of Bounds");
         } finally {
             input.close();
         }
     }
 }
