package com.mohsin.assignment;

public class FirstUpperCaseRec
{
    public static void main(String[] args) {
        String name="       mohsin   Khan";

        System.out.println(withoutRecursion(name));
       findFirstUpper(name,0,name.length());

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

    private static char findFirstUpper(String name, int i,int length) {
        if(name.charAt(0)>64 && name.charAt(0)<91)
        {
            return name.charAt(0);
        }
        findFirstUpper(name,i+1,name.length());
        return '\0';
    }
}
