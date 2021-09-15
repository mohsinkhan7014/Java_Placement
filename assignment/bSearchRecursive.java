package com.mohsin.assignment;

public class bSearchRecursive {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,12,45,98};
        System.out.println(search(arr,0,arr.length-1,5));
    }

    private static int search(int[] arr, int s, int e,int target) {
        int mid=s+(e-s)/2;
        //base case
        if(arr[mid]==target)
        {
            return mid;
        }
        if(target>arr[mid])
        {
            return search(arr,mid+1,e,target);
        }
        if(target<arr[mid])
        {
            return search(arr, s, mid - 1, target);
        }
        return -1;
    }
}
