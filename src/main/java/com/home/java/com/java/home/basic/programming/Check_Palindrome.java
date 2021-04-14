package com.home.java.com.java.home.basic.programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check_Palindrome
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean status=false;
        String str=br.readLine();
        String original_string=str;
        char ch_Array[]=str.toCharArray();
        for(int i=0,j=ch_Array.length-1;i<ch_Array.length/2;i++,j--)
        {
            char temp=ch_Array[i];
            ch_Array[i]=ch_Array[j];
            ch_Array[j]=temp;
        }
        if(String.valueOf(ch_Array).equals(original_string)) {
            System.out.println(str+"  is palindrome  ");
        }else if(str.length()==1) {
            System.out.println(str+"  is palindrome  ");
        }else {
            System.out.println(str+"  is not a palindrome  ");
        }
    }
}
