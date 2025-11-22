package com.DailyPractice;

public class GoodPair {
    public static void main(String[] args) {
        GoodPair gp = new GoodPair();
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(gp.numIdenticalPairs(nums));
    }
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }


        return count;
    }
}
