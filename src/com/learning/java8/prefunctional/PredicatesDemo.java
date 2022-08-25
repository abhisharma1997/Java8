package com.learning.java8.prefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    Predicate is a Functional Interface, introduced in Java 8.
    Predicate FI contains abstract method which accepts the input of any Type (Generic Type)
    and returns boolean (Returns true if the input matches the predicate or else it return false).
    For reference : Check Predicate Interface
 */

public class PredicatesDemo {

    public static void main(String[] args){

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        /*
            filter() method from stream API uses Predicate Object as a input Parameter which can be
            written as lambda expression as below expression
         */
        list.stream().filter(t -> t%2 == 0).forEach(t->System.out.println("Printing Even: "+t));



    }
}
