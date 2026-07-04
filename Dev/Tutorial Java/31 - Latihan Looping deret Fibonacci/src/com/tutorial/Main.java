package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    int fn, fn_1, fn_2, n, i;

    fn_2 = 0;
    fn_1 = 1;
    fn = 1;
    i = 1;

    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        n = scanner.nextInt();

        // * for
//        for(i = 1; i <= n; i++) {
//            System.out.println("Nilai ke-" + i + " adalah " + fn);
//            fn = fn_2 + fn_1;
//            fn_2 = fn_1;
//            fn_1 = fn;
//        }
        // * while
//        while (i <= n) {
//            System.out.println("Nilai ke-" + i + " adalah " + fn);
//            i++;
//            fn = fn_2 + fn_1;
//            fn_2 = fn_1;
//            fn_1 = fn;

        // * do while
    do {
            System.out.println("Nilai ke-" + i + " adalah " + fn);
            i++;
            fn = fn_2 + fn_1;
            fn_2 = fn_1;
            fn_1 = fn;
        } while (i <= n);
    }
}
