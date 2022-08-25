package com.learning.java8.prefunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class SupplierDemo {


    public static void main(String[] args){
        List<Integer> list= Arrays.asList();//(1,2,3,4,5);

        System.out.println(list.stream().findAny().orElseGet(()-> 20));
    }
}

