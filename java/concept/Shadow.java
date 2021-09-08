package com.mohsin.java.concept;

public class Shadow {
    static int x=100;
    public static void main(String[] args) {
        x=200;
        System.out.println(x);
        shadowfun(x);
        int x;//now it is local scope global scope will be override by local scope (hidden by local x)
        //System.out.println(x);//error because local x is not initialized
        x=100;//fine
        System.out.println(x);//scope will begun when local value is initialize
        System.out.println(x);

    }

    private static void shadowfun(int x) {
        System.out.println(x);
    }
}
