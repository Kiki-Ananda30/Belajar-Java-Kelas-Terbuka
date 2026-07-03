package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a,b,hasil;
        String operator;

        System.out.print("Nilai a = ");
        a = scanner.nextFloat();
        System.out.print("operator  = ");
        operator = scanner.next();
        System.out.print("Nilai b = ");
        b = scanner.nextFloat();

        switch (operator) {
            case "+" :
                hasil = a + b;
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            case "-" :
                hasil = a - b;
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            case "*" :
                hasil = a * b;
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            case "/" :
                hasil = a / b;
                System.out.println(a + " " + operator + " " + b + " = " + hasil);
                break;
            default:
                System.out.println(operator + " tidak tersedia");
                break;
        }
    }
}
