package com.DailyPractice;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaP {
    public static void main(String[] args) {
        SortedMap<Integer,String > ss = new TreeMap<>((a,b)->a-b);
        ss.put(111,"parth");
        ss.put(222,"om");
        ss.put(333,"lucky");
        System.out.println(ss);
        ss.firstKey();
        ss.lastKey();

    }
}
