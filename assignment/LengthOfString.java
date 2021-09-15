package com.mohsin.assignment;

public class LengthOfString {
    public static void main(String[] args) {
        String name = "Mohsin Khan From Makrana";
        char[] temp = name.toCharArray();
        //System.out.println(length(name,0));

        System.out.println(length1(temp, 0));
    }

    private static int length1(char[] temp, int i) {
        try {
            if (temp[i] == '\0') {
                return 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
        return 1 + length1(temp, i + 1);


    }

    private static int length(String name, int i) {
        //base case
        if (i >= name.length()) {
            return i;
        }
        return length(name, i + 1);
    }
}
