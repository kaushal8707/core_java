package com.home.java.com.java.home.basic.programming;

public class MergeSort {
    static int array[];
    static int tempMerge[];

    public static void main(String[] args) {
        int arr[] = {9, 3, 8, 2, 7, 1, 5, 4, 6,15, 11};
        array = arr;
        tempMerge = new int[arr.length];
        int min = 0;
        int max = arr.length - 1;
        new MergeSort().merg_Sort(min, max);
        for(int digit : arr)
        {
            System.out.print(digit+"  ");
        }
    }
    public void merg_Sort(int min, int max) {
        if (min < max)
        {
            int mid = (min+max)/2;//min + (max - min) / 2;
            merg_Sort(min, mid);
            merg_Sort(mid + 1, max);
            doMerge(min, mid, max);
            System.out.println(min+"----"+mid+"----"+max);
        }
    }

    public void doMerge(int min, int mid, int max) {
        for (int i = min; i <= max; i++) {
            tempMerge[i] = array[i];
        }
        int i = min;
        int j = mid + 1;
        int k = min;
        while (i <= mid && j <= max) {
            if (tempMerge[i] < tempMerge[j]) {
                array[k] = tempMerge[i];
                i++;
            } else {
                array[k] = tempMerge[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            array[k] = tempMerge[i];
            i++;
            k++;
        }
    }
}