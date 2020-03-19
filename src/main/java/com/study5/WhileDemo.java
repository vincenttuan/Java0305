package com.study5;

import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
        while (true) {
            int x = new Random().nextInt(100); // 0~99 隨機亂數
            if(x != 0 && x % 19 == 0) {
                System.out.printf("遇到 19 的倍數 %d, 所以迴圈停止\n", x);
                break; // 迴圈停止
            }
            System.out.println(x);
        }
    }
}
