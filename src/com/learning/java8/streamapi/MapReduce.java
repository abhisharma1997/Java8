package com.learning.java8.streamapi;

import java.util.*;

public class MapReduce {

    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Abhi","Java", Arrays.asList("999999999","8888888"),100000));
        emp.add(new Employee(3,"Him",".Net",Arrays.asList("77777777","66666666"),500000));
        emp.add(new Employee(2,"Mani","Medical",Arrays.asList("55555555","4444444"),400000));
        emp.add(new Employee(2,"Mani","Java",Arrays.asList("55555555","4444444"),700000));
        emp.add(new Employee(2,"Mani","Medical",Arrays.asList("55555555","4444444"),400000));
        emp.add(new Employee(2,"Mani","Medical",Arrays.asList("55555555","4444444"),1000000));

        //Sum of Salary whose dept is Java
        Long sum = emp.stream()
                .filter(em -> em.getDept().equalsIgnoreCase("java"))
                .map(em ->em.getSal())
                .mapToLong(e -> e)
                .sum();
        System.out.println(sum);

        Optional<Long> medicalSum = emp.stream()
                .filter(em -> em.getDept().equalsIgnoreCase("medical"))
                .map(em -> em.getSal())
//                .mapToLong(e -> e)
                .reduce(Long::sum);

        System.out.println(medicalSum.get());
    }
}
