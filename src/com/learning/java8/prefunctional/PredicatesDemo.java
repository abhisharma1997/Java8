package com.learning.java8.prefunctional;

import java.util.Arrays;
import java.util.List;

public class PredicatesDemo {

    public static void main(String[] args){

        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.stream().filter(t -> t%2 == 0).forEach(t->System.out.println("Printing Even: "+t));



    }
}
