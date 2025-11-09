package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {
        System.out.println("we here printing the data");
        List<Integer> Lists =List.of(1,2,3,5,6,6,7,8);
        Lists.stream()
                .filter((i)->i%2==0)
                .forEach((listss)->System.out.println(listss));

        System.out.println("we here Collecting the data");
       Set<Integer> even= Lists.stream()
                .filter((i)->i%2==0)
                .collect(Collectors.toSet());
       System.out.println(even);

        System.out.println("we here filter the data:find the first element");
      Integer first=even.stream()
              .filter((i)->i%2==0)
              .findFirst()
              .get();
       System.out.println(first);


      System.out.println("we here filter the data:Skiping the element and then find Elemnet");
    Integer skip=even.stream()
            .filter((i)->i%2==0)
            .skip(2)
            .findFirst()
            .get();
       System.out.println(skip);


 ///assignments
       List<String> lis = List.of("DEVI","RAJU","RAM","RATAN","RAMESH","krushna","Dhananjay","Dnyaneshwar");
        lis.stream()
                .filter((i)->i.startsWith("R"))
                .forEach((liss)->System.out.println(liss));
        System.out.println("for printing another condition");
        List<String> ass= lis.stream()
               .filter((i)->i.startsWith("R") &&i.length()==4)
               .collect(Collectors.toList());
              ass.forEach((liddd)->System.out.println(liddd));

        System.out.println("for printing another condition");
        Set<String> asss= lis.stream()
                .filter((i)->i.startsWith("R") &&i.length()==4)
                .collect(Collectors.toSet());
        ass.forEach((liddd)->System.out.println(liddd));


        System.out.println("for printing another condition");
       Long assss= lis.stream()
                .filter((i)->i.startsWith("R"))
                .count();
         System.out.println(assss);

      String ss=lis.stream()
                .filter((i)->i.startsWith("D"))
              .skip(2)
                .findFirst()
                .get();
      System.out.println(ss);







}

}
