package com.study5;

public class NineTable2 {
    public static void main(String[] args) {
        
        for (int x = 1;x <= 9;x++) { 
            for (int y = 1;y <= 9;y++) {
                int z = x * y;
                System.out.printf("%d * %d = %d\t", x, y, z);
            }
            System.out.println();
        }
    }
}
