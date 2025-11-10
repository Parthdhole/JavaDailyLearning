package Java8Features;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {


    public static void main(String[] args) {



        System.out.println("---- it's first approach to sorting------");
        List<String> vv = Arrays.asList("Parth","Dhole","om","james","Pooja");
        Collections.sort(vv);
        System.out.println(vv);
        Collections.sort(vv, Comparator.reverseOrder());
        System.out.println(vv);

        System.out.println("---- it's second approach to sorting------");
        vv.sort((i,j)->i.compareTo(j));// here we usr coampre method finternally for  customer sorting
        System.out.println(vv);
        vv.sort((i,j)->-i.compareTo(j)); // here we usr coampre method finternally for  customer sorting
        System.out.println(vv);

        System.out.println("---- it's third approach to sorting------");
        vv.stream()
                .sorted()
                .forEach(name->System.out.println(name)); //in normal approach
        vv.stream()
                .filter((i)->(i.startsWith("P")))
                .sorted((i,j)->-i.compareTo(j))
                .forEach(name->System.out.println(name)); //in custom sorting approach
        System.out.println("---- Assignment's------");

        List<Integer> sss = Arrays.asList(1,3,3,4,56,6);
        List<Integer> s=sss.stream()
                .filter((i)->i<10)
                .map((i)->i*10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("with using list"+s);
        Set<Integer> ss=sss.stream()
                .filter((i)->i<10)
                .map((i)->i*10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet());
        System.out.println("with using set"+ss);

















    }
}
