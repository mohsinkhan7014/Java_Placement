package com.mohsin.assignment;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(1212));
        System.out.println(sum1(10));
    }

    private static int sum(int n) {
        //base case
        if(n==0)
        {
            return 0;
        }
        int rem=n%10;
        int preRem=sum(n/10);
        return rem+preRem;
       // return n%10+sum(n/10);

    }

    private static int sum1(int n) {
        //base case
        if(n<10)
        {
            return n%10;// this condition will take care of what i am returning from here.
        }
    /*    int rem=n%10;
        int preRem=sum(n/10);
        return rem+preRem;*/
        // return n%10+sum(n/10);
        return n%10+sum1(n/10);

    }
}
