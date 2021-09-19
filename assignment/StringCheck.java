package com.mohsin.assignment;

public class StringCheck {
    public static void main(String[] args) {
        String str="passWor!";
        System.out.println(StringChallenge(str));
    }

    private static String StringChallenge(String str) {
        if(str.length()<=7||str.equals("password") )
        {
            return "false";
        }
        if(checkNumber(str) && checkCapital(str) && checkPunchuation(str))
        {
            return "true";
        }

        return "false";



    }

    private static boolean checkPunchuation(String str) {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>32 && str.charAt(i)<48)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean checkNumber(String str) {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>47 && str.charAt(i)<58)
            {
                return true;
            }
        }
        return false;

    }

    private static boolean checkCapital(String str) {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>64 && str.charAt(i)<92)
            {
                return true;
            }
        }
        return false;
    }
}
