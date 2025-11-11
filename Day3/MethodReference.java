package Java8Features;

import com.Student.Students;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {
        List<String> vv = Arrays.asList("Parth","Dhole","om","james","Pooja","","");
       Long s = vv.stream().filter(string ->!string.isEmpty()).count();
       System.out.println(s);
       Long ss=vv.stream()
               .filter(String::isEmpty).count();
           System.out.println(ss);
        List<Students> x = Arrays.asList(new Students(111,"ratan",17),
                new Students(222,"parth",33),
                new Students(111,"ramesh",14),
                new Students(111,"rashmi",19));
        System.out.println("but this by suing predefine methods anb lambda code");
        x.stream().filter(students -> students.age>16).forEach(students -> System.out.println(students));
        System.out.println("but this by suing user define methods and print with the help of method reference");
        System.out.println("by using custom filter methods");
        x.stream()
                .filter(Students::AgeCheck)
                .forEach(System.out::println);
System.out.println("by using custom method and comparing name start with ");
       Set<Students> zz= x.stream()
                .filter(Students::NameCheck)
                .collect(Collectors.toSet());
        zz.forEach(System.out::println);







    }
}
