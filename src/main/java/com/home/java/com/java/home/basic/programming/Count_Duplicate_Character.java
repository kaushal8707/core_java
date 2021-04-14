package com.home.java.com.java.home.basic.programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Count_Duplicate_Character
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        char chArray[]=input.toCharArray();
        for(int i=0;i<input.length();i++)
        {
            Map<Character,Integer> map=new HashMap<Character,Integer>();
            boolean check=false;
            int count=0;
            for(int j=i+1;j<chArray.length;j++)
            {
                if(chArray[i]==chArray[j])
                {
                    check=true;
                    //break;
                    ++count;
                }
            }
            if(check)
            {
                map.put(chArray[i],count);
                input=input.replaceAll(String.valueOf(chArray[i]),"");
                Set set=map.entrySet();
                Iterator itr=set.iterator();
                while(itr.hasNext())
                {
                    System.out.println(itr.next());
                }
            }

        }



    }
}
