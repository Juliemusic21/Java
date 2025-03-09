/*
Julie Sakai
CSD 405
Module 9
11/30/24
 */

package com.example.module9;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class AsianFood{
    String name;
    boolean isSpicy;

    AsianFood(String name, boolean isSpicy) {
        this.name = name;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return name + " (Spicy: " + isSpicy + ")";
    }
}

public class LambdaAsianFood {
    public static void main(String[] args) {
        List<AsianFood> foods = Arrays.asList(
                new AsianFood("Kimchi", true),
                new AsianFood("Gyoza", false),
                new AsianFood("Sichuan Hot Pot",true ),
                new AsianFood("Tonkastu", false),
                new AsianFood("soba",false )
        );

        //Filter the list to find spicy foods
        List<AsianFood> spicyFoods = foods.stream()
                .filter(food->food.isSpicy)
                .collect(Collectors.toList());

        System.out.println("Spicy Asian foods:");
        spicyFoods.forEach(System.out::println);
    }
}