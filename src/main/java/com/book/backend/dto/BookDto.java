package com.book.backend.dto;

import com.book.backend.entities.Author;
import com.book.backend.entities.Publisher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private long bookId;
    private String title;
    private String genre;
    private String type;
    private LocalDate publicationDate;
    private String condition;
    private double price;
}
