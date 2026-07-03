package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int a = 1;
        boolean kondisi = true;

        do {
            System.out.println("do while ke-" + a);

            if (a == 10) {
                kondisi = false;
                break;
            }

            a++;
        } while (kondisi);

        System.out.println("Looping selesai");

        System.out.println("Nilai a saat ini = " + a);

    }
}
