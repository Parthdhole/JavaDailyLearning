package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mappp2 {


    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee(20000.0, "Parth", 122),
                new Employee(30000.0, "om", 123),
                new Employee(40000.0, "Pooja", 222));




        emp.stream()
                .map(mpp->mpp.getEsal()+1000)
                .forEach(mpp->System.out.println(mpp));
        emp.stream()
                .map(mpp->mpp.getEname()+"  say parth is great person")
                .forEach(mpp->System.out.println(mpp));



        emp.stream()
                .filter(mpp->mpp.getEsal()>30000)
                .map(mpp->{mpp.setEsal(mpp.getEsal()+1000);return mpp;}) //here we get hole data/object of employee not esal only
                .forEach(mpp->System.out.println(mpp.getEid()+" "+mpp.getEname()+" "+ mpp.getEsal()));


        List<Employee> ss=emp.stream()
                .map(mpp->{mpp.setEsal(mpp.getEsal()+1000);return mpp;})
//                .forEach(mpp->System.out.println(mpp));
                .collect(Collectors.toList());
        ss.forEach(mpp->System.out.println(mpp));
//                       ss.forEach(mpp->System.out.println(mpp.getEid()+" "+mpp.getEname()+" "+ mpp.getEsal()));
        System.out.println(ss);

    }
}
