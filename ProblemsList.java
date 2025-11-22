package com.DailyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProblemsList {
    public static void main(String[] args) {
        List<Integer> List= new ArrayList<>();
        List.add(10);
        List.add(50);
        List.add(80);
        List.add(60);
        System.out.println(List);


        List.sort((s1,s2)->-s1.compareTo(s2));
        System.out.println(List);
         Collections.sort(List);
        System.out.println("By using method Collections sort");
        System.out.println(List);
        System.out.println("By using method natural sorting by list.sort");
        List.sort(null);
        System.out.println(List);
        System.out.println("By using method reference");
        List.sort(Integer::compareTo);
        System.out.println(List);






    }
}
