package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Reducee {



    public static void main(String[] args) {

        List<Integer> ss = Arrays.asList(1,3,3,4,56,6);
        Set<Integer > xx =ss.stream().map((u)->u+2).collect(Collectors.toSet());
                xx.forEach((i)->System.out.println(i));
                System.out.println();


         // But We Can Use Here reduce();
       int rr= ss.stream().reduce((t1,t2)->t1+t2).get();
       System.out.println(rr);

       List<String> ff = Arrays.asList("rata","parh","om","ruturaj","prakash","pooja","pooki");
         String r=  ff.stream().filter((o)->(o.startsWith("r")||o.startsWith("p"))&&o.length()==4).map((t)->t+"it").reduce((i,j)->i+j).get();
         System.out.println(r);


         System.out.println("----**-----");
        List<Integer> numbers = Arrays.asList(1,31,13,10,56,6,4,9,2);
       Integer total= numbers.stream()
                .filter((i)->i<10)
                .map((i)->i*10)
                .reduce((i,j)->i+j).get();
        System.out.println(total);






    }
}
