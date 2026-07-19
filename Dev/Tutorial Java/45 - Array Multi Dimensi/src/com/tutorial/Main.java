package com.tutorial;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        // * Array 2 dimensi dengan assignment
        int[][] arr1 = {
                {1, 2},
                {3, 4},
        };
        array2D(arr1);

        // * Array 2 dimensi dengan deklarasi
        // ** [][] ---> baris dan kolom
        System.out.println();
        int[][] arr2 = new int[3][4];
        System.out.println("Panjang baris arr2 : " + arr2.length);

        array2D(arr2);

        // * Looping lengkap secara manual
        System.out.println();

//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2[i].length; j++) {
//                System.out.print(arr2[i][j] + ", ");
//            }
//            System.out.println();
//        }


        // * Looping dengan for each
//        System.out.println();
//
//        for(int[] baris : arr2) {
//            for(int kolom : baris) {
//                System.out.print(kolom + ", ");
//            }
//            System.out.println();
//        }

        // * Array 2 demensi untuk pembuktian
        int[][] arr3 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        array2D(arr3);

        System.out.println();

        int[][] arr4 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8},
                {9}
        };
        array2D(arr4);
    }

    private static void array2D(int[][] arr) {
        for(int[] baris : arr) {
            for(int kolom : baris) {
                System.out.print(kolom + ", ");
            }
            System.out.println();
        }
    }
}
