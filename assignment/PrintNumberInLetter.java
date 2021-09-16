package com.mohsin.assignment;

import java.util.Scanner;

public class PrintNumberInLetter {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        print(n);//output should be (one one zero) 110
        System.out.println();


        //after

        print1(n);//output should like :-> zero one one negative  if i am passing n=-110
        if(n<0)
        {
            System.out.print("Negative");
        }

    }

    private static void print1(int n) {
        if(n<0)
        {
            n*=-1;
        }
        if(n<10 && n>=0)
        {
            numberToString(n%10);
            return;
        }


        int rem=n%10;
        numberToString(rem);
        print1(n/10);

    }

    private static void print(int n) {
        if(n<10&&n>=0)
        {
            numberToString(n%10);
            return ;
        }
        if(n<0){
            System.out.print("Negative ");
            n*=-1;
        }
        int preRem=n%10;
        print(n/10);
        numberToString(preRem);
        return ;

    }

    private static void numberToString(int preRem) {
        switch (preRem) {
            case 0 -> System.out.print("Zero ");
            case 1 -> System.out.print("One ");
            case 2 -> System.out.print("Two ");
            case 3 -> System.out.print("Three ");
            case 4 -> System.out.print("Four ");
            case 5 -> System.out.print("Five ");
            case 6 -> System.out.print("Six ");
            case 7 -> System.out.print("Seven ");
            case 8 -> System.out.print("Eight ");
            case 9 -> System.out.print("Nine ");

        }
    }
}
