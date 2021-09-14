package com.mohsin.java.concept;

import java.util.Scanner;

public class orderAgnosticBinary {
    //order Agnostic Binary Search will be applied when we don't know whether given array is sorted in ascending order
    //or descending order (Beauty of The Questions)
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,35,64,75,100};
        int key=75;
        System.out.println(orderAgnoBsearch(arr,key));
    }
    private static int orderAgnoBsearch(int[] arr,int key) {
        int s=0,e=arr.length-1;
        boolean asc=s<e;
        while(s<e)
        {
            //(s+e)/2 it may lead out of range of integer {-2^31,2^31-1}
            int mid=s-(s-e)/2;
            if(arr[mid]==key)
            {
                return mid;
            }

            if(asc)
            {
                if(arr[mid]>key)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else
            {
                if(arr[mid]<key)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }

            }



        }

        return -1;
    }
}

