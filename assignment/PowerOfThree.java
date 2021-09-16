package com.mohsin.assignment;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(  powerOfThree(2,10)  );
    }


    private static int powerOfThree(int a, int b)
    {
        if(b==0)
        {
           return 1;
        }
        int temp=a*powerOfThree(a,b-1);
        System.out.print(temp+" ,");
        return temp;
    }

}
