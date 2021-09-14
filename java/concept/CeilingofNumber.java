package com.mohsin.java.concept;

public class CeilingofNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        try{
            findCeilingValue(arr,target);//no such value exist that is grater and equal to target
            System.out.println("Ceiling value of "+target+" is at index "+arr[findCeilingValue(arr,target)]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Such Ceiling Value Does Not Exist for "+target);
        }
//        System.out.println("Ceiling value of "+target+" is at index"+arr[findCeilingValue(arr,target)]);
        try {
            findFloorValue(arr,target);//if no such value that means biggest number that is less than or equal to target
            System.out.println("Floor value of "+target+" is exist at index in array "+arr[findFloorValue(arr,target)]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Such Flooring Value does not exist in this array for target "+target);
        }


    }

    private static int findFloorValue(int[] arr, int target) {
        //find the biggest value that is smaller than or = target(Floor Definition)
        int start=0;
        int end=arr.length-1;


        while(start<=end)
        {
            int mid=start-(start-end)/2;
            if(arr[mid]==target)
            {
                return mid;
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
        return end>arr.length-1?-1:end;

    }

    private static int findCeilingValue(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
      //celing :find the smallest number that is grater  than or = target
        while(start<=end)
        {
             int mid=start-(start-end)/2;
            if(arr[mid]==target)
            {
                return mid;
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
        return start>arr.length-1?-1:start;
    }
}
