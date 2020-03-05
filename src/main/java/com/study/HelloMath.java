package com.study;

public class HelloMath {
    public static void main(String[] args) {
        System.out.println(10+2);
        System.out.println(10-2);
        System.out.println(10*2);
        System.out.println(10/2);
        System.out.println(10%2); // 餘數
        System.out.println(1/2);
        System.out.println(1/2.0);
        System.out.println(60.0/((170.0/100)*(170.0/100)));
        System.out.println(60.0/Math.pow(170.0/100, 2));
        System.out.printf("%.2f", 60.0/Math.pow(170.0/100, 2));
    }
}
