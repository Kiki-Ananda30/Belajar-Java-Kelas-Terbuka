package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int luas, keliling;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        int inputPanjang = scanner.nextInt();
        System.out.print("Masukkan lebar : ");
        int inputLebar = scanner.nextInt();

        persegiPanjang(inputPanjang, inputLebar);

        kelilingDanLuas(inputPanjang, inputLebar);

        luasPersegiPanjang(inputPanjang, inputLebar);

//        System.out.println("Luas = " + luasPersegiPanjang(inputPanjang, inputLebar));
//
//        System.out.println("Keling = " + kelilingPanjang(inputPanjang, inputLebar));

    }

    private static void kelilingDanLuas(int panjang, int lebar) {
        System.out.println("Keliling = " + kelilingPanjang(panjang, lebar));
        System.out.println("Luas = " + luasPersegiPanjang(panjang, lebar));
    }

    private static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    private static float kelilingPanjang(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    private static void persegiPanjang(int panjang, int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
