package com.home.java.com.java.home.basic.programming;


    class FindMissing
    {
        public static void main(String[] args)
        {
            int arr[]={1,2,3,4,5,6,7,8,10};
            int allNum=arr.length+1;
            int result= getMissingNum(arr,allNum);
            System.out.println(result);
        }
        static int getMissingNum(int arr[],int n)
        {
            int total_1_5=(n)*(n+1)/2;
            System.out.println(total_1_5+"---");
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
            }
            return (total_1_5-sum);

        }
    }

