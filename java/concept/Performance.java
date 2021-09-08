package com.mohsin.java.concept;

public class Performance {
    public static void main(String[] args) {
        String letter="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            letter=letter+ch;
            System.out.println(letter);//every time new object will be created that may lead to
            // 1,2,3,4,5,6.....N
            //apnye kam ki too last wali bakki sb to wastege of memeory beacue of immutablity hr bar new object bnayega
            //to hrr barr new object na bnakr agr ham ussi object m update kr dee too fir hmara n times bach jarga O(n)
            //mtlb ki mutalblity ka fratur chair wo string builder deta h



        }


    }
}
