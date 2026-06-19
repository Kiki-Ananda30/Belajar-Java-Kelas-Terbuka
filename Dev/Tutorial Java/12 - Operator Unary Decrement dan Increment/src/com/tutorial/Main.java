package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // * unary --> operasi yang dilakukan pada satu variable

        // * Unary + dan -
        int angka = 8;
        System.out.printf("unary '+' membuat %d menjadi %d\n",angka,+angka);
        System.out.printf("unary '-' membuat %d menjadi %d\n",angka,-angka);

        // * Unary increment dan decrement
        int angka2 = 10;
        angka2++;
        System.out.println("operator unary ++ (increment) membuat angka2 menjadi " + angka2);

        int angka3 = 6;
        angka3--;
        System.out.println("operator unary -- (decrement) membuat angka3 menjadi " + angka3);

        int angka4 = 5;
        System.out.printf("angka4 dengan ++ prefix menjadi %d\n", ++angka4); // ? Nilai angka4 akan bertambah 1 sebelum ditampilkan

        int angka5 = 7;
        System.out.printf("angka5 dengan ++ postfix %d\n", angka5++); // ? Nilai angka5 akan ditampilkan terlebih dahulu, kemudian bertambah 1
        System.out.printf("angka5 setelah postfix menjadi %d\n", angka5); // ? Nilai angka5 setelah ditambah 1

        // * Unary boolean dengan ! untuk negasi
        boolean kondisi = true;
        System.out.println("nilai kondisi sebelum negasi: " + kondisi);
        System.out.println("nilai kondisi setelah negasi: " + !kondisi);
    }
}
