package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner;
        float a,b, hasil;
        char operator;

        scanner = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = scanner.nextFloat();
        System.out.print("Pilih operator = ");
        operator = scanner.next().charAt(0);
        System.out.print("Nilai b = ");
        b = scanner.nextFloat();

        System.out.println(a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("= " + hasil );

        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("= " + hasil );

        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("= " + hasil );

        } else if (operator == '/') {

            if (b == 0){
                System.out.println("Tidak bisa dibagi dengan 0, hasilnya akan infinity");
            } else {
                hasil = a / b;
                System.out.println("= " + hasil );
            }

        } else {
            System.out.println("Operator tidak tersedia");
        }
    }
}
