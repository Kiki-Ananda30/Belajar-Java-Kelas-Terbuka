package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int panjang, lebar, luas, tinggi, volume;

        // * Membuat perhitungan luas persegi
        // ** Luas = panjang * lebar

        System.out.println("Menghitung Luas");
        System.out.print("Masukkan panjang persegi: ");
        panjang = scanner.nextInt();
        System.out.print("Masukkan lebar persegi: ");
        lebar = scanner.nextInt();

        luas = panjang * lebar;
        System.out.printf("%d x %d = %d\n", panjang, lebar, luas);

        System.out.println();

        // ** Volume = luas * tinggi
        System.out.println("Menghitung volume");
        System.out.print("Masukkan tinggi persegi: ");
        tinggi = scanner.nextInt();

        volume = luas * tinggi;
        System.out.printf("%d x %d = %d\n", luas, tinggi, volume);
    }
}
