package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filterr2 {


    public static void main(String[] args) {


        List<Employee> emp = Arrays.asList(new Employee(20000.0, "Parth", 122),
                new Employee(30000.0, "om", 123),
                new Employee(40000.0, "Pooja", 222));

        System.out.println("printing data in simple  format");
        emp.stream().filter((empp)->empp.getEname().startsWith("P"))
                  .forEach(empp->System.out.println(empp.getEid()+" "+empp.getEname()+" "+empp.getEsal()));

        System.out.println("printing data in list format");
        List<Employee> ss= emp.stream().filter((emppp)->emppp.getEsal()>30000)
                  .collect(Collectors.toList());
                 ss .forEach((emppp)->System.out.println(emppp.getEid()+" "+emppp.getEname()+" "+emppp.getEsal()));


                 System.out.println("printing data in set format");
        Set<Employee> sss= emp.stream().filter((emppp)->emppp.getEsal()>30000)
                .collect(Collectors.toSet());
        ss .forEach((emppp)->System.out.println(emppp.getEid()+" "+emppp.getEname()+" "+emppp.getEsal()));

        System.out.println("printing first element");
        Employee ssss= emp.stream().filter((emppp)->emppp.getEsal()>30000)
                .findFirst().get();
       System.out.println(ssss.getEid()+" "+ssss.getEname()+" "+ssss.getEsal());

        System.out.println("printing first element and i want null also of not present");
        Employee sssss= emp.stream().filter((emppp)->emppp.getEsal()>300000)
                .findFirst().orElse(null);
        if(sssss!=null) {
            System.out.println(sssss.getEid() + " " + sssss.getEname() + " " + sssss.getEsal());
        }else {
            System.out.println(sssss);
        }




    }

}
