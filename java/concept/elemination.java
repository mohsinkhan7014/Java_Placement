package com.mohsin.java.concept;

import java.util.Arrays;
import java.util.Scanner;

public class elemination {
    public static void main(String[] args) {
        int n;
        int[] arr=new int[5];
        n=5;
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=input.nextInt();
        }

       // System.out.println(Arrays.toString(elemination(arr,5)));
        while (n>1) {
            n = elemination(arr, n).length;
            System.out.println(n);
        }
    }
    static int[] elemination(int[] arr,int n)
    {
        int i=0;
        while(n>1 && i<n && i!=n)
        {
            for(int j=i;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            i++;
            n--;
        }
        if(i==n)
        {
            n--;
        }

        //just becasue of lack of refernce varibale i have to take extra space of Temp
        int[]temp=new int[n];
        for (int j = 0; j <n ; j++) {
            temp[j]=arr[j];
        }
        return temp;
    }
}
