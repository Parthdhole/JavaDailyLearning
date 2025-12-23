package sortingKunal;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,2,4,0,6,-5,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i=0;i< arr.length;i++){
            int last=arr.length-i-1;
            int maxindessx=MaxValue(arr,0,last);
            swap(arr,maxindessx,last);
        }

    }

    static int MaxValue(int[] arr,int start, int last) {
        int max=start;
        for (int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                 max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int end){
      int temp=arr[first];
      arr[first]=arr[end];
      arr[end]=temp;
    }


}
