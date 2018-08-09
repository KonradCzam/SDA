package com.company;

public class Main {

    public static void main(String[] args)
    {
        Integer result = divide(1,2);
        System.out.println("Konrad Czmanskis result: " + result);
    }
    public static Integer divide(Integer a, Integer b){
        Integer c;
        c = a/b;
        return c+c;
    }

}