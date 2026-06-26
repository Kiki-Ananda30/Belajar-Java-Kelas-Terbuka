package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int umur = 18;

        // * START
        if (umur < 18) {

            if (umur > 10) {

                System.out.println("Umur anda " + umur + ", anda remaja");

            } else {

                System.out.println("Umur anda " + umur + ", anda bocah");
            }
        }
        else {
            if (umur < 60) {

                System.out.println("Umur anda " + umur + ", anda dewasa");

            } else {

                System.out.println("Umur anda " + umur + ", anda lansia");
            }
        }
        // * END

        System.out.println();

        int nilai = 10;

        if (nilai >= 75) {
            if (nilai <= 80) {

                System.out.println("Nilai anda " + nilai + ", bagus.");

            } else if (nilai <= 90) {

                System.out.println("Nilai anda " + nilai + ", sangat bagus.");

            } else if (nilai >= 91 && nilai <= 100) {

                System.out.println("Nilai anda " + nilai + ", luar biasa.");

            } else {
                System.out.println("Nilai anda diatas 100, TIDAK MUNGKIN." );
            }

        } else {
            System.out.println("Nilai anda " + nilai + ", anda tidak lulus.");
        }
    }
}
