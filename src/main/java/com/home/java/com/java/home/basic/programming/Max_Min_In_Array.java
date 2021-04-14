package com.home.java.com.java.home.basic.programming;

public class Max_Min_In_Array
{
    static int max,min;
    public static void main(String args[])
    {
       int arr[]={7,1,6,2,6,3,5,4,9,10};

       find_Min_Max(arr);
       System.out.println("Max= "+max+"     "+"Min= "+min);
    }
    static int find_Min_Max(int series[])
    {
        max=series[0];
        min=series[0];
        for(int i=0;i<=series.length-1;i++)
        {
            if(series[i]>max)
            {
                max=series[i];
            }if(series[i]<min)
            {
                min=series[i];
             }
        }
        return 0;
    }
}
