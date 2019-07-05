package com.stackroute.javape4;

public class StringReplace {
    public String test(String str) {

        if (str != null) {


            String str1 = str.replace('d', 'f');//replace one charecter with other using replace method
            return  str1;
        } else {
            return null;
        }
    }
}
