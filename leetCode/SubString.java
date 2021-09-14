package com.mohsin.leetCode;

public class SubString {
    public static void main(String[] args) {
        String s1="Mobsinaa";
        String sub="aa";
        find(s1,sub);

    }

    private static boolean find(String s1, String sub) {
        for(int i=0;sub.charAt(i)!='\0';i++)
        {
            for(int j=0;s1.charAt(j)!='\0';j++)
            {
                if(s1.charAt(i)==sub.charAt(j))
                {
                    i++;
                    if(i<sub.length())
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
