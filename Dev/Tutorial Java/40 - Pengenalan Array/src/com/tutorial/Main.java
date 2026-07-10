package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // * Assignment Array
        int[] numbers = {1, 2, 3, 4};
        System.out.println(numbers[0]); // ? output = 1
        System.out.println(numbers[1]); // ? output = 2
        System.out.println(numbers[2]); // ? output = 3
        System.out.println(numbers[3]); // ? output = 4

        System.out.println("------");

        numbers[1] = 6;
        System.out.println(numbers[0]); // ? output = 1
        System.out.println(numbers[1]); // ? output = 6
        System.out.println(numbers[2]); // ? output = 3
        System.out.println(numbers[3]); // ? output = 4

        System.out.println();

        // * Deklarasi Array
        float[] numbersArray = new float[5];
        System.out.println(numbersArray[0]); // ? output = 0.0
        System.out.println(numbersArray[1]); // ? output = 0.0
        System.out.println(numbersArray[2]); // ? output = 0.0
        System.out.println(numbersArray[3]); // ? output = 0.0
        System.out.println(numbersArray[4]); // ? output = 0.0

        System.out.println("-----");

        numbersArray[2] = 12.5f;
        numbersArray[4] = 5;
        System.out.println(numbersArray[0]); // ? output = 0.0
        System.out.println(numbersArray[1]); // ? output = 0.0
        System.out.println(numbersArray[2]); // ? output = 12.5
        System.out.println(numbersArray[3]); // ? output = 0.0
        System.out.println(numbersArray[4]); // ? output = 5.0

        System.out.println();

        // * Menampilakan array dengan helper class Array di java.util.Arrays
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersArray));

    }
}
