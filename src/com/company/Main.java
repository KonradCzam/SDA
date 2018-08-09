package com.company;

public class Main {

    private static double wynik;
    private double a;
    private double b;


    public static void main(String[] args)
    {
        System.out.println(dodawanie(2,5));
        System.out.println(mnozenie(3,4));
        System.out.println(odejmowanie(5,3));
        System.out.println(dzielenie(4,2));

    }
    public static double dodawanie(double a, double b){
         wynik = a + b;

        return wynik;
    }
    public static double odejmowanie(double a, double b){
        wynik = a - b;

        return wynik;
    }
    public static double mnozenie(double a, double b){
        wynik = a * b;

        return wynik;
    }

    public static double dzielenie(double a, double b){
        wynik = a / b;

        return wynik;
    }
}