package com.mohsin.assignment;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int a,b;
        Scanner st=new Scanner(System.in);
        a=st.nextInt();
        b=st.nextInt();

        System.out.println(findHCFWithoutRecursion(a,b));

        System.out.println("By GCD Mehtod");

        System.out.println(gcd(a,b));






    }

    private static int gcd(int a, int b) {
       /* if(b==0)return a;
        if(a==0)return b;
        if(a==b)return a;
        if(a>b)return gcd(a-b,b);
        return gcd(a,b-a);*/


        //third way to find gcd
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int findHCFWithoutRecursion(int a, int b) {
        int min=a<b?a:b;
        if(a%min==0 && b%min==0)
        {
            return min;
        }
        int i=min/2;//beacuse min value ka half hi hoga jissye divide kr skta hu effectivily
        while(i>=2)
        {
            if(a%i==0 && b%i==0)
            {
                return i;
            }
            i--;
        }
        return 1;
    }
}
