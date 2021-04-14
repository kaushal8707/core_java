package com.home.java.com.java.home.basic.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_String
{
    public static void main(String[] args) throws IOException {
    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char ch_Array[]=str.toCharArray();
        for(int i=0,j=ch_Array.length-1;i<ch_Array.length/2;i++,j--)
        {
            char temp=ch_Array[i];
            ch_Array[i]=ch_Array[j];
            ch_Array[j]=temp;
        }
        String reverse_string=String.valueOf(ch_Array);
        System.out.println("Revered String= "+reverse_string);
    }
}
