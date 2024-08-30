/**Julie Sakai
 * Module 2 Programming Assignment
*/

import java.util.Scanner;

/**
 * This program will calculate the energy required to heat water from an initial temperature
 * to a final temperature. The user inputs water mass in kilograms, initial temperature,
 * and final temperature, and the program computes the energy in joules. The formula to compute
 * the energy is Q = M * (finalTemperature - initialTemperature) * 4184.
 * Q is the energy measured in joules, M is the mass of the water (waterweight) in kilograms,
 * and the temperatures in degrees Celsius. 
 */


public class CalculateEnergy {
    public static void main(String[] args) {

        double initalTemperature;
        double finalTemperature;
        double waterweight;
        
        //Prompt the user for input
        System.out.println("Enter the weight of water in kilograms: ");

        Scanner input = new Scanner(System.in);
        waterweight = input.nextDouble();
        
        //Prompt the user for input
        System.out.println("Enter the initial temperature of water in Celsius: ");

        Scanner input1 = new Scanner(System.in);
        initalTemperature = input1.nextDouble();
        
        //Prompt the user for input
        System.out.println("Enter the final temperature of the water in Celsius: ");

        Scanner input2 = new Scanner(System.in);
        finalTemperature = input2.nextDouble();

        double result;
        
        //Calculate energy using the formula
        result = waterweight * (finalTemperature - initalTemperature) * 4184;
        
        //Display result
        System.out.println("The energy needed to heat water is " + result + " Joules");
    }
}