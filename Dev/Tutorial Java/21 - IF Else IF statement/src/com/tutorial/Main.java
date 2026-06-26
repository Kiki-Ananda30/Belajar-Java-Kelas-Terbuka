package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int umur = 10;

        // * START
        if (umur > 10 && umur < 18) {

            System.out.println("Umur anda : " + umur + ", anda remaja.");

        } else if (umur <= 10) {

            System.out.println("Umur anda : " + umur + ", anda bocah.");

        } else {
            System.out.println("Umur anda : " + umur + ", anda dewasa.");
        }
        // * END
    }
}
