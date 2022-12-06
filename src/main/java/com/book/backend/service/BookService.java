package com.book.backend.service;

import com.book.backend.dto.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> getAllBooks();
    BookDto getBookById(long id);
    BookDto addBook(BookDto book);
    BookDto updateBookById(BookDto book, long id);
    void deleteBookById(long id);
}
