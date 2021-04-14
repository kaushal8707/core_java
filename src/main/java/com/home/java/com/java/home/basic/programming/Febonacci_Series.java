package com.home.java.com.java.home.basic.programming;

public class Febonacci_Series
{
    public static void main(String[] args) {
    int a=0,count=0;
    int b=1;
    System.out.print(" "+a+" "+b);
    while(count<8)
    {
        count++;
        int c=a+b;
        a=b;
        b=c;
        System.out.print(" "+c);
    }
    }
}
