package com.mohsin.java.concept;

public class TypeConversion {
    public static void main(String[] args) {
        byte a= (byte) 258;//reminder 258%256==2 which means it is out of Range
        System.out.println(a);

        byte b=10;
        byte c=30;
        System.out.println(b*c);//automatic consider as integer autoTypeCasting
        byte e= (byte) (b*c);//it will work as 300%256
        System.out.println(e);

        //by default decimal data typeCasting is double
        int aa=(int)(100.0);
        float n=10;//it is fine because int range is smaller than float
        System.out.println(n);
        System.out.println(10/2.0);

    }
}
