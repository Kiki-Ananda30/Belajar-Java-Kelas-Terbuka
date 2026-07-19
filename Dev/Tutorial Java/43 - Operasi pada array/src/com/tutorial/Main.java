package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1, 2, 3, 4, 5};
        int[] arrayAngka2 = new int[5];

        System.out.println("====Mengubah Array menjadi String====");
        printAngka(arrayAngka1);

        System.out.println("\n====Mengkopi Array====");
        printAngka(arrayAngka1);
        printAngka(arrayAngka2);

        System.out.println("----Mengkopi dengan for loop----");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printAngka(arrayAngka1);
        System.out.println(arrayAngka1);
        printAngka(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\n----Mengkopi dengan copyOf----");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
        printAngka(arrayAngka1);
        System.out.println(arrayAngka1);
        printAngka(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\n----Mengkopi dengan copyOfRange----");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka2, 2, 5);
        printAngka(arrayAngka4);
        System.out.println(arrayAngka4);

        System.out.println("\n====fill Array====");
        int[] arrayAngka5 = new int[15];
        printAngka(arrayAngka5);
        Arrays.fill(arrayAngka5, 100);
        printAngka(arrayAngka5);

        System.out.println("\n====Komparasi Array====");
        System.out.println("\n----Membandingkan antara dua buah Array----");
        int[] arrayAngka6 = {6, 7, 8, 9, 10};
        int[] arrayAngka7 = {6, 7, 8, 9, 10};

        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
//        arrayAngka7[0] = 600;
//        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));

        if(Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

        System.out.println("\nMengecek Array mana yg lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7)); // ? output 0 karena arrayAngka6 dan arrayAngka7 memiliki nilai yang sama

        System.out.println("\nMengecek index mana yg berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        System.out.println("\nsort Array");
        int[] arrayAngka8 = {4, 0, 2, 5, 6, 1, 4, 9};
        printAngka(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printAngka(arrayAngka8);

        System.out.println("\nMencari Array");
//        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, 2); // ? Harus di sort dulu kalau tidak hasilnya tidak sesuai expektasi
        System.out.println("ada di index ke " + posisi);

        // * PR
        System.out.println("\nPR");
        int[] arrayAngka9 = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int[] arrayAngka10 = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // ** Sort array dari yang terbesar ke terkecil
        reverse(arrayAngka9);
        System.out.println(Arrays.toString(arrayAngka9));

        // ** penjumlahan kedua arrays
        penjumlahan(arrayAngka9, arrayAngka10);
        int[] hasil = Arrays.copyOf(arrayAngka9, arrayAngka9.length);
        System.out.println(Arrays.toString(hasil));

        // ** Menggabungkan kedua buah array
        int arrayAngka9Length = arrayAngka9.length;
        int arrayAngka10Length = arrayAngka10.length;

        int hasilPanjangArray = arrayAngka9Length + arrayAngka10Length;

        int[] arrayHasil = new int[hasilPanjangArray]; // ? Menampung element dari arrayAngka9 dan arrayAngka10 setelah digabung atau merge

        System.arraycopy(arrayAngka9, 0, arrayHasil, 0, arrayAngka9Length);
        System.arraycopy(arrayAngka10, 0, arrayHasil, arrayAngka9Length, arrayAngka10Length);

        System.out.println("Hasil penggabungan kedua array adalah " + Arrays.toString(arrayHasil));
    }

    private static void penjumlahan(int[] array1, int[] array2) {
        if(array1.length != array2.length) {
            System.out.println("panjang kedua array tidak sama!");
        }

        for(int i = 0; i < array1.length; i++) {
            array1[i] += array2[i];
        }
    }

     public static void reverse(int[] a) {
        int length = a.length;

        for(int i = 0; i < length / 2; i++) {
            int b = a[i];
            a[i] = a[length - i - 1];
            a[length - i - 1] = b;
        }
    }

    private static void printAngka(int[] dataArray) {
        System.out.println("Array " + Arrays.toString(dataArray)); // ? output -1 karena tidak ada yg berbeda, kalau ada yg berbeda maka index yg berbeda akan dihasilkan dari output
    }
}
