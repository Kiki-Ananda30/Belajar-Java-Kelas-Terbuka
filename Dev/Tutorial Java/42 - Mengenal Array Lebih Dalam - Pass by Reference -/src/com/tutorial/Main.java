package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[5];
        numbers2 = numbers1;

        System.out.println("numbers1 " + Arrays.toString(numbers1));
        System.out.println("numbers2 " + Arrays.toString(numbers2));

        numbers1[0] = 100;
        numbers1[3] = 400;
        System.out.println("numbers1 " + Arrays.toString(numbers1));
        System.out.println("numbers2 " + Arrays.toString(numbers2));

        changeArray(numbers1);
        System.out.println("numbers1 " + Arrays.toString(numbers1));
        System.out.println("numbers2 " + Arrays.toString(numbers2));
    }

    // * Method yang parameter/argumennya adalah reference, pass by reference bukan pass by value
    private static void changeArray(int[] arrayData) {
        for(int array : arrayData) {
            System.out.println(array);
        }

        arrayData[2] = 300;

        for(int array : arrayData) {
            System.out.println(array);
        }
    }
}
