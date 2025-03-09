/*
Julie Sakai
CSD 405
Module 9
11/30/24
 */

package com.example.module9;
import java.util.Arrays;
import java.util.List;

public class ForEachAsianFoods {
    public static void main(String[] args) {
        List<String> asianFoods = Arrays.asList("Ramen", "Pho", "Dim Sum", "Bibimbap", "Pad Thai");

        //Using forEach with lambda expression to print Asian food
        asianFoods.forEach(food -> System.out.println(food));
    }
}
