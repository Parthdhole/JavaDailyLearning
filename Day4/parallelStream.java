package Java8Features;

import com.Student.Students;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class parallelStream {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println("with sequence stream");
         list.stream()
                 .forEach(integer ->System.out.print(integer));

         System.out.println();
        System.out.println("with parallel stream but her multipal core running parallel");
        list.parallelStream()
                 .forEach(integer ->System.out.print(integer));
        System.out.println();
        System.out.println("here we can measuring the time for sequence steam and parallel stream");

      long start=System.currentTimeMillis();
      List<Integer> even= list.stream()
                .filter(integer -> integer%2==0)
                .collect(Collectors.toList());
//                even.forEach(integer ->System.out.print(integer));
        long end=System.currentTimeMillis();
        System.out.println("measuring the time  taken by sequence stream...."+(end-start));
        System.out.println(even);

        long start1=System.currentTimeMillis();
        List<Integer> even1= list.parallelStream()
                .filter(integer -> integer%2==0)
                .collect(Collectors.toList());
//                even.forEach(integer ->System.out.print(integer));
        long end1=System.currentTimeMillis();
        System.out.println("measuring the time  taken by parallel stream...."+(end1-start1));
        System.out.println(even1);
        List<Students> x = Arrays.asList(new Students(111,"ratan",17),
                new Students(222,"parth",33),
                new Students(111,"ramesh",14),
                new Students(111,"rashmi",19));
        long start2=System.currentTimeMillis();
        x.stream()
                .sorted(Comparator.comparing(Students::getName))
                .forEach(System.out::println);
        long end2=System.currentTimeMillis();
        System.out.println("measuring the time  taken by sequence stream...."+(end2-start2));
        long start3=System.currentTimeMillis();
        x.stream()
                .sorted(Comparator.comparing(Students::getName))
                .forEach(System.out::println);
        long end3=System.currentTimeMillis();
        System.out.println("measuring the time  taken by sequence stream...."+(end3-start3));
        long start4=System.currentTimeMillis();
        x.parallelStream()
                .sorted(Comparator.comparing(Students::getName))
                .forEachOrdered(System.out::println);
        long end4=System.currentTimeMillis();
        System.out.println("measuring the time  taken by parallel stream...."+(end4-start4));






    }
}
