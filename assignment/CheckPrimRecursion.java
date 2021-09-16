package com.mohsin.assignment;

public class CheckPrimRecursion {
    public static void main(String[] args) {
        System.out.println(isPrime(199,2));
    }

    private static boolean isPrime(int n,int i) {

        if(n==1 || n%i==0 && n!=i)
        {
            return false;
        }
      /*  if(n%i==0&& i!=n)
        {
            return false;
        }*/
        if(i>=n/2)
        {
            return true;
        }

       boolean yes= isPrime(n,i+1);
       return yes;
    }
}
