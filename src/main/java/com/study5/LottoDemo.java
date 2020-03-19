package com.study5;

import java.util.Random;

public class LottoDemo {
    public static void main(String[] args) throws Exception {
        int count = 4;
        while (count > 0) {            
            int x = new Random().nextInt(10); // 0~9
            Thread.sleep(2000); // 暫停2秒
            System.out.print(x);
            count--;
        }
    }
}
