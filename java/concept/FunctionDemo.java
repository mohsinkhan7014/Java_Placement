package com.mohsin.java.concept;

import java.util.Scanner;

public class FunctionDemo {
    public static void main(String[] args) {

        //sum();
        //always take pass by value in java
        String name ="Mohsin Khan";
        greeting(name);
        System.out.println(name);//  this name will remain same because it is pass by value not by ref.

        // if array kind of things then name and naam point same object becaue function argument create a  copy of that object if it changed that all changes reflect into name


        int a=10,b=20;
        swap(a,b);
        System.out.println("After Swaping "+a+" "+b);
    }

    static void swap(int num1,int num2)// a and num1 pointing same value that is 10 same for // b and num2 pointing 20
    {
        // but due to creating of new object num1 pointing to num2 and num2 pointing to temp but a and b are still poiniting to same
        int temp=num1;
        num1=num2;// it is like creating new object(num2) in heap memory with the help of num1 ref;
        num2=temp;//it is like creating new object(temp) in heap memory with the help of num2 ref;


        //all changes reflect only in this function scope only

    }
    static void greeting(String naam) {// name and naam are poiniting same name that is Mohsin Khan
        naam="Kamran Akmal";//now naam will create a new object that is poinitng a Kamran Akmal In Heap Memory

    }

    static void sum()
    {
        System.out.println("Good");
    }
}
