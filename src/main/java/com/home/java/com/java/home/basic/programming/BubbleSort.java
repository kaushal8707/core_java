package com.home.java.com.java.home.basic.programming;
public class BubbleSort
{
    public static void main(String[] args) {
        int arr[]={9,1,7,2,4,6,5,3,11};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<(arr.length-i-1);j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k : arr)
        {
            System.out.print(k+"  ");
        }
    }
}
