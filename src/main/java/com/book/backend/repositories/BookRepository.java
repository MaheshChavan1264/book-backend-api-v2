package com.book.backend.repositories;

import com.book.backend.entities.Author;
import com.book.backend.entities.Books;
import com.book.backend.entities.Customer;
import com.book.backend.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Books, Long> {
    List<Books> findBooksByCustomer(Customer customer);
    List<Books> findBooksByAuthor(Author author);
    List<Books> findBooksByPublisher(Publisher publisher);
}
