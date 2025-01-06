package interview;

import java.util.*;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        Employee e1= new Employee(1,"java","abc@gmail.com");
        Employee e2= new Employee(2,"spring","a@gmail.com");
        Employee e3= new Employee(2,"java","bc@gmail.com");

        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(e1);
        listEmployee.add(e2);
        listEmployee.add(e3);

        Map<String, List<Employee>> collect = listEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(collect);
        Vector<String> v= new Vector<>(2);
        v.add("a");
//        v.add("b");
//        v.add("c");
//        v.add("b");
//        v.add("c");

        Iterator<String> iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
