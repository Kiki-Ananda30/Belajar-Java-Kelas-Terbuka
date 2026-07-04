package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int a = 0;

        // * break, continue, return

        // * break
//        while(true) {
//            if(a == 10) {
//                break;
//            }
//
//            a++;
//            System.out.println("a ke-" + a);
//        }

        // * continue
//        while(true) {
//            a++;
//            System.out.println("a ke-" + a);
//
//            if(a == 5) {
//                continue; // ? akan lanjut dari awal loop lagi
//            } else if (a == 10) {
//                break;
//            }
//            System.out.println();
//        }

        // * return

        while(true) {
            a++;
            System.out.println("a ke-" + a);

            System.out.println("Looping selesai");
            return; // ? akan keluar dari method main
        }


    }
}
