package com.study5;

public class IDCheck {
    public static void main(String[] args) {
        // M140051653 (M -> 21)
        // H123556677 (H -> 17)
        int[] nums = {2, 1, 1, 4, 0, 0, 5, 1, 6, 5, 3};
        int[] mult = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        int sum = 0;
        for(int i=0;i<11;i++) {
            int sub = nums[i] * mult[i];
            sum += sub;
        }
        System.out.println(sum % 10 == 0 ? "合法" : "不合法");
    }
}
