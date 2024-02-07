package com.example.database;

import com.example.database.domain.dto.AuthorDto;
import com.example.database.domain.dto.BookDto;
import com.example.database.domain.entities.AuthorEntity;
import com.example.database.domain.entities.BookEntity;

public final class TestDataUtil {
    private TestDataUtil() {
    }

    public static AuthorEntity createTestAuthorEntityA() {
        AuthorEntity authorEntity = AuthorEntity.builder()
                .id(1L)
                .name("Mircea Bravo")
                .age(55)
                .build();
        return authorEntity;
    }

    public static AuthorDto createTestAuthorDtoA() {
        AuthorDto authorDto = AuthorDto.builder()
                .id(1L)
                .name("Mircea Bravo")
                .age(55)
                .build();

        return authorDto;
    }

    public static AuthorEntity createTestAuthorEntityB() {
        AuthorEntity authorEntity = AuthorEntity.builder()
                .id(2L)
                .name("Mohamed Salah")
                .age(30)
                .build();
        return authorEntity;
    }

    public static AuthorEntity createTestAuthorEntityC() {
        AuthorEntity authorEntity = AuthorEntity.builder()
                .id(3L)
                .name("Darwin Nunez")
                .age(24)
                .build();
        return authorEntity;
    }

    public static BookEntity createTestBookEntityA(final AuthorEntity authorEntity) {
        BookEntity bookEntity = BookEntity.builder().
                isbn("978-1-2345-6789-0")
                .title("Puterea Prezentului")
                .authorEntity(authorEntity)
                .build();
        return bookEntity;
    }
    public static BookDto createTestBookDtoA(final AuthorDto author) {
        return BookDto.builder().
                isbn("978-1-2345-6789-0")
                .title("Puterea Prezentului")
                .author(author)
                .build();
    }
    public static BookEntity createTestBookEntityB(final AuthorEntity authorEntity) {
        BookEntity bookEntity = BookEntity.builder().
                isbn("978-1-2345-6789-1")
                .title("Harry Potter")
                .authorEntity(authorEntity)
                .build();
        return bookEntity;
    }
    public static BookEntity createTestBookEntityC(final AuthorEntity authorEntity) {
        BookEntity bookEntity = BookEntity.builder().
                isbn("978-1-2345-6789-2")
                .title("Jurgen Klopp")
                .authorEntity(authorEntity)
                .build();
        return bookEntity;
    }
    
}
