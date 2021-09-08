package com.mohsin.assignment;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sumALLTILX {
    public static void main(String[] args) {
        int sum=0;
        char ch;
        while(true)
        {

            ch = (char) new Scanner(System.in).nextInt();
             if(ch=='x')
             {
                 break;
             }

            sum+=ch;
        }
        System.out.println(sum);
    }
}
