package com.study4;

import java.util.Scanner;

public class InputIntCheckOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個整數: ");
        int x = sc.nextInt();
        if(x % 2 == 0) {
            System.out.printf("%d 是偶數\n", x);
        } else {
            System.out.printf("%d 是奇數\n", x);
        }
    }
}
