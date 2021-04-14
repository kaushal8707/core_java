package com.home.java.com.java.home.basic.programming;

public class SelectionSort
{
    public static void main(String[] args) {
        int arr[]={9,1,7,2,4,6,5,3,11};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<(arr.length);j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int k : arr)
        {
            System.out.print(k+"  ");
        }
    }
}
