package sortingKunal;

import java.util.Scanner;

public class sortingExBuublesort {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter ths size of array");
        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter"+n+"element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] newarr = new int[n-1];
        for(int i=0 ;i<n-1;i++){
            newarr[i]=arr[i]+arr[i+1];
        }
        for(int i=0 ;i<newarr.length-1;i++){
            for(int j=1;j<newarr.length-1;j++){
                if(newarr[j]>newarr[j-1]){
                    int temp=newarr[j];
                    newarr[j]=newarr[j-1];
                    newarr[j-1]=temp;
                }
            }
        }
        for (int read:newarr){
            System.out.print(read+" ");
        }


    }


}
