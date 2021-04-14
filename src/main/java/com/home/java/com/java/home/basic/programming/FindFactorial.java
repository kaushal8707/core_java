package com.home.java.com.java.home.basic.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFactorial
{
    public static void main(String[] args) throws IOException {
        int fact=1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number to find Factorial...");
        int number=Integer.parseInt(br.readLine());
        while(number!=0)
        {
            fact=fact*number;
            number--;
        }
        System.out.println("Factorial="+fact);

    }
}
