package com.mohsin.assignment;



public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println();
        //power function take only positive number in this case only
        System.out.println("Power of  2  : "+ power(2,0) );
        // Integer Range (-2^31 -1,2^31)

        // if power is negative number in this case :::::::::::::::::::::::::::::::::::::::::::::::::
        System.out.println(power1(2,-1));
    }

    // this approach is taking n+1 function call in stack so Space Complexity is O(n)
    private static int power( int a,int n) {
        //base case--> where condition will break
        if(n==0)
        {
            return 1;// 2^0==1   if i am not stopping in this place then it will lead to stack overflow error which means your memory is full now not able to accept more recursive call

        }
        //recursive Function (Current Recursive Function ;
        int tempResult=a*power(a,n-1);
        System.out.print(tempResult+" ");
        return tempResult;
    }


    private static int power1( int a,int n) {
        //base case--> where condition will break
        if(n<=0)
        {
            return 1;// 2^0==1   if i am not stopping in this place then it will lead to stack overflow error which means your memory is full now not able to accept more recursive call

        }
        //recursive Function (Current Recursive Function ;
        int tempResult=a*power(a,n-1);
        System.out.print(tempResult+" ");
        return tempResult;
    }
}
