package Java8Features;

import com.Student.Students;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RefrenceUsingMap {


     public static List<Integer> StringToInteger(List<String> Str){
         return   Str.stream()
                   .map(Integer::valueOf)
                   .collect(Collectors.toList());

     }
     public  static List<Integer> CountLength(List<String> length){
            return length.stream()
                     .map(String::length)
                     .collect(Collectors.toList());
     }

    public  static List<String> Uppcase(List<String> upper){
        return upper.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> sas = Arrays.asList("1","2","3","4","5","6","7");
        List<Integer> store=RefrenceUsingMap.StringToInteger(sas);
        System.out.println(store);

        List<String> vv = Arrays.asList("Parth","Dhole","om","james","Pooja","","");
        List<Integer> length= RefrenceUsingMap.CountLength(vv);
        System.out.println(length);

        List<String> vvx = Arrays.asList("Parth","Dhole","om","james","Pooja");
       List<String> uppercase =RefrenceUsingMap.Uppcase(vvx);
       System.out.println(uppercase);

        List<Students> x = Arrays.asList(new Students(111,"ratan",17),
                new Students(222,"parth",33),
                new Students(111,"ramesh",14),
                new Students(111,"rashmi",19));
        x.stream()
                .map(Students::Addage).forEach(integer ->System.out.println(integer));





    }
}
