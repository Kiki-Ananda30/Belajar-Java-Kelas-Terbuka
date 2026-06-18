package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int var1 = 9;
        int var2 = 3;

        int hasil;

        // * 1. Penjumlahan
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);

        // * 2. Pengurangan
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d\n",var1,var2,hasil);

        // * 3. Perkalian
        hasil = var1 * var2;
        System.out.printf("%d * %d = %d\n",var1,var2,hasil);

        // * 4. Pembagian
        hasil = var1 / var2;
        System.out.printf("%d / %d = %d\n",var1,var2,hasil);

        float var3 = 10;
        float var4 = 5;
        float hasilFloat;

        hasilFloat = var3 / var4;
        System.out.printf("%.1f / %.1f = %.1f\n",var3,var4,hasilFloat);

        // * 5. Modulus
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d\n",var1,var2,hasil);

    }
}



