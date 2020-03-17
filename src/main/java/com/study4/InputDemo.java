package com.study4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        System.out.println("請輸入一個整數: ");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            System.out.printf("您所輸入的是 %d, 他的平方是 %.1f\n", x, Math.pow(x, 2));
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤 ! " + e);
        }
        
        
    }
}
