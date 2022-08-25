package com.learning.java8.parallelStream;

import com.learning.java8.streamapi.Employee;

import java.util.*;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Employee> employees =  new ArrayList<>();

        for(int i=1; i<=100000;i++){
            employees.add(new Employee(i,"Employee "+i,"Java", Arrays.asList("191919919"),Long.valueOf(new Random().nextInt(1000*100))));

        }
        long start =  System.currentTimeMillis();
        Double averageNormal = employees.stream()
                .map(em -> em.getSal())
                .mapToLong(sal -> sal)
                .average().getAsDouble();

        long end = System.currentTimeMillis();

        System.out.println("Normal Stream time taken :" + (end-start) + " : Average : "+ averageNormal);

         start =  System.currentTimeMillis();
        Double averageParallel = employees.stream()
                .parallel()
                .map(em -> em.getSal())
                .mapToLong(sal -> sal)
                .average().getAsDouble();

        end = System.currentTimeMillis();

        System.out.println("Parallel Stream time taken :" + (end-start) + " : Average : "+ averageParallel);

    }
}
