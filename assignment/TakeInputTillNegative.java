package com.mohsin.assignment;

import java.util.Scanner;

public class TakeInputTillNegative
{
    public static void main(String[] args)
    {
        Scanner st=new Scanner(System.in);
        int input=st.nextInt();
        int count=0;
        int temp=0;

        while (input>=0)
        {
            if(input>=100)
            {
                 temp=Math.min(temp,input);
            }
            input=st.nextInt();
            if(input>=100)
            {
                temp=input;
            }
        }
        System.out.println(temp);
    }
}
