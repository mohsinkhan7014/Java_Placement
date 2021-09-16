package com.mohsin.assignment;

public class SumOfNaturalRecursion {
    public static void main(String[] args) {
        System.out.println(sumNatural(4));
    }

    private static int sumNatural(int n) {
        if(n==1)
        {
            return 1;
        }
        return n+sumNatural(n-1);
    }
}
