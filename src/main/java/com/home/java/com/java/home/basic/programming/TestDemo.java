package com.home.java.com.java.home.basic.programming;

public class TestDemo
{
    public static void main(String[] args)
    {
      int arr[]={1,2,3,4,5,6,7,8,9,10};
      int f=0,l=arr.length-1,key=3;
      while(f<=l)
      {
          int m=(f+l)/2;
          if(key>arr[m])
          {
              f=m+1;
          }else if(key==arr[m])
          {
              System.out.println("Key Found at : "+(m+1));
              break;
          }else
          {
              l=m-1;
          }
      }
    }
}
