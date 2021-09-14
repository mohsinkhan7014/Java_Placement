package com.mohsin.leetCode;

import java.util.Arrays;

public class DeletionOFElement {
    public static void main(String[] args) {

        int[] arr={2,3,4,5,21,2,45,22};
        System.out.println(arr.length);
        deletion(arr,2);

    }
    static  void deletion(int[] arr,int a)
    {
        int count=0;
        for(int i=0;i<arr.length-count;i++)
        {
            if(a==arr[i])
            {
                count++;
                for(int j=i+1;j<arr.length;j++)
                {
                    arr[j-1]=arr[j];
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
