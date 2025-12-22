package com.DailyPractice;

import java.lang.reflect.Array;

public class Higest_lowest_number {

    public static void main(String[] args) {

        int[] arr = {10, 20, 77, 4, 60};
        System.out.println(largest(arr));

    }

    public  static int largest(int [] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        return max;


    }


}
