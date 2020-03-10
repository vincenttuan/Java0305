package com.study2;
/********************************************
* 股票成本計算程式                            *
* 作者 : Vincent                            *
* 版本 : 1.0                                *
* 日期 : 2020/03/10                         *
********************************************/
import java.util.Scanner;
public class Stock {
    /** 這是程式進入點 */
    public static void main(String[] args) {
        // 股票名稱
        String stockName = "台積電";
        // 股票價格(股)
        double stockPrice = 307.5;
        // 買進股數(由使用者來輸入)
        System.out.println("請輸入買進股數(例如:1000) = ");
        Scanner sc = new Scanner(System.in); // System.in 預設是鍵盤
        int amount = sc.nextInt(); // 取出鍵盤key in的資料並轉成 int
        // 買進成本
        double cost = stockPrice * amount;
        // 將資料印出
        System.out.printf("股票名稱: %s 買進成本: %,.1f\n", stockName, cost);
        System.out.printf("股票名稱: %s 買進成本: %,.1f\n", stockName, cost);
    }
}
