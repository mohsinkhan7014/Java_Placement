package com.mohsin.java.concept;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //numer array are mutable
        int [] rollno={1,2,3,4};
        System.out.println(Arrays.toString(rollno));
        System.out.println(checkMutability(rollno));
        System.out.println(Arrays.toString(rollno));

        //lets check smae for String
        String[] name={"Mohsin ","Khan"};
        System.out.println(Arrays.toString(name));
        chanedName(name);
        System.out.println(Arrays.toString(name));
    }

    private static void chanedName(String[] naam) {
        naam[0]="Bhawna";

    }

    private static String checkMutability(int[] arr)
    {
        arr[0]=100;//main arrya also will change means it is mutable
        return "Mutable Becasue Main Array Is Also Changed";
    }
}
