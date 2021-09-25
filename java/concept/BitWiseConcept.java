package com.mohsin.java.concept;

import java.util.Scanner;

public class BitWiseConcept {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        evenAndOdd(n);
        int[] arr={2,3,4,1,2,1,3,6,4};
        System.out.println("Unique allet int this array is "+uniqueElement(arr));
    }

    private static int uniqueElement(int[] arr) {
        int uniqueElement=0;
        for(int i:arr)
        {
            uniqueElement ^=i;
        }
        return uniqueElement;
    }

    private static void evenAndOdd(int n) {
        //by bitwise operator
        if((n&1)==1)
        {
            System.out.println("Odd Number");
        }
        else
        {
            System.out.println("Even Number");
        }
    }
}
