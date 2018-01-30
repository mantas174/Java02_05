package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Parašykite programą, kuri paprašytų įvesti vartotojo du skaičius ir atspausdinti jų
        //skirtumą bei sumą

        //Papildyti 1.3  programą sumos ir skirtumo skaičiavimai turi būti skirtinguose metoduose.

        //Papildykite 1.4.  programą ir realizuokite overload funkcionalumą sumai ir skirtumui.
        //Vienas sumos metodas turi priimti ir grąžinti int tipo reikšmę, o kitas float. Taip pat ir su
        //skirtumu.



        Scanner in = new Scanner(System.in);
        int sk1, sk2;

        System.out.println("Iveskite du skaicius: ");
        sk1 = in.nextInt();
        sk2 = in.nextInt();

        System.out.println("(int)Suma: " + suma(sk1, sk2));
        System.out.println("(float) Suma: " + suma((float)sk1, (float)sk2));
        System.out.println("(int) Skirtumas: " + skirtumas(sk1, sk2));
        System.out.println("(float) Skirtumas: " + skirtumas((float)sk1, (float)sk2));
    }
    public static int suma(int a, int b){
        return a + b;
    }
    public static float suma(float a, float b){
        return a + b;
    }
    public static int skirtumas(int a, int b){
        return a - b;
    }
    public static float skirtumas(float a, float b){
        return a - b;
    }
}