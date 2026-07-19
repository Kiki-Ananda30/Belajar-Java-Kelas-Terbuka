package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 6, 0, 3, 1, 9, 7, 3, 5, 6,};
        int[] arr2 = {0, 4, 6, 1, 3, 8, 0 ,4, 5, 2};

        // * Penjumlahan antara dua buah Array
        printArray(arr1, "arr1 adalah");
        printArray(arr2, "arr2 adalah");
        printArray(penjumlahan(arr1, arr2),  "Hasil penjumlahan :");

        System.out.println();

        // * Penggabungan dua buah Array
        int[] penggabungan = new int[ arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++) {
            penggabungan[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++) {
            penggabungan[arr1.length + i] = arr2[i];
        }

        printArray((penggabungan), "Hasil Merge:");

        System.out.println();

        // * Sorting Array dari bawah ke atas
        Arrays.sort(arr1);
        printArray(arr1, "arr1 sorted:");
        reverse(arr1);
        printArray(arr1, "Arr1 reverse sorted:");

        System.out.println("----------");
        Arrays.sort(arr2);
        printArray(arr2, "arr2 sorted:");
        reverse2(arr2);
        printArray(arr2, "Arr2 reverse sorted:");

        System.out.println("----------");
        Arrays.sort(penggabungan);
        printArray(penggabungan, "penggabungan sorted:");
        reverse(penggabungan);
        printArray(penggabungan, "penggabungan reverse sorted:");
    }

    private static void reverse2(int[] a) {
        Arrays.sort(a);
        int buffer;

        for(int i = 0; i < a.length / 2; i++) {
            buffer = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] a) {
        Arrays.sort(a);

        int[] arrReversed = Arrays.copyOf(a, a.length);

        for(int i = 0; i < a.length; i++) {
            a[i] = arrReversed[(arrReversed.length - 1) - i];
        }
    }

    private static int[] penjumlahan(int[] a, int[] b) {
        int[] hasil = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            hasil[i] = a[i] + b[i];
        }
        return hasil;
    }

    private static void printArray(int[] dataArray, String pesan) {
        System.out.println(pesan + " " + Arrays.toString(dataArray));
    }
}
