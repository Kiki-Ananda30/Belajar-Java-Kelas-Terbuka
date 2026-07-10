package com.tutorial;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = scanner.nextInt();

        int nilaiFibonacci = fibonacci(nilai, "Atas");
        System.out.println("Fibonacci ke-" + nilai + " adalah " + nilaiFibonacci);
    }

    private static int fibonacci(int n, String daun) {
        System.out.println("Daun " + daun);
        System.out.println("Fibonacci ke-" + n);

        if (n == 1 || n == 0) {
            return n;
        } else {
        return fibonacci(n - 1, "Kiri") + fibonacci(n - 2, "Kanan");
        }
    }
}
