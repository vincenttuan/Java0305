package com.study5;

public class NineTable {
    public static void main(String[] args) {
        
        int x = 1;
        while (x <= 9) {            
            int y = 1;
            while (y <= 9) {
                int z = x * y;
                System.out.printf("%d * %d = %d\t", x, y, z);
                y++;
            }
            System.out.println();
            x++;
        }
        
        
        
    }
}
