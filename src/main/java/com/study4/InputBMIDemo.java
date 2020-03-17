package com.study4;

import java.util.Scanner;

public class InputBMIDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身高(cm): ");
        double h = sc.nextDouble();
        System.out.println("請輸入體重(kg): ");
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.1f\n", h, w, bmi);
    }
}
