package com.mohsin.java.concept;

import java.util.Scanner;

public class Control_Statement {
    public static void main(String[] args) {
        //fib 0       1    1    2     3      5     8    7       13.....
        //position   0th   1st 2nd  3rd   4th    5th    6th     7th
        //int a=0,b=1;
        Scanner input=new Scanner(System.in);

        //Q 1: print Fibo Series and Nth Term in Fibo Series;

       /* System.out.print("Enter Number to Show nth Fibonacci Number : ");
        int n=input.nextInt();
        int count=2;//fib series stated with 0 and 1  ot let say first two term
        System.out.print("0 , 1 ,");
        while(count<=n)
        {
            int temp=b;
            b=a+b;
            System.out.print(b+", ");
            a=temp;
            count++;
        }*/
        //System.out.println(b);


        //Q : 2 Count the Number of Digit in Given Nth Number

       /* long  n=input.nextLong();
        int count=0;
        while (n>0)
        {
            long rem;
            rem=  (n%10);
            if(rem==7)
            {
                count++;
            }
            n/=10;
        }
        System.out.println("No of 7 available in Given Number is  "+count);
*/


        //Q 3 Reverse the Number
        int n=input.nextInt();

        int rev=0;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);






    }
}
