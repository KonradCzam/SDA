package com.company;

public class Main {

    public static void main(String[] args)
    {
        Double result = divide(1,2);
        System.out.println("Konrad Czamanski result: " + result);
    }
    public static Double divide(double a, double b){
        Double c;
        c = a/b;
        return c;
    }
    public static Integer multiply(Integer a, Integer b){
        Integer c;
        c = a * b;

        return c;
    }

}