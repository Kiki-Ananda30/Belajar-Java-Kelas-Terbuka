package com.tutorial;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hasil penjumlahan integer " + penjumlahanInt(10, 5));
        System.out.println("Hasil penjumlahan float " + penjumlahanfloat(6, 2.5f));
        System.out.println("Hasil penjumlahan float " + penjumlahanfloat(4.5f, 3));

        System.out.println();

        printAngka(10);
        printAngka(10.5f);
        printAngka(12.5d);
        printAngka(35);
    }

    private static int penjumlahanInt(int angka1, int angka2) {
        return angka1 + angka2;
    }

    private static float penjumlahanfloat(int angka1, float angka2) {
        return angka1 + angka2;
    }

    private static float penjumlahanfloat(float angka1, int angka2) {
        return angka1 + angka2;
    }

    private static void printAngka(int angka) {
        System.out.println("Angka dengan tipe data integer yg bernilai " + angka);
    }

    private static void printAngka(float angka) {
        System.out.println("Angka dengan tipe data float yg bernilai " + angka);
    }

    private static void printAngka(double angka) {
        System.out.println("Angka dengan tipe data double yg bernilai " + angka);
    }
}
