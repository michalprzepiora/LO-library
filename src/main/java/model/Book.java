package model;


import java.io.Serializable;
import java.time.LocalDate;


public class Book implements Serializable {
    private String title;
    private String author;
    private int id;
    private int pages;
    private LocalDate addDate;

    public Book(String title, String author, int pages, int id, LocalDate addDate) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.id = id;
        this.addDate = addDate;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getId() {
        return id;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", pages=" + pages +
                ", addDate=" + addDate +
                '}';
    }
}
