package com.mohsin.java.concept;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
            //ab yh hrr time replace krta jaega instead of making new object every time but time O(n)


        }
        System.out.println(builder);

        //sometimes we need mutablity of string feature so we StringBuilder

    }
}
