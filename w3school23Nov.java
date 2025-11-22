package com.DailyPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class w3school23Nov {
    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Redk");
        c1.add("Green");
        c1.add("Black");
        c1.add("Rhitek");
        c1.add("Pink");
        System.out.println(c1);

        System.out.println("retrieve an element at a given index and handle IndexOutOfBoundsException if the index is invalid");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index where you want to bee");
        int num=sc.nextInt();
        try {
            String str = c1.get(num);
            System.out.println("Element at index " + num + " is: " + str);
        }catch(Exception e){
            System.out.println("Error: Invalid index! Please enter a value between 0 and " + (c1.size() - 1));

        }
        for(int i=0 ;i<c1.size()-1;i++){
          String s1=c1.get(i);
          System.out.println(s1);
        }
        Optional<String> result= IntStream.range(0,c1.size()-1)
                .filter(value -> value==num)
                .mapToObj(c1::get)
                .findFirst();
        System.out.println(result);


        System.out.println("Geeting lastelement  from last index ");
        int lastindex=c1.size()-1;
        String lasElement= c1.get(lastindex);
       System.out.println(lasElement);
        c1.set(2,"mumbai");
        System.out.println(c1);
        System.out.println("Write a Java program to replace all occurrences of a specific value in an ArrayList with another value using streams.\n");
      String store=  c1.stream()
                .filter(string -> string.startsWith("R"))
                .reduce("",(a, b) -> a + b.replaceAll("R", "Omm")+" ");
        System.out.println(store.trim());

     System.out.println("Updating element's by using lambda expression");
       Set<String> ss= IntStream.range(0, c1.size()-1)
                .mapToObj(value ->c1.get(value)+"-"+value)
                .collect(Collectors.toSet());
       System.out.println(ss);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(5);
        list.add(40);
        list.add(15);

        int threshold = 20;
        int newValue = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > threshold) {
                list.set(i, newValue);
            }
        }

        System.out.println("removing every thread elemntt form list by using loop");
//       c1.remove(3);
//       System.out.println(c1);
//        for(int i=0;i<c1.size();i++){
//            if(i==3){
//                c1.remove(i);
//                break;
//            }
//
//        }
//        System.out.println(c1);
//        System.out.println("another way to remove string form here");
//       c1.removeIf(string ->string==c1.remove(3));
//        System.out.println(3);

        for(int i=2;i<list.size();i+=2){
            list.remove(i);
        }
        System.out.println(list);
        Set<Integer> newset=list.stream()
                .filter(integer ->integer%3==0)
                .collect(Collectors.toSet());
        System.out.println(newset);




     }
    }
