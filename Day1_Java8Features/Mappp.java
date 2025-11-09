package Java8Features;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Mappp {
    public static void main(String[] args) {
        List<Integer> marks = List.of(12, 24, 45, 56, 778);
        marks.stream()
                .map((mark) -> mark + 2)
                .forEach((mark) -> System.out.println(mark));

        List<String> name = List.of("ratan", "anu", "parth", "om", "pooja");
        name.stream()
                .map(naa -> naa + "it")
                .forEach(naa -> System.out.println(naa));

        System.out.println("after store in list and applying filter and map condition");

        List<Integer> numbers = List.of(1, 3, 4, 4, 2, 2, 5, 8, 9, 7);
        List<Integer> aa = numbers.stream()
                .filter((mm) -> mm % 2 == 0) //implementation of test
                .map(mm -> mm * 10)//implementation of apply
                .collect(Collectors.toList());
        aa.forEach((mark) -> System.out.println(mark));
        System.out.println(aa);


        System.out.println("after store in set duplicates are  remove ");
        List<Integer> numberss = List.of(1, 3, 4, 4, 2, 2, 5, 8, 9, 7);
        Set<Integer> aaa = numberss.stream()
                .filter((mm) -> mm % 2 == 0) //implementation of test
                .map(mm -> mm * 10)//implementation of apply
                .collect(Collectors.toSet());
        aaa.forEach((markk) -> System.out.println(markk));
        System.out.println(aaa);
    }
}


