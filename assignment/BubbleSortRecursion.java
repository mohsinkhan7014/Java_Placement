package com.mohsin.assignment;

import java.util.Arrays;



public class BubbleSortRecursion {
    public static void main(String[] args) {
        int arr[]={-24,3,21,3,46,2,1,1,3545,33};
        sort(arr,1,5);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int i, int len) {

        if(len==1)
        {
            return;
        }
        if(arr[i]>arr[i+1])
        return;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
