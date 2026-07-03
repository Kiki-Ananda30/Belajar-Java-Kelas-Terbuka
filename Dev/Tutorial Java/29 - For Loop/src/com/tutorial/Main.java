package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // * --Start--
        System.out.println("Contoh 1");
        for(int i = 1; i <= 10; i++) {
            System.out.println("i ke-" + i);
        }

        System.out.println("Looping selesai");
        // * --End--

        System.out.println();

        // * --Start--
        System.out.println("Contoh 2");
        for(int i = 1; i < 10; i++) {
            System.out.println("i ke-" + i);
        }

        System.out.println("Looping selesai");
        // * --End--

        System.out.println();

        // * --Start--
        System.out.println("Contoh 3");
        for(int i = 10; i >= 0; i--) {
            System.out.println("i ke-" + i);
        }

        System.out.println("Looping selesai");
        // * --End--

        System.out.println();

        // * --Start--
        System.out.println("Contoh 4");
        for(int i = 10; i > 0; i--) {
            System.out.println("i ke-" + i);
        }

        System.out.println("Looping selesai");
        // * --End--

        System.out.println();

        // * --Start--
        System.out.println("Contoh 5");

        int i = 10;

        for(; i > 0; i--) {
            System.out.println("i ke-" + i);
        }

        System.out.println("Looping selesai");
        // * --End--

        System.out.println();
    /*
        // * --Start--
        System.out.println("Contoh 6");

        int j = 10;

        for(; j > 0;) {
            System.out.println("j ke-" + j); // ? Looping tidak akan berhenti
        }

        System.out.println("Looping selesai");
        // * --End--
    */
        System.out.println();
//
//        // * --Start--
//        System.out.println("Contoh 7");
//
//        int j = 10;
//
//        for(; true ;) {
//            System.out.println("j ke-" + j); // ? Looping tidak akan berhenti
//        }

//        System.out.println("Looping selesai");
        // * --End--

        System.out.println();

        // * --Start--
        System.out.println("Contoh 8");

        int k = 1;

        for(; k <= 10 ;) {
            System.out.println("k ke-" + k);
            k++;
        }

        System.out.println("Looping selesai");
        // * --End--
    }
}
