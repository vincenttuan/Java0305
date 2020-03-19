package com.study5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int ans = new Random().nextInt(99) + 1;
        int min = 0;
        int max = 100;
        do {            
            // 1.請使用者輸入
            Scanner sc = new Scanner(System.in);
            System.out.printf("請猜一個數字 %d ~ %d :\n", min, max);
            int guess = sc.nextInt();
            // 2.檢查 guess 是否在 min 與 max 之間 ?
            if(!(guess > min && guess < max)) { // guess <= min || guess >= max
                System.out.println("資料範圍錯誤, 請重新輸入");
                continue;
            }
            // 3.判斷是否答對 ?
            if(guess > ans) {
                max = guess;
                continue;
            } else if(guess < ans) {
                min = guess;
                continue;
            } else {
                System.out.println("恭喜答對了!");
                break;
            }
        } while (true);
    }
}
