package com.book.backend.dto;

import com.book.backend.entities.Books;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PublisherDto {
    private long publisherId;
    private String country;
    private Set<Books> books;
}
