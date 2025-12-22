package com.DailyPractice;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        int[] arr = {10,30,50,20,89};
        buubleSort(arr);
        System.out.println(Arrays.toString(arr));






    }
    static void buubleSort(int[] arr){
        boolean swap;
        for(int i=0;i<arr.length;i++) {
            swap = false;
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j - 1] = arr[j];
                    arr[j - 1] = temp;
                    swap = true;


                }

            }
            if (swap == false) {
                break;
            }
        }


    }
}
