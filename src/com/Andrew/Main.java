package com.Andrew;

import java.sql.SQLOutput;

public class Main {
    //this is a trial program
    public static void main(String[] args) {
	int x = 15;
    int y = 10;
    int sum = x + y;
    System.out.println("the sum of " + x + " and " + y + " is " + sum);


    // Testing a for loop
    String[] animals = {"Goat", "Cow" , "Donkey", "Dog"};
        for(int i = 0; i < animals.length; i++ ){
            System.out.println("Animal " + (i + 1) + " is a " + animals[i]);
        }
    }
}
