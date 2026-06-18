package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        System.out.println("x = " + x);

        x = 15;
        System.out.println("nilai x baru = " + x);

        // * Deklarasi variable b
        int y; // ? Deklarasi variable y tanpa inisialisasi
/*        System.out.println("y = " + y); */ // ? Akan error karena variable y belum diinisialisasi
        y = 7; // ? memasukkan nilai ke dalam variable y
        System.out.println("y = " + y); // ? output = 7

    }
}
