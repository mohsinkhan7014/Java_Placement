package com.mohsin.java.concept.Recursion;

public class NonRecursionApproach {
    public static void main(String[] args) {
        //print the number till 5
        print(0);
    }
    /*all the function is having same number of statement ,return type and argument also equal that means
    * int memory stack calling of the function
    * main() -> print(0) -> print1(1) -> print2(2) ->print3(3)->print4(4)->print(5)
    *
    * now print5 function return void (nothing)so all function will remove one by one in reverse manner
    * curser will pass there where it was called
    *
    * print3() is saying to print2() wait for some while i am executing the next function if i get value from print4() then i will return to you
    *
    *
    * //this all things can be done by one function that is called recursion. why recursion  because we are executing same number of statement with same argument so we don't want to repeat
    *
    * */
    static void print(int n)
    {
        System.out.println(n);
        print1(n+1);
    }

    private static void print1(int n) {
        System.out.println(n);
        print2(n+1);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(n+1);
    }
    private static void print3(int n) {
        System.out.println(n);
        print4(n+1);
    }
    private static void print4(int n) {
        System.out.println(n);
        print5(n+1);
    }

    //this will became mine base condition for print function
    private static void print5(int n) {
        System.out.println(n);

    }

}
