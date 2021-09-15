package com.mohsin.assignment;

import java.util.Scanner;

public class countMoreThan100Element {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        int input=st.nextInt();
        int count=0;


        while (input>=0)
        {
            if(input>=100)
            {
                count++;
            }
            input=st.nextInt();

        }
        System.out.println(count);
    }
}
