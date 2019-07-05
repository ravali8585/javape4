package com.stackroute.javape4;

public class StringSort {
    String[] sortString(String str) {
        String[] names = str.split("\\s");//split the string based on space
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (names[j - 1].compareTo(names[j]) > 0) //using compareto method
                {
                    String temp = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }
}