package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // * Program untuk konversi data
        int nilaiInt = 550; // ? Int = 4 byte atau 32-bit
        System.out.println("Nilai int = " + nilaiInt);

        // * Memperluas ke rentang tipe data yang lebih besar
        long nilaiLong = nilaiInt; // ? Long = 8 byte atau 64-bit
        System.out.println("Nilai long = " + nilaiLong);

        // * Mempersempit ke rentang tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt; // ? Byte = 1 byte atau 8-bit
        System.out.println("Nilai byte = " + nilaiByte);

        // * Casting pembagian
        float a = 10; // ? Untuk casting pembagian secara otomatis, cukup ganti salah satu variable menjadi float atau double,                      maka hasilnya akan otomatis menjadi float atau double.
        int b = 4;
        float c = a/b; // ? Hasil pembagian akan otomatis menjadi float karena salah satu variable (a) adalah float.

        System.out.printf("%f / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float) x / y;

        System.out.printf("%d / %d = %.1f\n",x,y,z);
    }
}