package model;

import java.util.Objects;

public class Book {

    private int id;
    private String title;
    private String author;
    private int pages;
    private boolean isBooked = false;

    public Book(int id, String title, String author, int pages, boolean isBooked) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isBooked = isBooked;
    }

    public Book(){

    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }




    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", id=" + id +
                '}';
    }
}
