package com.study2;

public class Stock {
    public static void main(String[] args) {
        // 股票名稱
        String stockName = "台積電";
        // 股票價格(股)
        double stockPrice = 307.5;
        // 買進股數
        int amount = 3000;
        // 買進成本
        double cost = stockPrice * amount;
        // 將資料印出
        System.out.printf("股票名稱: %s 買進成本: %,.1f", stockName, cost);
        
        
    }
}
