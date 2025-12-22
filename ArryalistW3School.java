package com.DailyPractice;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArryalistW3School {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        System.out.println("Write a Java program to iterate over an ArrayList of strings using a ListIterator and print elements in reverse order.");
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Redk");
        c1.add("Green");
        c1.add("Black");
        c1.add("Rhitek");
        c1.add("Pink");
        ListIterator<String> iterator = c1.listIterator(c1.size());
        while (iterator.hasPrevious()) {

            String s = iterator.previous();
            System.out.println(s);
        }
        System.out.println("Write a Java program to iterate through an ArrayList using Java streams and forEach(), and print each element with its index");
        IntStream.range(0, c1.size())
                .forEach(integer -> System.out.println("Index: " + integer + ", Element: " + c1.get(integer)));

        System.out.println("Write a Java program to iterate over an ArrayList using a for-each loop and conditionally print only the elements that meet a specific pattern");
        for (String c : c1) {
            if (c.startsWith("R") && c.endsWith("k")) {
                System.out.println(c);
            }
        }
        System.out.println("Write a Java program to iterate through an ArrayList and simultaneously update each element by appending its length, then print the updated list.\n");

//    for(int i=0;i<c1.size();i++){
//       String s =c1.get(i);
//       c1.add(i,s+s.length());
//        System.out.println(c1);
//
//    }
//        c1.replaceAll(string ->string+string.length());
//        System.out.println(c1);
        System.out.println("by using the ");
        List<String> ss = c1.stream()
                .map(string -> string + "parth")
                .collect(Collectors.toList());
        System.out.println(ss);

        System.out.println("by using for  loop");
        for (int i = 0; i < c1.size(); i++) {
            c1.set(i, c1.get(i) + "parth");
        }
        System.out.println(c1);

        System.out.println("By using ListIterator Crusor");
//        ListIterator<String> iterator1 = c1.listIterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            iterator1.set(s + "Parth");
//
//
//        }

        System.out.println("insert multiple elements at the first position of an ArrayList using addAll() with index 0.");
        c1.add(0,"omkesh");
        System.out.println(c1);
        for(int i=0;i<30;i++){
            List<Integer> newlist= Collections.singletonList(i);
            a1.addAll(0,newlist);
        }
        System.out.println(a1);
        System.out.println("Write a Java program to insert a color at the first position in an ArrayList and then rotate the list so that the inserted element becomes the last element.");
        c1.add(0,"Pune");
        c1.sort((o1, o2) ->-o1.compareTo(o2));
       System.out.println(c1);

       c1.get(1);
       System.out.println(c1);

       c1.set(2,"mumbai");
       System.out.println(c1);








    }
}
