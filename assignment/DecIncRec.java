package com.mohsin.assignment;

public class DecIncRec {
    public static void main(String[] args) {
        increase(1);
        decrease(10);

    }

    private static void increase(int i) {
        //base case
        if(i==6)
        {
            return;
        }
        //i+1 is a recurrence relation
        System.out.println(i);
        increase(i+1);

    }

    private static void decrease(int n) {
        //base case
        if(n==5)
        {
            return;
        }

        decrease(n-1);
        System.out.println(n);
    }

}
