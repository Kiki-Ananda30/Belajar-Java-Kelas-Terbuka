package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = scanner.nextInt();
        System.out.println("Anda memasukkan nilai : " + nilai);

        printNilai(nilai);

        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah nilai : " + jumlah);

        jumlah = faktorial(nilai);
        System.out.println("Jumlah faktorial : " + jumlah);

    }

    // * Membuat fungsi rekursif

    private static int faktorial(int x) {
        if(x == 1) {
            System.out.println("x : " + x);
            return x;
        }
        System.out.println("x : " + x);

        return x * faktorial(x - 1);
    }

    private static int jumlahNilai(int x) {
        if(x == 0) {
            return x;
        }
        System.out.println("x : " + x);

        return x + jumlahNilai(x - 1);
    }

    private static void printNilai(int n) {
        System.out.println("nilai = " + n);

        if(n == 0) {
            return;
        }

        n--;

        printNilai(n);
    }

}
