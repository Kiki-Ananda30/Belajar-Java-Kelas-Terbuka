package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // * Operasi logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        // ** AND, OR, XOR, NOT

        boolean a,b,c;

        // * OR --> atau (||)
        System.out.println("---OR (||)---");
        a = true;
        b = true;
        c = (a || b);

        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = false;
        c = (a || b);

        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a || b);

        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a || b);

        System.out.println(a + " || " + b + " = " + c);

        System.out.println();

        // * AND --> dan (&&)
        System.out.println("---AND (&&)---");
        a = true;
        b = true;
        c = (a && b);

        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = false;
        c = (a && b);

        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a && b);

        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a && b);

        System.out.println(a + " && " + b + " = " + c);

        System.out.println();

        // * XOR --> exclusive or (^)
        System.out.println("---XOR (^)---");
        a = true;
        b = true;
        c = (a ^ b);

        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = false;
        c = (a ^ b);

        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a ^ b);

        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);

        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println();

        // * NOT --> negasi (!)
        System.out.println("---NOT (!)---");
        a = true;
        c = !a;

        System.out.println(a + " --> (!) = " + c);

        b = false;
        c = !b;

        System.out.println(b + " --> (!) = " + c);
    }
}
