package com.study5;

import java.util.Random;

public class IDCheck2 {
    public static void main(String[] args) {
        Random r = new Random();
        // 找出桃園一組合法身分證字號
        int[] nums = {1, 7, r.nextInt(2)+1, r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10)};
        int[] mult = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        int sum = 0;
        for(int i=0;i<11;i++) {
            int sub = nums[i] * mult[i];
            sum += sub;
        }
        // 顯示身份證字號
        System.out.print("H");
        for(int i=2;i<11;i++) {
            System.out.print(nums[i]);
        }
        System.out.println(sum % 10 == 0 ? "合法" : "不合法");
    }
}
