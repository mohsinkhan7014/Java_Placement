package com.mohsin.assignment;

public class ReverseString {
    public static void main(String[] args) {
        String name="Mohsin Khan";
        System.out.print(reverse(name,0,name.length()));
        System.out.println();
        System.out.print(reverse1(name,name.length()));
    }

    private static  char reverse(String name,int i,int len) {
        if(len==1)
        {
            //System.out.print(name.charAt(i));
            return name.charAt(i);
        }
        char rev=reverse(name,i+1,len-1);
        System.out.print(rev);
        return name.charAt(i);
    }

    private static  char reverse1(String name,int len) {
        if(len==1)
        {
            //System.out.print(name.charAt(i));
            return name.charAt(name.length()-len);
        }
        char rev=reverse1(name,len-1);
        System.out.print(rev);
        return name.charAt(name.length()-len);
    }
}
