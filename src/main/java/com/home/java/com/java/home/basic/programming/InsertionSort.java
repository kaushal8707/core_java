package com.home.java.com.java.home.basic.programming;

public class InsertionSort
{
    public static void main(String[] args) {
        int arr[]={9,1,7,2,6,5,3,11};
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int m : arr)
        {
            System.out.print(m+"  ");
        }

    }
}
