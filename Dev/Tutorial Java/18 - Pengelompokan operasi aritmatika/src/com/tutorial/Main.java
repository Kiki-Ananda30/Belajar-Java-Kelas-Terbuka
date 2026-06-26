package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int hasil = 10 / 2 + 2 - 2 * 3;
        System.out.println(hasil); // ? Kesimpulannya adalah perkalian atau pembagian akan dilakukan terlebih dahulu sebelum penjumlahan atau pengurangan

        hasil = 10 / 2 * 5;
        System.out.println(hasil); // ? Perkalian dan pembagian akan dilakukan sesuai dengan urutan dari kiri ke kanan

        hasil = 5 + 2 - 10;
        System.out.println(hasil); // ? Penjumlahan dan pengurangan akan dilakukan sesuai dengan urutan dari kiri ke kanan

        hasil = 10 + 5 * 2;
        System.out.println(hasil); // ? Perkalian akan dilakukan terlebih dahulu

        hasil = 2 * (10 + 5);
        System.out.println(hasil); // ? Menggunakan pengelompokan operasi dengan ( ) maka angka dan operator yg ada di dalam ( ) akan didahulukan

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        // * Perhitungan persamaan kuadrat
        int m, x, c;

        System.out.print("Nilai x : ");
        x = scanner.nextInt();
        System.out.print("Nilai m : ");
        m = scanner.nextInt();
        System.out.print("Nilai c : ");
        c = scanner.nextInt();

        int y = (m * x * x) + c;
        System.out.println("Nilai y = " + y);

        scanner.close();
    }
}
