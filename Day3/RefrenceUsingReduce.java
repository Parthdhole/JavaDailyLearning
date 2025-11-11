package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RefrenceUsingReduce {

    public static void main(String[] args) {
        List<Integer> sas = Arrays.asList(1,2,4,5,66,7);
        Integer result=sas.stream()
                .reduce((string, string2) -> string+string2)
                .get();
        System.out.println("Sum of the number is"+result);

   Integer s=  sas.stream()
                .reduce(Integer::sum)
             .get();
   System.out.println(s);

        List<String> vvx = Arrays.asList("Parth","Dhole","om","james","Pooja");
      String zs=   vvx.stream()
                .reduce(String::concat)
                .get();
        System.out.println(zs);

        List<String> za = Arrays.asList("Parth","Dhole","om","james","Pooja","","");
       Integer sss= za.stream()
                .filter(Predicate.not(String::isEmpty))
                        .map(String::length)
                       .reduce(Integer::sum)
                               .get();
        System.out.println(sss);


    }
}
