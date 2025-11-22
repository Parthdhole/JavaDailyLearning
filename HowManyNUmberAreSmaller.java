package com.DailyPractice;

import java.util.ArrayList;
import java.util.List;

public class HowManyNUmberAreSmaller {
    public static void main(String[] args) {
        HowManyNUmberAreSmaller ss=new HowManyNUmberAreSmaller();
        int[] nums = {8,1,2,2,3};

//        System.out.println(Arrays.toString(ss.smallerNumbersThanCurrent(nums)));


    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] result = new int[nums.length];
        int count=0;
      int max=0;
      for(int i=0;i<nums.length;i++){

          for (int j=0;j<nums.length;j++){
              if(nums[j]>nums[i]){
                  count++;
              }

          }
          result[i]=count;

      }
      return result;
    }
}
