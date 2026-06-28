package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int input;
        String x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        input = scanner.nextInt();

        x = (input % 2 == 0) ? "nilai genap" : "nilai ganjil";
        System.out.println(x);
    }
}
