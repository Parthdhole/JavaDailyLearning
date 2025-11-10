package Java8Features;

import com.Student.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sorting2 {
    public static void main(String[] args) {
        List<Students> s = Arrays.asList(new Students(111,"ratan",17),
                new Students(222,"parth",33),
                new Students(111,"ramesh",14),
                new Students(111,"rashmi",19));

        System.out.println("by using method reference");
        s.forEach(System.out::println);
        System.out.println("by using sort and lambda");
        s.sort((o1, o2) ->-o1.age.compareTo(o2.getAge()));
        s.forEach(students -> System.out.println(students));

        
         System.out.println("-----****------");
        s.stream()
                .filter(students ->students.name.startsWith("r"))
                .sorted((o1, o2) -> -o1.age.compareTo(o2.age)).forEach(students -> System.out.println(students));

    }
}
