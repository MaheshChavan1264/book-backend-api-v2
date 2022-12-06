package com.book.backend.controller;

import com.book.backend.payloads.ApiResponse;
import com.book.backend.dto.BookDto;
import com.book.backend.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @GetMapping("/")
    public ResponseEntity<ApiResponse> apiHealthCheckup(){
        return new ResponseEntity<>(new ApiResponse("Our Api project is running",true), HttpStatus.OK);
    }

    @GetMapping("/getbooklist")
    public ResponseEntity<List<BookDto>> getAllBooks(){
        List<BookDto> allBooks = this.bookServiceImpl.getAllBooks();
        return new ResponseEntity<>(allBooks, HttpStatus.OK);
    }

    @GetMapping("/getbookbyid/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable(name="id") long id){
        return new ResponseEntity<>(this.bookServiceImpl.getBookById(id), HttpStatus.OK);
    }

    @PostMapping("/addbooks")
    public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto){
        BookDto newBook = this.bookServiceImpl.addBook(bookDto);
        return new ResponseEntity<>(newBook, HttpStatus.OK);
    }

    @PutMapping("/updatebookbyid/{id}")
    public ResponseEntity<BookDto> updateBookById( @RequestBody BookDto bookDto, @PathVariable(name="id") long id){
        BookDto updateBook = this.bookServiceImpl.updateBookById(bookDto, id);
        return new ResponseEntity<>(updateBook, HttpStatus.OK);
    }

    @DeleteMapping("/deletebookbyid/{id}")
    public ResponseEntity<ApiResponse> deleteBookById(@PathVariable(name="id") long id){
        this.bookServiceImpl.deleteBookById(id);
        return new ResponseEntity<>(new ApiResponse("Book deleted successfully", true), HttpStatus.OK);
    }
}
