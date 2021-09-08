package com.mohsin.java.concept;

public class Scope {
    public static void main(String[] args) {
        int a=10;//globla kind of annoucemnt you cannot create same in this scope
        int b=29;
        //block
        {
            a=100;//a now poinitnf to 100

           int c=1212;// local scope
            System.out.println("Inside the block id next of c insitialize occur complier allow it"+c);
        }
       // c=100;//eerro // c is not define in this scope because of local scope
        int c=100;//now its fine for me
        System.out.println(c);

        System.out.println(a);
    }
}
