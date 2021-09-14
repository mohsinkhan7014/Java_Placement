package com.mohsin.java.concept;

public class BitonicArray {
    public static void main(String[] args) {
        System.out.println(maximumElement(new int[]{1,2,3,5,16,6,4,3,2}));
        System.out.println(ans(new int[]{1,2,3,5,16,6,4,3,2}));
    }
   static int ans(int[] arr)
    {
        int start=0;
        int end=1;
        int ans=-1;
        while(ans==-1)
        {
            if(arr[end]<arr[end-1] && arr[start]<arr[end])
            {
                ans=arr[end-1];
            }
            else if(arr[end+1]>arr[end] && arr[start]<arr[end])
            {
                int newStart=end+1;
                end+=(end-start+1)*2;
                start=newStart;
            }
            else{
                int newStart=end+1;
                end+=(end-start+1)*2;
                start=newStart;
            }
        }
        return ans;
    }



    static int maximumElement(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
            {
                e=mid;
            }
            if(arr[mid]<arr[mid+1])
            {
                s=mid+1;
            }
        }
        return arr[s];
    }
}
