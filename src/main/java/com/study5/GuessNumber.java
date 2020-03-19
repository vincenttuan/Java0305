package com.study5;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int ans = 63;
        int min = 0;
        int max = 100;
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("請猜一個數字 %d ~ %d :\n", min, max);
            int guess = sc.nextInt();
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
