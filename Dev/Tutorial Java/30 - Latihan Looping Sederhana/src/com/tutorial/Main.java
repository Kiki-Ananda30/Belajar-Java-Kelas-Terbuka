package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nilaiAwal;
        int nilaiAkhir;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai awal : ");
        nilaiAwal = scanner.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        nilaiAkhir = scanner.nextInt();

        // * 1
        for(; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            System.out.println("Looping ke-" + nilaiAwal);
            total = total + nilaiAwal;
            System.out.println("Total = " + total);
            System.out.println();
        }

//         * 2

        while (nilaiAwal <= nilaiAkhir) {
            System.out.println("Looping ke-" + nilaiAwal);
            System.out.println("Total " + (total = total + nilaiAwal));
            nilaiAwal++;
            System.out.println();
        }

        // * 3
//        do {
//            System.out.println("Looping ke-" + nilaiAwal);
//            System.out.println("Total " + (total = total + nilaiAwal));
//            nilaiAwal++;
//            System.out.println();
//        } while (nilaiAwal <= nilaiAkhir);
    }
}
