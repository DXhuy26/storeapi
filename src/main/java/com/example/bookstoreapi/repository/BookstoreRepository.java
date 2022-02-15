package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookstoreRepository extends JpaRepository<BookStore, Long> {
}
