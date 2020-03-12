package com.study3;

public class 位元運算停車證問題 {
    public static void main(String[] args) {
        // 列出8個學期停車證申請狀況 (預設 1, 5, 6 已申請)?
        int parking = 0b00110001;
        // 查看哪一個學期還有停車證可以申請?
        int n = 4;
        // 若得到 0 則表示該學期尚無人申請
        System.out.println(parking & (int)Math.pow(2, n-1));
        // 申請第 n 學期停車證
        parking = parking | (int)Math.pow(2, n-1);
        // 重新查驗第 n 學期是否已申請停車證
        System.out.println(parking & (int)Math.pow(2, n-1));
        // 取消第 n 學期的停車證
        parking = parking & ~(int)Math.pow(2, n-1);
        // 重新查驗第 n 學期是否已取消申請停車證
        System.out.println(parking & (int)Math.pow(2, n-1));
    }
}
