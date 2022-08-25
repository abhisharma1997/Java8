package com.learning.java8.prefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/*
    Supplier is a Functional Interface, introduced in Java 8.
    Supplier FI contains abstract method with no parameters and returns dummy data to fulfill
     the need of Logic.
    For reference : Check Supplier Interface
 */

public class SupplierDemo {


    public static void main(String[] args){
        List<Integer> list= Arrays.asList();//(1,2,3,4,5);

        /*
            findAny() method returns value if it collection is having.
            if collection is empty then it will return the value passed by Supplier as shown below
            orElseGet() method from stream API uses Supplier Object as a input Parameter which can be
            written as lambda expression as below expression
         */
        System.out.println(list.stream().findAny().orElseGet(()-> 20));
    }
}

