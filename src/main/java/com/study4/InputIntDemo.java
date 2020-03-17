package com.study4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputIntDemo {
    public static void main(String[] args) {
        System.out.println("請輸入整數: ");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            System.out.printf("您輸入的是: %d, 平方= %.1f\n", x, Math.pow(x, 2));
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤, 錯誤原因:" + e);
        }
    }
}
