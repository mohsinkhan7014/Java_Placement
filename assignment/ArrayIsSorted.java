package com.mohsin.assignment;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(isArraySorted(arr,0,arr.length));
    }

    private static boolean isArraySorted(int[] arr, int i,int length) {
      //base case
        if(length==0 || length==1)
        {
            return true;
        }
        if(arr[i]<arr[i+1]  &&     isArraySorted(arr,i+1,length-1))
        {
            return true;
        }
       return false;


    }
}
