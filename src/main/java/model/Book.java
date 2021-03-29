package model;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private int id;
    private LocalDate addDate;

    public Book(String title, String author, String publisher, int pages, int id, LocalDate addDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.id = id;
        this.addDate = addDate;
    }
}
