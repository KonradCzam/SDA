package com.company;

public class Main {

    public static void main(String[] args)
    {

        double result = divide(1,2);
        System.out.println("Konrad Czmanski result: " + result);
        int wynik2 = subtraction(5,3);
        System.out.println("Wynik odejmowania: " + wynik2);

    }
    public static double divide(double a, double b){
        double c;
        c = a/b;
        return c;
    }


    public Integer multiply(Integer a, Integer b){
        Integer c;
        c = a*b;
        return c;
    }

    public static int subtraction(int x, int y){
        int wynik;
        wynik = x-y;
        return wynik;
    }
}