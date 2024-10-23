/**
 * Julie Sakai
 * 9/14/24
 * Module 7 Assignment
 */

/**
 * This program implementing a password validation checker. It checks if a given
 * password string meets the following requirements:
 *  Must have at least 8 characters
 *  Must contain both letters and digits
 *  Must contain at least one uppercase and one lowercase character
 */
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("Passwords must have:");
    System.out.println("- At least 8 characters");
    System.out.println("- Both letters and digits");
    System.out.println("- At least 1 uppercase character");
    System.out.println("- At least one lowercase character\n");
        
    System.out.println("Please Enter Your Password: ");

    String userPassword = input.nextLine();
    System.out.println(" ");

        PasswordCheck(userPassword);
    }

    static void PasswordCheck(String password) {
        //To validate if a requirement is met to initilized to 0
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        
        //To count the number of uppercase, lowercase, and digit characters in the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            }
            if (Character.isLowerCase(c)) {   
                lowerCount++;
            }
            if (Character.isDigit(c)) {   
                digitCount++;
            }
        }
        //Run and display if all the requirements are met
        if (password.length() >= 8 && upperCount >= 1 && lowerCount >= 1 && digitCount >= 1) {
            System.out.println("Your password meets the requirements!");
        }
        else {
            System.out.println("Your password is not valid!");

            // Check variable if it is still 0 prints what is missing for the password
            if (password.length() < 8) {
                System.out.println("Your password needs to be at least 8 characters");
            }
            if (upperCount == 0) {
                System.out.println("Your password needs at least 1 uppercase character");
            }
            if (lowerCount == 0) {
                System.out.println("Your password needs at least one lowercase character");
            }
            if (digitCount == 0) {
                System.out.println("Your password needs at least one digit");
            }
            System.out.println("");
        }
    }
}