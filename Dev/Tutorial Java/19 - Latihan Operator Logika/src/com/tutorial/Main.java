package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // * Membuat sebuah object untuk menangkap input dari user

    // ** Program sederhana untuk menebak sebuah angka

    int nilaiBenar = 6;
    int nilaiTebakan;
    boolean statusTebakan;
    /*
    System.out.print("Masukkan nilai: ");
    nilaiTebakan = scanner.nextInt();
    System.out.println("Nilai yang anda masukkan adalah: " + nilaiTebakan);

    statusTebakan = (nilaiTebakan == nilaiBenar);
    System.out.println("Tebakan anda adalah " + statusTebakan);
    */
    // * Operasi aljabar boolean (AND / OR)
        System.out.print("Masukkan nilai diatas 4 dan dibawah 9 : ");
        nilaiTebakan = scanner.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("Nilai yang anda masukkan " + statusTebakan);
    }
}
