package com.book.backend.service.impl;

import com.book.backend.entities.Books;
import com.book.backend.exceptions.ResourceNotFoundException;
import com.book.backend.dto.BookDto;
import com.book.backend.repositories.BookRepository;
import com.book.backend.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDto> getAllBooks() {
        return this.bookRepository.findAll().stream().map(this::bookToBookDto).collect(Collectors.toList());
    }

    @Override
    public BookDto getBookById(long id) {
        Books newBook = this.bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book record", "ID: ", id));
        return this.bookToBookDto(newBook);
    }

    @Override
    public BookDto addBook(BookDto book) {
        return this.bookToBookDto(this.bookRepository.save(this.bookDtoToBook(book)));
    }

    @Override
    public BookDto updateBookById(BookDto book, long id) {
        Books updateBook = this.bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book record", "ID: ", id));
        updateBook.setTitle(book.getTitle());
        updateBook.setGenre(book.getGenre());
        updateBook.setType(book.getType());
        updateBook.setPublicationDate(book.getPublicationDate());
        updateBook.setCondition(book.getCondition());
        updateBook.setPrice(book.getPrice());
        updateBook.setAuthor(book.getAuthor());
        updateBook.setPublisher(book.getPublisher());
        return this.bookToBookDto(this.bookRepository.save(updateBook));
    }

    @Override
    public void deleteBookById(long id) {
        Books deleteBook = this.bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book record", "ID: ", id));
        this.bookRepository.delete(deleteBook);
    }

    public BookDto bookToBookDto(Books book){
        return this.modelMapper.map(book, BookDto.class);
    }
    public Books bookDtoToBook(BookDto bookDto){
        return this.modelMapper.map(bookDto, Books.class);
    }
}
