package com.study2;

public class Stock2 {
    public static void main(String[] args) {
        System.out.println(0b10111);
        char c = 'A'; // ASCII = 65
        int code = '段';
        char c2 = 27573;
        System.out.println(code);
        System.out.println(c2);
        //------------------------------
        int i = '我';
        int love = '愛';
        int you = '你';
        System.out.println(i + love + you);
        //------------------------------
        System.out.println(0xab);
        //------------------------------
        double x = 42000000; // 4.2E7
        System.out.println(x);
        //------------------------------
        System.out.println("\u1F601");
        //------------------------------
        // 轉型
        byte b = (byte)257;
        System.out.println("b:\t" + b);
        byte b2 = (byte)150;
        System.out.println("b2:\t" + b2);
    }
}
