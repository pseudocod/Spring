package com.example.database.services;

import com.example.database.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);
}
