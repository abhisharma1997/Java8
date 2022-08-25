package com.learning.java8.streamapi;

import java.util.*;

public class StreamApiDemo {

    public static void main(String[] args){
        List<String> names = Arrays.asList("Abhi","Him","Mani");
        Map<Integer,String> data = new HashMap<>();
        data.put(1,"Abhi");
        data.put(2,"Him");
        data.put(3,"Mani");

        //Option 1: Without stream Api
        for(String s :  names){
            System.out.println(s);
        }

        // Option 2 : Using Stream API
        // forEach using stream api
        names.stream().forEach(t -> System.out.println(t));
        data.forEach((key,val) -> System.out.println(key +":"+ val));

        // forEach on map using Stream API
        data.entrySet().stream().forEach((val) -> System.out.println("key" +":"+ val));

        //Option 1 : Traditional approach for Filter

        for(String s : names){
            if(s.startsWith("A")){
                System.out.println(s);
            }
        }

        // Option 2 : Filter With Stream API
        names.stream().filter(t->t.startsWith("H")).forEach(t -> System.out.println(t));
        data.entrySet().stream().filter(key->key.getValue().startsWith("M")).forEach(t-> System.out.println(t.getValue()));

    }
}
