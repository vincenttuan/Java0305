package com.study3;

public class Calc5 {
    public static void main(String[] args) {
        int age = 10;
        int var = 10;
        boolean check = (age > var) && (++age > var);
        System.out.println(check);
        System.out.printf("age = %d\n", age);
        
    }
}
