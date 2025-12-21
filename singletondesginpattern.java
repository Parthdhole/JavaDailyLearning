package com.DesignPatterns;

public class singletondesginpattern {
    public static void main(String[] args) {
        Singeton   ss= Singeton.getObject();
        Singeton ss1 = Singeton.getObject();
    System.out.println(ss.hashCode());
    System.out.println(ss1.hashCode());




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
    private Singeton(){

    }



}

