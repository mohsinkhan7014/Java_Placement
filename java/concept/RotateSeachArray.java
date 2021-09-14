package com.mohsin.java.concept;

public class RotateSeachArray {
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,6,7,0,1,2};
        int target=4;

        System.out.println(search(arr,target));


    }

    private static int search(int[] arr,int target) {
        int pivotIndex=searchPivot(arr);

        //when array is not rotated
        if(pivotIndex==-1)
        {
            //because it is all ascending order //given array is not rotated Array
//            System.out.println(BinarySearch(arr,0,arr.length-1,target));
           return BinarySearch(arr,0,arr.length-1,target);
        }

        //i am searching element that is also a pivot .
        if(arr[pivotIndex]==target)
        {
            return pivotIndex;
        }
        if(target>=arr[0])   //{2(s),3,4,5,16(p),0,6,3   target=4
        {
           return BinarySearch(arr,0,pivotIndex-1,target);
        }
        else//if(target<arr[pivotIndex])//{2(s),3,4,5,16(p),0,6,3  target=0;   //if target is greter than pived is not possible
        {
            return BinarySearch(arr,pivotIndex+1,arr.length-1,target);
        }

    }

    private static int BinarySearch(int[] arr, int start,int end,int target) {

        while (start<=end)
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
                else {
                    start=mid+1;
                }
            }



        return -1;
    }

    static int searchPivot(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(mid < e && arr[mid+1] <= arr[mid])   //3,4,5,10,25(m),2,2
            {
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1])//1,2,3,14,15,4(m),3,2,1  .... // chance array may got arr[-1]  if arr{3}
            {
                return mid-1;
            }
            if(arr[s]>=arr[mid])// 3,4,5,6,0(m),1,2
            {
                e=mid-1;
            }
            else     // if(mid<e &&  arr[mid]>arr[s])   //3,4,5(m),6,2,1
            {
                s=mid+1;  //s=mid is not possible this case is already caught by 1 stcade
            }
        }
        return -1;
    }

}
