package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.exception.ResourceNotFoundException;
import com.example.bookstoreapi.model.BookStore;
import com.example.bookstoreapi.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/books")
public class BookstoreController {
    @Autowired
    private BookstoreRepository bookstoreRepository;

    @GetMapping
    private List<BookStore> getAllBooks(){return bookstoreRepository.findAll();}

    @PostMapping
    public BookStore createBook(@RequestBody BookStore bookStore){return bookstoreRepository.save(bookStore);}

    @GetMapping("{id}")
    public ResponseEntity<BookStore> getBookById(@PathVariable Long id){
        BookStore bookStore =bookstoreRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Book not found: " + id));
        return ResponseEntity.ok(bookStore);
    }
}
