package com.stackroute.javape4;

public class StringTranspose {


        String[] transpose(String str) {
            String[] names = str.split("\\s");//to split the string based on space
            for (int i = 0; i < names.length; i++) {
                String reverse = "";
                for (int j = names[i].length() - 1; j >= 0; j--) {
                    reverse = reverse + names[i].charAt(j);//charAt is used to retrieve specified index of string
                }

                names[i] = reverse;
            }
            return names;
        }


}

