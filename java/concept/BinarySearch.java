package com.mohsin.java.concept;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,35,64,75,100};
        int key=new Scanner(System.in).nextInt();
        System.out.println(search(arr,key));
    }

    private static int search(int[] arr,int key) {
        int s=0,e=arr.length-1;
        while(s<e)
        {
            //(s+e)/2 it may lead out of range of integer {-2^31,2^31-1}
            int mid=s-(s-e)/2;
            if(arr[mid]>key)
            {
                e=mid-1;
            }
            else if(arr[mid]<key)
            {
                s=mid+1;
            }
            else
            {
                return mid;
            }

        }

        return -1;
    }
}
