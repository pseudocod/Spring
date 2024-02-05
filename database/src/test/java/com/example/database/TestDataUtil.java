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
                .age(55)
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

    public static Book createTestBookA(final Author author) {
        Book book = Book.builder().
                isbn("978-1-2345-6789-0")
                .title("Puterea Prezentului")
                .author(author)
                .build();
        return book;
    }
    public static Book createTestBookB(final Author author) {
        Book book = Book.builder().
                isbn("978-1-2345-6789-1")
                .title("Harry Potter")
                .author(author)
                .build();
        return book;
    }
    public static Book createTestBookC(final Author author) {
        Book book = Book.builder().
                isbn("978-1-2345-6789-2")
                .title("Jurgen Klopp")
                .author(author)
                .build();
        return book;
    }
    
}
