package com.DailyPractice;

import java.util.Arrays;

public class EightNov {
    /**some of two numbers and then is equal to target or not
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]

    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
        int target = 9 ;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
       String[] arr = {"flower","flowe","flighet"};
       System.out.println(longestCommonPrefix(arr));


    }
    public static String longestCommonPrefix(String[] arr){
        String prifix="";
        String first=arr[0];


        for (int i=0;i<=arr.length;i++){
            char c =first.charAt(i);

            for (int j=1;j<arr.length;j++){
                if(i>=arr[j].length()||arr[j].charAt(i)!=c){
                    return  prifix;
                }
            }

                prifix = prifix + c;

        }
        return prifix;




    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15,11,15,2};
        System.out.println(findDuplicateSum(nums));
    }
    public static int findDuplicateSum(int[] nums) {
        Arrays.sort(nums);
        int k = 0; // initialize
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }
     **/
    public static void main(String[] args) {
        int[] nums = {2,7,11,15,11,15,2};
        sortedarray(nums);
        for(int nu:nums){
            System.out.print(nu+" ");
        }


    }
    public static void sortedarray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] < nums[j - 1]) {
                    int temp = nums[i];
                    nums[i] = nums[j - 1];
                    nums[j - 1] = temp;
                }

            }
        }
    }
}
