package com.DesignPatterns;

public class singletondesginpattern {
    public static void main(String[] args) {
        Singeton ss= Singeton.getObject();
        Singeton ss1 = Singeton.getObject();
        Singeton ss2 = new Singeton();
        Singeton ss3 = new Singeton();



        System.out.println(ss2.hashCode());
    System.out.println(ss3.hashCode());




    }
}
class Singeton{

    private static Singeton singeton;
    public static Singeton getObject(){
          if(singeton==null) {
        synchronized (Singeton.class) {
            if (singeton == null) {
                singeton = new Singeton();
            }
        }
        }
        return singeton;

    }
    // by making constructor public we can break the singleton
    public Singeton(){
    }



}

