package com.mohsin.java.concept;

import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int[] ar={5,7,7,8,8,10};
        System.out.println(Arrays.toString(findposition(ar,8)));
    }

   static int[] findposition(int[] arr,int target)
    {
        int[] index=new int[2];
        index[0]=bSearch(arr,target,true);
        index[1]=bSearch(arr,target,false);




        return index;
    }

    private static int bSearch(int[] arr, int target, boolean firstOccurance) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(firstOccurance)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            if(target>arr[mid])
            {
                start=mid+1;
            }
            if(target<arr[mid])
            {
                end=mid-1;
            }
        }
        return ans;
    }

}
