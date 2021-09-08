package com.mohsin.assignment;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String name="abcdcba";
        System.out.println(isPalin(name));
        System.out.println(isPalin1(name));


        char[]  copy=name.toCharArray();
        System.out.println(Arrays.toString(copy));

        for (char ch:name.toCharArray()) {
            System.out.println(ch);
        }

        System.out.println(name.toUpperCase(Locale.ROOT));//this is chages to upper letter but not update a mine string pool becaue of immutiblity feature
        System.out.println(name);

    }

    private static boolean isPalin1(String name) {
        int s=0;
        int e=name.length()-1;
        while (s<e)
        {
            if(name.charAt(s)!=name.charAt(e))
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    private static boolean isPalin(String name) {
       int s,e;
        for(int i=0;i<name.length()/2;i++)
        {
            s=i;
            e=name.length()-1-i;
            if(name.charAt(s)!=name.charAt(e))
            {
                return false;
            }
        }
        return true;
    }
}
