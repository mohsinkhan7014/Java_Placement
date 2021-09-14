package com.mohsin.java.concept;

import java.util.Arrays;

import static com.mohsin.java.concept.FunctionDemo.swap;


public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,2,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maximumElement(new int[]{0,1,2,31,2,38,54,2,-1},2));

    }
    static void bubbleSort(int[] arr)
    {
       // boolean swaped=true;
        for (int i = 0; i < arr.length ; i++) {  ///pass how many pass

            for(int j=1;j<arr.length-i;j++)//last onw is already sorted
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                   // swaped=false;
                }
            }
          /*  if(swaped)
            {
                break;  //best case if array is already sorted but we have to do n comparision atleast
            }*/

        }
    }

    static int maximumElement(int[] arr,int nthMax)
    {
        for(int pass=0;pass<nthMax;pass++) {
            for (int i = 1; i < arr.length-pass; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        return arr[arr.length-nthMax];
    }

}
