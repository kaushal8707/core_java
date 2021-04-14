package com.home.java.com.java.home.basic.programming;

class PermutationLogic
{
    public static void main(String[] args)
    {
        String str="1234";
        String ans="";
        permutation(str,ans);
    }
    public static void permutation(String str,String result)
    {
      if(str.length()==0)
      {
          System.out.println(result+"");
      }
      for(int i=0;i<str.length();i++)
      {
          char ch=str.charAt(i);
          String ros=str.substring(0,i)+str.substring(i+1);
          permutation(ros,ch+result);
      }
    }
}
