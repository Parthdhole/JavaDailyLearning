package com.DailyPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class w3school27novRemovearraylist {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(10);
//        a1.add(20);
//        a1.add(30);
//        a1.add(40);

//        try {
//            Integer removelement = a1.remove(4);
//            System.out.println("Removed Element:"+removelement);
//        }
//        catch (IndexOutOfBoundsException e )  {
//            System.out.println("Error: The list has fewer than "+ a1.size() +" elements!");
//
//        }
//        System.out.println(a1);



        System.out.println("Write a Java program to remove every third element from an ArrayList using a loop and then display the final list.\n");

        for (int i=0;i<10;i++){
            a1.add(i);
        }
        System.out.println(a1);

      try {
          for(int j=2;j<a1.size();j=j+2){
              a1.remove(j);
              j--;

          }
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }
      System.out.println(a1);

      System.out.println("Write a Java program to use Java streams to filter out the element at index two and collect the remaining elements into a new list");
        Integer elementToRemove = a1.get(2);   // value at index 2

         List<Integer> result= a1.stream()
                   .filter(integer -> !integer.equals(elementToRemove))
                   .collect(Collectors.toList());
         System.out.println(result);





    }


}
