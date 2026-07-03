package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        boolean kondisi = true;

    while (kondisi) {
        System.out.println("Looping ke - " + a);

        if (a == 10) {
            kondisi = false;
            break;
            }

        a++;
    }
        System.out.println(a);
    }
}
