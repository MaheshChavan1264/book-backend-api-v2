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
public class AuthorDto {
    private long authorId;
    private String firstName;
    private String lastName;
    private Set<Books> books;
}
