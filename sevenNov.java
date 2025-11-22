package com.DailyPractice;

import java.util.Arrays;

class sevenNov {
    //    public static void main(String[] args) {
////       int[] nums = {8, 8, 7, 6, 5};
//
//
//
//    }
//    static int secondLargestElement(int[] nums) {
//            int maxelemnt=nums[0];
//        int n= nums.length;
//        for(int i = 0; i<n; i++)
//            {
//                if(nums[i]>maxelemnt){
//                    maxelemnt=nums[i];
//                }
//            }
//
//        int secondLargest= Integer.MIN_VALUE;
//            for(int j=0;j<n;j++){
//                if(nums[j] != maxelemnt && nums[j] > secondLargest){
//                    secondLargest=nums[j];
//                }
//            }
//
//            return  secondLargest;
//
//        }


    public static void main(String[] args) {
System.out.println("by using insertion sort");
        int[] arr = {1, 2, 1, 4, 5};
//        buuble(arr);
        insrtion(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));


    }

    public static void buuble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }
 public static void insrtion(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(j,j-1);
                }
            }
        }
    }

     static void swap(int start, int end) {
        int temp=start;
        start=end;
        end=temp;
    }

    static void selection(int[] arr){
        System.out.println("selection sort");
        for(int i=0;i<arr.length;i++){
            int last= arr.length-1-i;
            int maxindex=maxvalue(arr,0,last);
            swap(arr,maxindex,last);
        }

    }

    static int maxvalue(int[] arr, int start, int last) {
        int maxvalue=start;
        for(int i=start;i<=last;i++){
            if(arr[start]<arr[i]){
                maxvalue=arr[i];

            }
        }
        return maxvalue;
    }
    static  void swap(int[] arr,int first,int last){

        int temp=first;
        first=last;
        last=temp;

    }


}




