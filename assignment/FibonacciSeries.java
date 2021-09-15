package com.mohsin.assignment;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    private static int fib(int i) {
        //base case
        if(i<2)
        {
            return i;
        }
        int f1=fib(i-1);
        int f2=fib(i-2);
        System.out.println(f1+" "+f2);

        return f1+f2;
    }

}
