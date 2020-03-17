package com.study4;

import java.util.Scanner;

public class InputScoreDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入分數: ");
        int score = sc.nextInt();
        String result1 = (score >= 60) ? "及格" : "不及格";
        String result2 = (score < 50) ? "低標" : (score > 70) ? "高標" : "中標";
        System.out.printf("%d %s %s\n", score, result1, result2);
    }
}
