package com.mohsin.assignment.patterns;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PatternsOptimize {
    public static void main(String[] args)
    {
        int n=new Scanner(System.in).nextInt();

        System.out.println();
        patter19(n);
        System.out.println();
       // patter18(n);//pending
        System.out.println();
        patter17(n);
        System.out.println();
        patter16(n);
        System.out.println();
        patter15(n);
        System.out.println();
        patter14(n);
        System.out.println();
        patter13(n);
        System.out.println();
        patter12(n);
        System.out.println();
        patter11(n);
        System.out.println();
        patter10(n);
        System.out.println();
        patter9(n);
        System.out.println();
        patter8(n);
        System.out.println();
        patter7(n);
        System.out.println();
        patter6(n);
        System.out.println();
        patter5(n);
        System.out.println();
        patter4(n);
        System.out.println();
        patter3(n);
        System.out.println();
        patter2(n);
        System.out.println();
        patter1(n);
        
    }



    private static void patter19(int n) {
        for(int row=1;row<=n;row++)
        {
            int outerSpace=n-row;
            for(int i=0;i<outerSpace;i++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col);
                if(col==1)
                {
                    for(int i=col+1;i<=row;i++)
                    {
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
    }

    private static void patter18(int n) {
        int leftNode=0,rigthNode=0;
        for(int row=1;row<=n;row++)
        {
            int outerSpace=n-row;
            for(int i=0;i<outerSpace;i++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                leftNode=(row-1)+(col-1);
                rigthNode=(row-1)+(col+1);

                System.out.print(row);
            }
        }

    }

    private static void patter17(int n) {
        int updatedInnerSpace=0;
        for (int row=0;row<2*n-1;row++)
        {
            //outer space
            int outerSpace=row<n? n-row-1:(row-n+1);
            for(int space=0;space<outerSpace;space++)
            {
                System.out.print(" ");
            }
            int starTobePrinted=(row<1 || row==2*n-2)?1:2;

            for(int col=0;col<starTobePrinted;col++)
            {
                System.out.print("*");
                //iner space

               updatedInnerSpace =row<n?2*row-1:updatedInnerSpace-2;
                for(int innerSpace=0;innerSpace<updatedInnerSpace;innerSpace++)
                {
                    System.out.print(" ");
                }
                if(row>1 && row<(2*n-2)) {
                    System.out.print("*");
                    starTobePrinted--;
                }



            }
            System.out.println();

        }
    }

    private static void patter16(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int row=1;row<=n-1;row++)
        {
            //outer space
            for(int space=0;space<row;space++)
            {
                System.out.print(" ");
            }
            int updatedRow=n-row<=1?1:2;
            for(int col=0;col<updatedRow;col++)
            {
                System.out.print("*");
                //iner space
                for(int innerSpace=0;innerSpace<2*(n-row-1)-1;innerSpace++)
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    private static void patter15(int n) {

    }

    private static void patter14(int n) {
        for (int row=0;row<n-1;row++)
        {
            //outer space
            for(int space=0;space<n-1-row;space++)
            {
                System.out.print(" ");
            }
            int updatedRow=row<1?1:2;
            for(int col=0;col<updatedRow;col++)
            {
                System.out.print("*");
                //iner space
                for(int innerSpace=0;innerSpace<2*row-1;innerSpace++)
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int i = 0; i < 2*n-1 ; i++) {
            System.out.print("*");

        }

    }

    private static void patter13(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<n-1-row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void patter12(int n) {
        for (int row=0;row<2*n;row++)
        {
            //now calculate the space seperatedly
            int totatSpace=row<n?row:2*n-row-1;
            for(int space=0;space<totatSpace;space++)
            {
                System.out.print(" ");
            }
            int totalStar=row<n?n-row:row-n+1;
            for(int col=0;col<totalStar;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void patter11(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<n-row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void patter10(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<n-1-row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void patter9(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<2*(n-row)-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void patter8(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<n-1-row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<(2*(row+1)-1);col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void patter7(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<n-row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    private static void patter6(int n) {
        for (int row=0;row<n;row++)
        {
            //now calculate the space seperatedly
            for(int space=0;space<n-1-row;space++)
            {
                System.out.print(" ");
            }

            for(int col=0;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void patter5(int n) {
        for (int row=0;row<2*n;row++)
        {
            int totalStar=row<n?row+1:2*n-1-row;
            for(int col=0;col<totalStar;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void patter4(int n) {
        for (int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    private static void patter3(int n) {
        for (int row=0;row<n;row++)
        {
            for(int col=0;col<n-row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patter2(int n) {
        for (int row=0;row<n;row++)
        {
            for(int col=0;col<row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patter1(int n) {
        for (int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
