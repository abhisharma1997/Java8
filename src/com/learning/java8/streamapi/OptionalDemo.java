package com.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Abhi",null, Arrays.asList("999999999","8888888")));
        emp.add(new Employee(3,"Him",".Net",Arrays.asList("77777777","66666666")));
        emp.add(new Employee(2,"Mani","Medical",Arrays.asList("55555555","4444444")));

        //Creation
        //Option 1
        Optional<String> emptyOptional = Optional.empty();

        //Option 2
//        Optional<String> ofOptional = Optional.of(emp.get(0).getDept());

        //Option 3
        Optional<String> ofNullableOptional = Optional.ofNullable(emp.get(0).getDept());
        //Usage
        System.out.println(ofNullableOptional.orElseGet(() -> "Dept is null"));
    }
}
