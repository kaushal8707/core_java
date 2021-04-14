package com.home.java.com.java.home.basic.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeCheck_Recursion
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter string");
        String str=reader.readLine();
        boolean check=PalindromeCheck_Recursion.checkPalindrome(str);
        if(check)
        {
            System.out.println(str+"   is Palindrome");
        }else
        {
            System.out.println(str+"    is not Palindrome");
        }
    }
    public static boolean checkPalindrome(String s)
    {
        // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0)==s.charAt(s.length()-1))
        return checkPalindrome(s.substring(1,s.length()-1));

        return false;
    }

}
