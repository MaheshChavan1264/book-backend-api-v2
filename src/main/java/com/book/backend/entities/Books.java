package com.book.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long bookId;
    private String title;
    private String genre;
    private String type;
    private LocalDate publicationDate;
    private String condition;
    private double price;
    @ManyToOne
    @JoinColumn(name ="author_author_id", nullable = false)
    private Author author;
    @ManyToOne
    @JoinColumn(name ="publisher_publisher_id", nullable = false)
    private Publisher publisher;
}
