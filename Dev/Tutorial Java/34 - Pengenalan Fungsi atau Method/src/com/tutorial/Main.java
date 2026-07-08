package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int x,y;
        x = 5;
        y = hitung(x);

        System.out.println(y);

        x = 20;
//        y = (x + 2) * x;
        y = hitung(x);
        System.out.println(y);

        x = 40;
//        y = (x + 2) * x;
        y = hitung(x);
        System.out.println(y);

        }
        private static int hitung(int param) {
            int hasil;

            hasil = (param + 2) * param;
            return hasil;
    }
}
