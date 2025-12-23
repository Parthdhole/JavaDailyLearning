package sortingKunal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,6,3,9,5};
        buuble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void buuble(int[] arr){
        //outer loop
        boolean swaap;
        for(int i=0;i< arr.length;i++){
           swaap=false;
            for (int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaap=true;
                }
            }
            if(swaap==false){
                break;
            }
        }


    }

}
