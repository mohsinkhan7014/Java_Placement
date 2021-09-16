package com.mohsin.leetCode;

import java.beans.PropertyEditorManager;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={0,0,1};
        System.out.println(removeDuplicates(arr));
    }
    static public int removeDuplicates(int[] nums) {

        int k=correctLength(nums);
        return k;

    }

   static int correctLength(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int k=i;
            if(arr[k+1]==arr[k]){


                if(arr[k]==arr[k+1])
                {
                    for(int j=k;k<arr.length-1;k++){
                        arr[j]=arr[j+1];
                    }
                    arr[arr.length-1]=(int)'_';
                    count++;
                    i--;
                }

            }
        }
        return arr.length-count;
    }
}
