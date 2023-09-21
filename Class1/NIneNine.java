package com.company;

public class NIneNine {
    public static void main(String[] args) {
        for (int i = 1; i < 18; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("" + k + "x" + i + "=" + i * k );
            }
        }
        System.out.println();
    }
}
