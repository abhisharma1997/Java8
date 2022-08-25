package com.learning.java8.lambda;

public class LambdaImpl {

    public static void main (String[] args){
        MyFuncInterface myFuncInterface = (a,b) -> System.out.println(a+b);

        BookService bookService = new BookService();

        myFuncInterface.sum(10,20);

        System.out.println(bookService.sortBooks());
    }
}
