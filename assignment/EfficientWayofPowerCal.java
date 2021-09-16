package com.mohsin.assignment;

import javax.swing.*;

public class EfficientWayofPowerCal {
    public static void main(String[] args) {
        System.out.println(power(3,6));
    }

    private static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        //if power is even then just return
        if (n % 2 == 0) {
            return power(a, n / 2) * power(a, n / 2);
        }
        return a*power(a,n/2)*power(a,n/2);
    }
}
