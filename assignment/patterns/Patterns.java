package com.mohsin.assignment.patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Enter a Line to See a Pattern for "+"");
        int n=new Scanner(System.in).nextInt();

        pattern1(n);
        System.out.println();
        Pattern2(n);
        System.out.println();
        patterns3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        patterns6(n);
        System.out.println();
        patterns7(n);
        System.out.println();
        patterns8(n);
        System.out.println();
        pattern9(n);
        System.out.println();
        pattern10(n);
        System.out.println();
        pattern11(n);
        System.out.println();
        pattern12(n);
        System.out.println();
        pattern13(n);
        System.out.println();
        pattern14(n);
        System.out.println();
        pattern15(n);
        System.out.println();
        pattern16(n);   //pending
        System.out.println();
       // pattern17(n);

    }

    private static void pattern17(int n) {

        int count=0;
        for(int row=0;row<2*n-1;row++)
        {
            for(int col=0;col<2*n-1;col++)
            {
                if(col<(2*n-1)/2)
                {
                    System.out.print(" ");
                    count++;
                }
                //else if(col==(2*n-1)/2|| col==(2*n-1)-count)
            }
        }

    }

    private static void pattern16(int n) {
//          1
//        1   1
//      1   2   1
//    1   3   3   1
//  1   4   6   4   1

        int count=0;

        int sumRow=0;
        int  sumCol1=0,sumCol2=0;
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<2*n-1;col++)
            {
                if(col<(2*n-1)/2-row)
                {
                    System.out.print(" ");
                    count++;


                }
                else if(col==(2*n-1)/2-row || col==(2*n-1)-count-1)
                {
                    System.out.print("1");
                    sumRow=row-1;
                    sumCol1=col-1;
                    sumCol2=1;


                }
                else
                {
                    System.out.print(" ");

                }
            }
            System.out.println();
            count=0;
        }


    }

    private static void pattern15(int n) {
        int count=0;
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<2*n-1;col++)
            {
             if(col<(2*n-1)/2-row)
             {
                 System.out.print(" ");
                 count++;
             }
             else if(col==(2*n-1)/2-row || col==(2*n-1)-count-1)
             {
                 System.out.print("*");
             }
             else
             {
                 System.out.print(" ");
             }
            }
            System.out.println();
            count=0;

        }
        for(int row=1;row<n;row++)
        {
            for(int col=0;col<2*n-1;col++)
            {
                if(col==row || col==(2*n-1)-row-1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static void pattern14(int n) {
    /*
        *********
         *     *
          *   *
           * *
            *
            */



        for(int row=0;row<n;row++)
        {
            if(row==0)
            {
                for(int i=0;i<2*n-1;i++)
                {
                    System.out.print("*");
                }
            }else {
                for (int col = 0; col < 2 * n - 1; col++) {

                    if (col < row) {
                        System.out.print(" ");
                    } else if (col == row || col == 2 * n - 1 - row-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }

    private static void pattern13(int n) {
  /*     *
        * *
       *   *
      *     *
     *********

   */
        for(int row=0;row<n;row++)
        {
            if(row!=n-1) {
                for (int col = 0; col < 2 * n - 1; col++) {

                    if (col == (2 * n - 1) / 2 - row) {
                        for (int k = 0; k < 2 * row + 1; k++) {

                            if (k == 0 || k == 2 * row) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            col++;
                        }

                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
            else
            {
                for(int i=0;i<2*n-1;i++)
                {
                    System.out.print("*");
                }
            }
        }

    }

    private static void pattern12(int n) {
        pattern11(n);
        pattern10(n);
    }

    private static void pattern11(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(col<row)
                {
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(col<n-row-1)
                {
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<2*n-1;col++)
            {
                if(col==row) {
                    for (int k = 0; k <(2 * n - 1 )-( 2 * row); k++) {
                        System.out.print("*");
                        col++;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private static void patterns8(int n) {

//    *
//   ***
//  *****
// *******
//*********

        for(int row=0;row<n;row++)
        {
            for(int col=0;col<2*n-1;col++)
            {
                if(col==((2*n-1)/2-row)) {
                    for (int k = 0; k < 2*(row+1)-1;k++) {
                        System.out.print("*");
                        col++;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void patterns7(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(col<row){
                    System.out.print(" ");
                }
                else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void patterns6(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(col>=n-row-1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int row=0;row<n-1;row++)
        {
            for(int col=0;col<n-1-row;col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n)
    {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(" "+(col+1)+" ");
            }
            System.out.println();
        }
    }

    private static void patterns3(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n-row;col++)
            {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }

    private static void Pattern2(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
