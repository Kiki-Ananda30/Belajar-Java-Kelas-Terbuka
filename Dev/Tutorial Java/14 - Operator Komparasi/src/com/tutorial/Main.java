package com.tutorial;

public class Main {
    public static void main(String[] args) {
    // * Operator komparasi --> akan menghasilkan nilai dalam bentuk boolean

        int a,b;
//        float a,b;
        boolean hasilKomparasi;

        // * Operator equal atau persamaan
        System.out.println("---EQUAL---");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        System.out.println();

        // * Operator not equal atau pertidaksamaan
        System.out.println("---NOT EQUAL---");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d == %d --> %s\n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a, b, hasilKomparasi);

        System.out.println();

        // * Operator less than atau kurang dari
        System.out.println("---LESS THAN---");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);

        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a, b, hasilKomparasi);

        System.out.println();

        // * Operator greater than atau lebih dari
        System.out.println("---GREATER THAN---");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a, b, hasilKomparasi);

        System.out.println();

        // * Operator less than equal atau kurang dari sama dengan
        System.out.println("---LESS THAN EQUAL---");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        a = 7;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        a = 16;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a, b, hasilKomparasi);

        System.out.println();

        // * Operator greater than equal atau lebih dari sama dengan
        System.out.println("---GREATER THAN EQUAL---");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a, b, hasilKomparasi);

        a = 4;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a, b, hasilKomparasi);

        a = 15;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a, b, hasilKomparasi);
    }
}
