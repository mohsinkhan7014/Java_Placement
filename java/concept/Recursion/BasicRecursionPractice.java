package com.mohsin.java.concept.Recursion;

public class BasicRecursionPractice {
    public static void main(String[] args) {
        //find the fib of nth term ;

        System.out.println(fibo(4));

    }
    static int fibo(int n)
    {
        /*
        * 0   1   1   2   3   5    8     13    21
        * 0   1   2   3   4   5    6     7      8...nth term means every term is sum of previous two terms
        *
        **/
        //base condition
        if(n<2)
        {
            return n;
        }
        int pre =fibo(n-1);//fib(3) and fib(2) and fib(1)
        int preTopre=fibo(n-2);

       // System.out.println(pre +" ,"+ preTopre);
        return pre+preTopre;
    }


}
