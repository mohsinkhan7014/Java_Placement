package com.mohsin.java.concept;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={1,2,32,-12,29};
        System.out.println(Arrays.toString(arr));
        selection(arr);

    }

    private static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int lastIndex=arr.length-1-i;//for every pass one element is sorted so index will be decrease by 1
            int maxIndex=getMaxIndexOfElement(arr,0,lastIndex);//we are setting the position of (i+1)th element in the array
            swap(arr,maxIndex,lastIndex);
           // System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    private static int getMaxIndexOfElement(int[] arr, int startIndex, int lastIndex) {
        int maxIndex=0;
        for(int i = startIndex+1;i<=lastIndex;i++)
        {
            if(arr[i]>arr[maxIndex])
            {
                maxIndex=i;
            }
        }
        return maxIndex;

    }
}
