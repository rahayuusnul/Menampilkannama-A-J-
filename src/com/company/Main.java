package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char firstInitial = 'a';
        System.out.println("Masukan inisial nama anda");

        try {
            firstInitial = (char) System.in.read();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (firstInitial == 'a')
            System.out.println("Nama anda pasti ayu");
        else if (firstInitial == 'b')
            System.out.println("nama anda pasti banu");
        else if (firstInitial == 'c')
            System.out.println(" nama anda pasti caca");
        else if (firstInitial == 'd')
            System.out.println(" nama anda pasti adalah dina");
        else if (firstInitial == 'e')
            System.out.println(" nama anda pasti adalah emi");
        else if (firstInitial == 'f')
            System.out.println(" nama anda pasti adalah figo");
        else if (firstInitial == 'g')
            System.out.println(" nama anda pasti adalah gigih");
        else if (firstInitial == 'h')
            System.out.println(" nama anda pasti adalah heni");
        else if (firstInitial == 'i')
            System.out.println(" nama anda pasti adalah ina");
        else if (firstInitial == 'j')
            System.out.println(" nama anda pasti adalah joni");
        else
            System.out.println(" nama anda tidak terdaftar");

    }
}