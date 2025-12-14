package com.DailyPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FortuneNov {
    public static void main(String[] args) {

        List<Integer> Arrylist= new ArrayList<>();
        List<Integer> syncList=Collections.synchronizedList(Arrylist);
        System.out.println(Arrylist);
       Thread Thread1= new Thread(()->{
               for(int i=1;i<6;i++){
                   Arrylist.add(i);
                   System.out.println("Thread add:"+i);
               }
       });

        Thread Thread2= new Thread(()->{
            for(int i=7;i<12;i++){
                syncList.add(i);
                System.out.println("Thread add:"+i);
            }
        });
        Thread1.start();
        Thread2.start();
        try {
            Thread1.join();
            Thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final list: " + syncList);
        System.out.println(Arrylist);



    }
}
