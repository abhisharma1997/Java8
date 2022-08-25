package com.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {

    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Abhi","Java", Arrays.asList("999999999","8888888"),100000));
        emp.add(new Employee(3,"Him",".Net",Arrays.asList("77777777","66666666"),500000));
        emp.add(new Employee(2,"Mani","Medical",Arrays.asList("55555555","4444444"),400000));
        /*
            Example of map()
            I/p of map() -> stream of names
            o/p -> [Abhi, Him, Mani]
         */
        List<String> names = emp.stream().map(em->em.getName()).collect(Collectors.toList());
        System.out.println(names);
        /*
            Example of map()
            I/p of map() -> stream of stream of mobileNum (because mobileNum is a type of List)
            o/p (Un-Flattered)-> [[999999999, 8888888], [77777777, 66666666], [55555555, 4444444]]
         */
        List<List<String>> phone = emp.stream().map(em->em.getMobileNum()).collect(Collectors.toList());
        System.out.println(phone);

        /*
            Example of flatMap()
            I/p of map() -> stream of stream of mobileNum (because mobileNum is a type of List)
            o/p (Flattered) -> [999999999, 8888888, 77777777, 66666666, 55555555, 4444444]
         */
        List<String> phones = emp.stream().flatMap(em->em.getMobileNum().stream()).collect(Collectors.toList());
        System.out.println(phones);

    }
}
