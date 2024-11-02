/*Julie Sakai
CSD-405
Module 2 Programming Assignment
11/2/24*/

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    public static void main(String[] args) {
        //Create a collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();

        //Add Fan instances to the collection
        fanCollection.add(new Fan());
        fanCollection.add(new Fan(Fan.MEDIUM, true, 7, "blue"));
        fanCollection.add(new Fan(Fan.FAST, false, 8, "green"));
        fanCollection.add(new Fan(Fan.SLOW, true, 5, "yellow"));

        //Display all Fans without using toString method
        displayFanCollection(fanCollection);

        //Display a single fan without using toString method
        displaySingleFan(fanCollection.get(1));
    }

    //Display a collection of Fan instances
    public static void displayFanCollection(List<Fan> fans) {
        for (Fan fan : fans) {
            displaySingleFan(fan);
        }
    }

    //Display a single instance of a Fan without using toString()
    public static void displaySingleFan(Fan fan) {
        String state = fan.isOn() ? "on" : "off";
        System.out.println("Fan details: ");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("State: " + state);
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }
}