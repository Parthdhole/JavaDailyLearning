package Java8Features;

import com.Student.Emp;
import com.Student.Students;

import java.util.*;
import java.util.stream.Collectors;

public class methodrerefStream {
    public static void main(String[] args) {

        List<String> vvx = Arrays.asList("Parth","Dhole","om","james","Pooja");
        Collections.sort(vvx);
        System.out.println(vvx);
        vvx.sort((o1, o2) ->-o1.compareTo(o2));
        System.out.println(vvx);
        System.out.println("by using stream we can do sorting here by suing reference");
        vvx.sort(String::compareTo);
        System.out.println(vvx);

        System.out.println("by using the first approach and we are perfoming sorting by using java on product data");
        List<Students> x = Arrays.asList(new Students(111,"ratan",17),
                new Students(222,"parth",33),
                new Students(111,"ramesh",14),
                new Students(111,"rashmi",19));
       Collections.sort(x,Comparator.comparing(Students::getAge));
       x.forEach(System.out::println);


       System.out.println("by using the second approach ");
        x.sort(Comparator.comparing(Students::getName));
       x.sort(Comparator.comparing(Students::getName).reversed());
        x.forEach(System.out::println);

        System.out.println("by using the third stream approach ");
        x.stream()
                .sorted(Comparator.comparing(Students::getAge))
                .forEach(System.out::println);
















    }
}
