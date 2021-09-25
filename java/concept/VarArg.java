package com.mohsin.java.concept;

import java.util.Arrays;

public class VarArg
{
    public static void main(String[] args) {
        //varible lenght argument
        fun(1,2,3,4,5,2);
        multiArg(90,85,85,"Mohsin","Khan","From Makrana ","Nagour");


    }
    private static void multiArg(int i, int i1, int i2, String ...m) {
        System.out.println(((i+i1+i2)/3)*100+" ");
        System.out.print(Arrays.toString(m));
    }
    private static void fun(int ...c)
    {
        System.out.println(Arrays.toString(c));
    }
}
