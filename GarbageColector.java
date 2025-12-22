package com.DailyPractice;
class Emp{}

public class GarbageColector  {
    public void finalize(){
        System.out.println("Object is destorryed");
    }
 Emp m1(){
        Emp gcc1 = new Emp();
         Emp gcc2 = new Emp(); // this object is eligibal for gc
        System.out.println(gcc1);
        return gcc2;
    }

    public static void main(String[] args) {
//        Runtime r =Runtime.getRuntime();
//        System.out.println("tot  memory"+r.totalMemory());
//        System.out.println("tot free memory"+r.freeMemory());
//        for(int i=0;i<1000000;i++){
//            GarbageColector gcc = new GarbageColector();
//        }
//        System.out.println("tot  memory"+r.totalMemory());
//        r.gc();
//        System.out.println("tot free memory"+r.freeMemory());
//
//System.out.println(r.availableProcessors());
         Emp e = new GarbageColector().m1();
         System.out.println(e);




    }
}
