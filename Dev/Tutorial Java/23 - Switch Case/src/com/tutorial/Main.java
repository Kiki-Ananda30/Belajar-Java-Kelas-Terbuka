package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // * Switch case ekspresinya berupa satuan byte, short, int, long, string atau enum
        String input;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1 sampai 7 : ");
        input = scanner.next();

        switch (input) {
            case "1" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari senin.");
                break;

            case "2" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari selasa.");
                break;

            case "3" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari rabu.");
                break;

            case "4" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari kamis.");
                break;

            case "5" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari jum'at.");
                break;

            case "6" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari sabtu.");
                break;

            case "7" :
                System.out.println("Anda memilih angka " + input + ". Hari ini hari minggu.");
                break;
            default:
                System.out.println("Nama hari tidak ada.");
        }

        System.out.println();

        System.out.print("Masukkan nama : ");
        input = scanner.next().toUpperCase();

        switch (input) {
            case "DAVID" :
                System.out.println(input + " Hadir.");
                break;
            case "JOJO" :
                System.out.println(input + " Hadir.");
                break;
            case "OTONG" :
                System.out.println(input + " Hadir.");
                break;
            default:
                System.out.println(input + " Tidak hadir.");
        }

        scanner.close();
    }
}
