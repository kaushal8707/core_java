package com.home.java.com.java.home.basic.programming;

public class MaxOfTwoFromArray
{
    public static void main(String[] args) {
        int array[]={1,8,3,4,5,6,2};
        int m1=array[0],m2=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>m1)
            {
                m2=m1;
                m1=array[i];

            }else if(array[i]>m2)
            {
                m2=array[i];
            }
        }
        System.out.println("Max 1="+m1);
        System.out.println("Max 2="+m2);

    }
}
