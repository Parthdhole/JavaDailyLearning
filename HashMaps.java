package com.amitit;

import java.security.KeyStore;
import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        Studentww ss = new Studentww(11,"parth",45);
        Studentww s1 = new Studentww(22,"om",50);
        Studentww s2 = new Studentww(11,"parth",99);

        System.out.println(ss.equals(s2));
        HashMap<String,Integer>kk = new HashMap<>();
        kk.put("om",11);
        kk.put("Ratan",22);
        kk.put("parth",33);
        System.out.println(kk);

        LinkedHashMap<Studentww,Integer> oo = new LinkedHashMap<>();
        oo.put(ss,12);
        oo.put(s1,22);
        oo.put(s2,35);
        System.out.println(oo);
        idbaseSorting sorting = new idbaseSorting();

        List<Map.Entry<String, Integer>> ff  = new ArrayList<>(kk.entrySet());

        Collections.sort(ff, new Comparator<Map.Entry< String,Integer>>() {
            @Override
            public int compare(Map.Entry< String,Integer> o1, Map.Entry< String,Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> sorted:ff){
            sortedMap.put(sorted.getKey(),sorted.getValue());

        }
        System.out.println("The sorting of HashMap"+sortedMap);


        TreeMap newTreeset = new TreeMap(sorting);
        newTreeset.put(ss,11);
        newTreeset.put(s1,22);
        newTreeset.put(s2,33);
        System.out.println(newTreeset);




        TreeSet treeset = new TreeSet(sorting);
        treeset.add(ss);
        treeset.add(s1);
        System.out.println(treeset);








    }
}
class  Studentww {
    private int sid;
    private String sname;
    private int sage;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Studentww{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                '}';
    }

    public Studentww(int sid, String sname, int sage) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
    }

    @Override
    public boolean equals(Object obj) {
       if(this==obj){
           return true;
       }
        if (obj instanceof Studentww) {
            Studentww ww= (Studentww) obj;
            if(this.sid==ww.sid){
              return true;

            }
        }
        return false;

    }



//    @Override
//    public int compareTo(Studentww o) {
//        return this.sid-o.getSid();
//    }

    @Override
    public int hashCode() {
        return 1;
    }
}
class idbaseSorting implements Comparator<Studentww> {

    @Override
    public int compare(Studentww o1, Studentww o2) {
        return o1.getSid()-o2.getSid();
    }
}


