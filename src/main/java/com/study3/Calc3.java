package com.study3;

public class Calc3 {
    public static void main(String[] args) {
        int age = 10;
        int var = age++ - age-- + ++age;
        System.out.printf("age = %d, var = %d\n", age, var);
    }
}
