package com.learning.java8.prefunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Consumer is a Functional Interface, introduced in Java 8.
    Consumer FI contains abstract method which accepts the input of any Type (Generic Type)
    and returns Void.
    For reference : Check Consumer Interface
 */

public class ConsumerDemo {

    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        /*
            forEach() method from stream API uses Consumer Object as a input Parameter which can be
            written as lambda expression as below expression
         */
        list.stream().forEach((t) -> System.out.println("Printing :"+t));

    }
}
