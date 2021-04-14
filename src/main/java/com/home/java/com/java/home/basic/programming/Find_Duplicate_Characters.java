package com.home.java.com.java.home.basic.programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Find_Duplicate_Characters
{
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        char chArray[]=input.toCharArray();
        Set<Character> set=new TreeSet<Character>();
        for(int i=0;i<chArray.length;i++)
        {
            boolean check=false;
            for(int j=i+1;j<chArray.length;j++)
            {
                if(chArray[i]==chArray[j])
                {
                    check=true;
                    set.add(chArray[i]);
                }
            }

        }
        for(Character ch:set)
        {
            System.out.print(ch+"   ");
        }
    }
}
