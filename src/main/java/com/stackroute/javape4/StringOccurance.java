package com.stackroute.javape4;

public class StringOccurance {
    public String test(String str) {

        if (str != "") //enter String is not empty
             {


            int charcount = str.length() - str.replaceAll("a", "").length();//to replace space with a in th given string using replaceall
            return "Occurrence Of A Char In String: "+ charcount;
        } else {
            return null;
        }
    }
}
