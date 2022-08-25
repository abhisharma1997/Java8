package com.learning.java8.streamapi;

import com.learning.java8.lambda.BookService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {

    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Abhi","Java",Arrays.asList("999999999","8888888")));
        emp.add(new Employee(3,"Him",".Net",Arrays.asList("77777777","66666666")));
        emp.add(new Employee(2,"Mani","Medical",Arrays.asList("55555555","4444444")));

        //Option 1
//        emp.stream().sorted((o1, o2) -> o2.getId()- o1.getId()).forEach(t->System.out.println(t));

        //Option 2
//        emp.stream().sorted(Comparator.comparing(em->em.getDept())).forEach(t->System.out.println(t));

        //Option 3
        emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(t->System.out.println(t));
    }
}
