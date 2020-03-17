package com.study4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputBMIDemo {
    
    public static void begin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身高(cm): ");
        double h = sc.nextDouble();
        System.out.println("請輸入體重(kg): ");
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        // 判定結果
        String result = "";
        if(bmi > 23) {
            result = "過重";
        } else if(bmi <= 18) {
            result = "過輕";
        } else {
            result = "正常";
        }
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.1f 判定結果: %s\n", h, w, bmi, result);
        System.out.println("是否要繼續輸入? (y/n) ");
        String s = sc.next();
        if(s.equalsIgnoreCase("y")) {
            begin();
        }
    }
    
    public static void main(String[] args) {
        try {
            begin();
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤, 請全部重新輸入");
            main(null);
        }
        
    }
}
