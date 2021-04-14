package com.home.java.com.java.home.basic.programming;

public class Prime_Series_10 {
    public static void main(String[] args) {
        series();
    }

    public static void series() {
        for (int i = 2; i <= 100; i++) {
            boolean check = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.print(i + "  ");
            }
        }
    }
}