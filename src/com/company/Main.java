package com.company;

public class Main {

    public static void main(String[] args)
    {
        double result = divide(1,2);
        System.out.println("Konrad Czmanskis result: " + result);
    }
    public static Double divide(double a, double b){
        Double c;
        c = a/b;
        return c;
    }


    public Integer multiply(Integer a, Integer b){
        Integer c;
        c = a*b;
        return c;
    }
}
