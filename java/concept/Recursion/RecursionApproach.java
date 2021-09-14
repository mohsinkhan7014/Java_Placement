package com.mohsin.java.concept.Recursion;

public class RecursionApproach {
    public static void main(String[] args) {
        // print 1 to 5 number by recursion
         //  print(1);
        //print first 10 odd number by recursion
       // printOdd(1);
        //print first 10 even number by recursion
       printEven1(1);
    }

    private static void printEven1(int n) {
        //base condition
        if(n==5)
        {
            System.out.println(2*n);
            return;
        }
        System.out.println(2*n);
        printEven1(n+1);

    }

    private static void printOdd(int n) {
        //base condition for first 10th even number
        if(n==10)
        {
            System.out.println(2*n-1);
            return ;
        }
        System.out.println(2*n-1);
        //n+1 linear recurrence relation
        printOdd(n+1);
    }

    static void print(int n)
    {
        //base condition
        if(n==10)
        {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n+1);
    }
}
