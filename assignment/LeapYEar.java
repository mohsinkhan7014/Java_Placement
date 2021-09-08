package com.mohsin.assignment;

import java.util.Scanner;

public class LeapYEar {
    public static void main(String[] args) {
        int t;
        Scanner st=new Scanner(System.in);
        System.out.println("No of test cases  ");
        t=st.nextInt();
        while(t>0) {
            int n;
            n = st.nextInt();

             //leap year is divisuble by 4 but not 100 , those year which divisble by 400 is lEAP YEAr
            //if number is divisble by 400 is leap year but below 400 is not leap year so 100,200,300, is not a leap year
         /*   if(n%4==0 && n%100!=0 || n%400==0)
            {
                System.out.println("Leap Year ");
            }
            else
            {
                System.out.println("Not a Leap Year");
            }*/

            if(n%400==0 || n%100!=0   && n%4==0)
            {
                System.out.println("LEap Year");
            }
            else
            {
                System.out.println("Not");
            }



        t--;

        }
    }
}
