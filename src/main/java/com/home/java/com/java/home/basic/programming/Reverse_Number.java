package com.home.java.com.java.home.basic.programming;

public class Reverse_Number
{
    public static void main(String[] args) {
        int number=567896;
        int rem=0,rev=0;
        while(number!=0)
        {
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("Reverse Number="+rev);
    }
}
