package com.mohsin.java.concept;

public class InfinteArraySize {
    public static void main(String[] args) {
        //Restriction is Size of the Array
        int[]  arr={1,2,4,7,9,13,15,18,20,23,28,32,90,95};
        int target=15;
        System.out.println(answer(arr,target));

    }
    static int answer(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while(target>=arr[end])
        {
            int newStart=end+1;//keep the preivious start
            end=end+(end-start+1)*2;//next end
            start=newStart;//for calculating the new block size
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target, int start,int end)
    {
        while(start<=end)
        {

            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
