package com.DailyPractice;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice15to18Nov {
    public static void main(String[] args) {
        ArrayList<Integer> Arraylist = new ArrayList<>();
        Arraylist.add(10);
        Arraylist.add(20);
        Arraylist.add(30);
        Arraylist.add(40);
        System.out.println(Arraylist);

        System.out.println("there are fou way to add the one collection data into another");
        System.out.println("first way");
        ArrayList<Integer> Arraylist1 = new ArrayList<>(Arraylist);
        System.out.println(Arraylist1);
        System.out.println("Second way ->by using add all method");
        ArrayList<Integer> Arraylist2 = new ArrayList<>();
        Arraylist2.addAll(Arraylist1);
        System.out.println(Arraylist2);
        System.out.println("Third way ->by using add clone");
        ArrayList<Integer> Arraylist3 = (ArrayList<Integer>)Arraylist2.clone();
        System.out.println(Arraylist3);
        System.out.println("fourth way ->by using java8 stream");
        List<Integer> Arraylist4 =Arraylist3.stream()
                                       .collect(Collectors.toList()) ;
        System.out.println(Arraylist4);

        System.out.println("iterating  the element by using for each ");

        for(Integer aa:Arraylist4){
            System.out.println(aa);

        }
        System.out.println("Insert the element by index");
        Arraylist4.add(780);
        System.out.println(Arraylist4);
        System.out.println("Udate the element by index");
        System.out.println( Arraylist4.set(1,99));
        System.out.println(Arraylist4);
        System.out.println("retrive  the element by index");
        System.out.println( Arraylist4.get(1));

         Arraylist4.remove(4);
         System.out.println(Arraylist4);
         Arraylist4.sort((t1,t2)->t1.compareTo(t2));
         System.out.println(Arraylist4);
        Collections.shuffle(Arraylist4);
        System.out.println(Arraylist4);

        System.out.println(Arraylist4.indexOf(10));
        System.out.println("Convertion of collections to array");
       System.out.println(Arrays.toString(Arraylist4.toArray()));
       Object[] ARR = Arraylist4.toArray();
//       boolean print=Arraylist4.removeAll(Arraylist1);
//       System.out.println(Arraylist4);
//        System.out.println(Arraylist1);
       System.out
               .println(Arraylist4.subList(1,3));
       System.out.println(Arraylist4.reversed());
//        Collections.sort(Arraylist4);
//      System.out.println(Arraylist4);
      Arraylist4.sort((o1, o2) -> o1.compareTo(o2));
      System.out.println(Arraylist4);


      System.out.println("compare two Arraylist");
      ArrayList<Integer> Comaparelist = new ArrayList<>();
        Comaparelist.add(10);
        Comaparelist.add(30);
        Comaparelist.add(20);
        Comaparelist.add(180);
        Comaparelist.add(99);
        ArrayList<Integer> news3 = new ArrayList<>();
        for(Integer i:Arraylist){
           if(Comaparelist.contains(i)){
               news3.add(i);
           }

        }
        System.out.println(news3);
        System.out.println("before swap the arraylist ");
        System.out.println(Comaparelist);
        Collections.swap(Comaparelist,0,3);
        System.out.println(Comaparelist);
        System.out.println("After swap the arraylist ");

        //for clear hole list here and then use isEmpty or not
//        Comaparelist.clear(); // removeall also use here
        System.out.println(Comaparelist.isEmpty());
        Comaparelist.trimToSize();// it cut the size of array
        System.out.println(Comaparelist);
        ArrayList<Integer> Comaparelist1 = new ArrayList<>();

        System.out.println( Comaparelist1.size());

        System.out.println("here we using stream firstly concat and then collect into new list");
      List<Integer> resutlt=Stream.concat(Arraylist.stream(),Comaparelist1.stream())
                .collect(Collectors.toList());
      System.out.println(resutlt);
System.out.println("Write a Java program to join two ArrayLists and then sort the merged list using a custom comparator.");
        List<Integer> resutlt1=Stream.concat(Arraylist.stream(),Comaparelist1.stream())
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(resutlt1);
        //like this another way
        Comaparelist1.sort((a, b) -> a.compareTo(b));

        System.out.println("By using the reference variable");
        List<Integer> resutlt11=Stream.concat(Arraylist.stream(),Comaparelist1.stream())
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println(resutlt11);

        System.out.println("merging two different types of list");
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<Object> merage= new ArrayList<Object>();
        merage.addAll(Arraylist);
        merage.addAll(c1);
     // another way to do this
     System.out.println(merage);
        List<Object> megerlsit=Stream.concat(Arraylist.stream(),c1.stream())
                .collect(Collectors.toList());
        System.out.println(resutlt11);

        // we Increases the capacity also 
        merage.ensureCapacity(20);


























































    }
}
