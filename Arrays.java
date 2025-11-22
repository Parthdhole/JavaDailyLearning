package com.DailyPractice;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = 0;

        for (int candy : candies) {
            if (candy >= max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;

    }
    
}
