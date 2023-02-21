package com.example.storage;

import jakarta.persistence.*;
@Entity
class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private Integer pages;
    @Column(name = "release_year")
    private Integer year;

    public Book() {
    }

    public Book(String title, String author, String publisher, Integer pages, Integer year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getYear() {
        return year;
    }
}