package com.mohsin.assignment;

import java.util.Arrays;

public class RecursionAss {
    public static void main(String[] args) {
        int [] arr={1,35,-32,4,-1};
       // sumTriangle(arr,5);
        // minElement(arr,5);

        //another approch is also there
        System.out.println("Maximum element in Array "+getMax(arr,5));
        System.out.println("Maximum element in Array "+getMin(arr,5));
    }

    private static int getMin(int[] arr, int size) {
        if(size==1)
        {
            return arr[0];
        }
        int tempMin=getMin(arr,size-1);
        return Math.min(tempMin,arr[size-1]);

    }

    private static int getMax(int[] arr,int size) {
        //base case
        if(size==1)
        {
            return arr[0];
        }
        int tempMax=getMax(arr, size-1);
       return Math.max(tempMax,arr[size-1]);
    }

    private static void minElement(int[] arr, int size) {
        //base condition
        if(size==1)
        {
            System.out.println(arr[0]);
            return;
        }
        int[] minArray=new int[size];
        for(int i=0;i<size-1;i++)
        {
            //minArray[i]=max(arr[i],arr[i+1]);
            minArray[i]=min(arr[i],arr[i+1]);


        }
        minElement(minArray,size-1);

    }

    private static int min(int a,int b) {
        if(a>b)
        {
            return b;
        }
        return a;
    }

    private static int max(int a,int b) {
        if(a<b)
        {
            return b;
        }
        return a;
    }
    static void sumTriangle(int[] arr,int size)
    {
        //base condition
        if(size==1)
        {
            System.out.println(arr[0]);
            return;
        }
       // int[] a=arr;//means point to the same reference in heap memory so we have to hold the old result for a while return the
        int[]  temp= new int[size-1] ;
        for(int i=0;i<size-1;i++)
        {
            temp[i]=arr[i]+arr[i+1];
        }
        //now temp is holding latest array value which is sum of two element
        //pass the array with  1 less size
        sumTriangle(temp,size-1);
        //print the array that was hold during each call
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

}
