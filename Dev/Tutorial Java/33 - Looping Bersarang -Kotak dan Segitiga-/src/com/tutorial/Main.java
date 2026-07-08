package com.tutorial;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

            System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
                if(i == j) {
                    break;
                }
            }
            System.out.println();
        }

            System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i + j == 4) {
                    break;
                }
            }
            System.out.println();
        }

            System.out.println();

        int i, j;
        int k = 9;

        // Wajik bagian atas
        // 'i' membuat (*) baris ke bawah karena ada '\n'
        // 'j' membuat (*) baris ke kanan
        // 'k' membuat batas (*) yang akan dibuat
        for(i = 0; i < k; i++){
            for(j=0; j < k; j++){
                if ((i+j) >= 9){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        // Wajik bagian bawah
        // 'i' membuat * baris ke bawah karena ada '\n'
        // 'j' membuat * baris ke kanan
        // 'k' membuat batas (*) yang akan dibuat
        for( i = 0; i < k; i++){
            for( j = 0; j < k; j++){
                if ((j-i) >= 0){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
