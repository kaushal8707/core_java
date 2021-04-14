package com.home.java.com.java.home.basic.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrimeOrNot
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter any Number to check either its a prime or non-prime");
        int num=Integer.parseInt(bufferedReader.readLine());
        boolean result=checkPrime(num);
        if(!result)
        {
            System.out.println("P r i m e");
        }else
        {
            System.out.println("N o n - P r i m e");

        }

    }
    public static boolean checkPrime(int number)
    {
        boolean status=false;
        for(int i=2;i<number/2;i++) {
            if (number % i == 0) {
                status = true;
                break;
            }
        }
       return status;
    }
}
