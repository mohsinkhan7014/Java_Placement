package com.mohsin.assignment;

public class FirstUpperCaseRec
{
    public static void main(String[] args) {
        String name="mohsiM   KasjHhan";

        System.out.println(withoutRecursion(name));
        System.out.println("With Recursion "+ findFirstUpper(name,0) );

    }

    private static char withoutRecursion(String name) {

        for(int i=0;i<name.length();i++)
        {

            if(name.charAt(i)>64 && name.charAt(i)<91)
            {
                return name.charAt(i);
            }
        }
        return '0';

    }

    private static char findFirstUpper(String name, int i) {
        //base case
        if(i>=name.length())
        {
            return '0';
        }
        if(name.charAt(i) > 64 && name.charAt(i) < 91)
        {
            return name.charAt(i);
        }
        return findFirstUpper(name,i+1);

    }
}
