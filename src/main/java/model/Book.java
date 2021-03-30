package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private int id;
    private LocalDate addDate;

}
