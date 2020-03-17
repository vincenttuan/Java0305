package com.study4;

import java.util.Scanner;

public class InputLevelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入 Level (A - H): ");
        String level = sc.next();
        switch(level) {
            case "A":
            case "B":
                System.out.println("高標");
                break;
            case "C":
            case "D":
            case "E":
                System.out.println("中標");
                break;
            default:
                System.out.println("低標");
        }
        
    }
}
