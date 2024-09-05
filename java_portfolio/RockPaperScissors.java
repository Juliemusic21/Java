/**
 * /Julie Sakai
 * Module 3 Assignment
*/

import java.util.Scanner;

/**
 * This program simulates a game of Rock-Paper-Scissors. It randomly chooses one of the three 
 * options (Rock 1, Paper 2, Scissors 3) and then prompts the user to do the same. It then 
 * compares the two choices and determines the winner based on the rules of the game. Finally,
 * it displays the results to the user, including both the computer's and the user's selection,
 * as well as the outcome of the game. 
 */

public class RockPaperScissors {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Generate random numbers 1 through 3
        int computerSelection = (int) (Math.random() * 3) + 1;
        int userSelection;

        //Prompt the user to enter 1 for Rock, 2 for Paper, 3 for Scissors
        System.out.println("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors):");
        userSelection = input.nextInt();

        /**
         * Checking if both the computer and the user chose the same option. If true then
         * it is a tie. Checking the possible scenarios where the computer wins. If the computer
         *  does not win then the user won. 
        */
        if (computerSelection == userSelection) {
            System.out.println("It's a tie!");
        } else if (computerSelection == 1 && userSelection == 3 ||
                   computerSelection == 2 && userSelection == 1 ||
                   computerSelection == 3 && userSelection == 2) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("You win!");
        }
        
        //Display result
        System.out.println("Computer's selection: " + (computerSelection == 1 ?
                "Rock" : computerSelection == 2 ? "Paper" : "Scissors"));
        System.out.println("Your selection: " + (userSelection == 1 ? "Rock" :
        userSelection == 2 ? "Paper" : "Scissors"));
        }
}
    

