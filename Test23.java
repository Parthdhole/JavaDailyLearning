package com.DailyPractice;

public class Test23 {
        void m1(int a){
        System.out.println("parent m1");
    }
}
class Child extends Test23{
         void m2(int a,int b){
        System.out.println("child m1");
    }

    public static void main(String[] args) {
       Test23 c = new Child();
       c.m1(10);


    }

}

