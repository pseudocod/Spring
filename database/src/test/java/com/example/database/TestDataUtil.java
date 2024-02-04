package com.example.database;

import com.example.database.domain.Author;
import com.example.database.domain.Book;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        Author author = Author.builder()
                .id(1L)
                .name("Mircea Bravo")
                .age(35)
                .build();
        return author;
    }

    public static Author createTestAuthorB() {
        Author author = Author.builder()
                .id(2L)
                .name("Mohamed Salah")
                .age(30)
                .build();
        return author;
    }

    public static Author createTestAuthorC() {
        Author author = Author.builder()
                .id(3L)
                .name("Darwin Nunez")
                .age(24)
                .build();
        return author;
    }

    public static Book createTestBookA() {
        Book book = Book.builder().
                isbn("978-1-2345-6789-0")
                .title("Puterea Prezentului")
                .authorId(1L)
                .build();
        return book;
    }
    public static Book createTestBookB() {
        Book book = Book.builder().
                isbn("978-1-2345-6789-1")
                .title("Harry Potter")
                .authorId(1L)
                .build();
        return book;
    }
    public static Book createTestBookC() {
        Book book = Book.builder().
                isbn("978-1-2345-6789-2")
                .title("Jurgen Klopp")
                .authorId(1L)
                .build();
        return book;
    }
    
}
