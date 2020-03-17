package com.study4;

import java.util.Scanner;

public class InputSexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身分證字號: ");
        String id = sc.next();
        char sex = id.charAt(1);
        if(sex == '1') {
            System.out.println("男生");
        } else if(sex == '2') {
            System.out.println("女生");
        } else {
            System.out.println("錯誤");
        }
    }
}
