package com.example.bookstoreapi;

import com.example.bookstoreapi.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreapiApplication implements CommandLineRunner {

    public static void main(String[] args) {SpringApplication.run(BookstoreapiApplication.class, args);}

    @Autowired
    private BookstoreRepository bookstoreRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
