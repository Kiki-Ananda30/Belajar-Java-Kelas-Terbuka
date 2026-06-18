package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // * Tipe data di Java : integer, byte, short, long, double, float, char, boolean

        // ** Integer (bilangan bulat)
        int i = 21;
        System.out.println("=====Integer=====");
        System.out.println("nilai integer i = " + i);
        System.out.println("nilai maximum interger = " + Integer.MAX_VALUE);
        System.out.println("nilai minimum interger = " + Integer.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Integer.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Integer.SIZE + " bit");

        System.out.println();

        // ** Byte (bilangan bulat)
        byte b = 6;
        System.out.println("=====Byte=====");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai maximum byte = " + Byte.MAX_VALUE);
        System.out.println("nilai minimum byte = " + Byte.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Byte.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Byte.SIZE + " bit");

        System.out.println();

        // ** Short (bilangan bulat)
        short s = 12;
        System.out.println("=====Short=====");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai maximum short = " + Short.MAX_VALUE);
        System.out.println("nilai minimum short = " + Short.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Short.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Short.SIZE + " bit");

        System.out.println();

        // ** Long (bilangan bulat)
        long l = 123L;
        System.out.println("=====Long=====");
        System.out.println("nilai long l = " + l);
        System.out.println("nilai maximum long = " + Long.MAX_VALUE);
        System.out.println("nilai minimum long = " + Long.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Long.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Long.SIZE + " bit");

        System.out.println();

        // ** Double (bilangan desimal)
        double d = 7.5D;
        System.out.println("=====Double=====");
        System.out.println("nilai double d = " + d);
        System.out.println("nilai maximum double = " + Double.MAX_VALUE);
        System.out.println("nilai minimum double = " + Double.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Double.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Double.SIZE + " bit");

        System.out.println();

        // ** Float (bilangan desimal)
        float f = 20.5F;
        System.out.println("=====Float=====");
        System.out.println("nilai float f = " + f);
        System.out.println("nilai maximum float = " + Float.MAX_VALUE);
        System.out.println("nilai minimum float = " + Float.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Float.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Float.SIZE + " bit");

        System.out.println();

        // ** Char
        char c = 't';
        System.out.println("=====Char=====");
        System.out.println("nilai char c = " + c);
        System.out.println("nilai maximum char = " + Character.MAX_VALUE);
        System.out.println("nilai minimum char = " + Character.MIN_VALUE);
        System.out.println("ukuran besar memori = " + Character.BYTES + " bytes");
        System.out.println("ukuran besar memori = " + Character.SIZE + " bit");

        System.out.println();

        // ** Boolean (Nilai boolean hanya true atau false)
        boolean bool = true;
        System.out.println("=====Boolean=====");
        System.out.println("nilai Boolean bool = " + bool);
        System.out.println("nilai maximum Boolean = " + Boolean.TRUE);
        System.out.println("nilai minimum Boolean = " + Boolean.FALSE);
        bool = false;
        System.out.println("Nilai bool sekarang = " + bool);
    }
}
