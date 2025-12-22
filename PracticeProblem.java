package com.DailyPractice;

import java.util.Arrays;

public class PracticeProblem {
    public static void main(String[] args) {

        String[] str = {"ratan", "parth", "om"};

        System.out.println(Arrays.toString(sortt(str)));


    }


    public static String[] sortt(String[] str) {

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {
                if (str[j].compareTo(str[j + 1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;

                }

            }

        }
       return str;

        //        for(int i=0;i<str.length;i++){
//            int count=0;
//            for (int j=0;j<str[i].length();j++){
//                count++;
//
//            }
//            System.out.println(str[i]+"the index of string is"+count);
//        }

        // by using foreach loop and length of method

//        for (String strr:str){
//            System.out.println(strr+""+strr.length());
//        }


    }
}
