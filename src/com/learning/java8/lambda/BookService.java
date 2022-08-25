package com.learning.java8.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookService {
    List<Book> books = new ArrayList<>();
    BookService(){

        books.add(new Book(101,"ABC"));
        books.add(new Book(102,"CDE"));
        books.add(new Book(103,"EFG"));

    }

    public List<Book> sortBooks(){
        List<Book> sorted =  new ArrayList<>();

        Collections.sort(books,(o1,o2) -> o2.getName().compareTo(o1.getName()));
        sorted =  books;
        return sorted;
    }
}
