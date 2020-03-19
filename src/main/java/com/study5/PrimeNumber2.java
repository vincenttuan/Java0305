package com.study5;

public class PrimeNumber2 {
    public static void main(String[] args) {
        for(int n=2;n<=100;n++) {
            System.out.printf("%d 是質數? %b\n", n, isPrimeNumber(n));
        }
    }
    
    public static boolean isPrimeNumber(int n) {
        boolean check = true; // 是否是質數?
        for(int i=2;i<=n/2;i++) {
            if(n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
