package com.DailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergingTwoArray {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int[] merged = new int[arr1.length + arr2.length];


        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Print merged array
        for (int n : merged) {
            System.out.print(n + " ");

        }


        //by suing stream
        int[] mer= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
        System.out.println(Arrays.toString(mer));

        // it will only one string and object not in intgers
//        List<Integer> megerdd=new ArrayList<>(Arrays.asList(arr1));
//        megerdd.addAll(Arrays.asList(arr2));
//
//        System.out.println();

    }


}
