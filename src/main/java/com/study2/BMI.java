package com.study2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身高(cm):");
        double h = sc.nextDouble();
        System.out.println("請輸入體重(kg):");
        double w = sc.nextDouble();
        // 計算 bmi
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", h, w, bmi);
    }  
}
