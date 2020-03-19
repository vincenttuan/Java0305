package com.study5;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 11;
        boolean check = true; // 是否是質數?
        for(int i=2;i<=n/2;i++) {
            if(n % i == 0) {
                check = false;
                break;
            }
        }
        System.out.printf("%d 是質數? %b\n", n, check);
    }
}
