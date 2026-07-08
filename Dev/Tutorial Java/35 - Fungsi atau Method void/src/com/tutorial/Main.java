package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // * void --> artinya hampa atau kosong

        fungsiVoid("Halo apa kabar?");

        selamatPagi("Kiki");

        System.out.println(fungsiSimpel());

    }
    // * Fungsi atau method tanpa return
    private static void fungsiVoid(String param) {
        System.out.println(param);
    }

    private static void selamatPagi(String nama) {
        System.out.println("Selamat Pagi " + nama);
    }

    // * Fungsi atau method dengan kembalian atau return untuk mengembalikan nilai (10.0f)
    private static float fungsiSimpel() {
        return 10.0f;
    }
}
