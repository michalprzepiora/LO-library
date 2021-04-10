package model;


import java.time.LocalDate;
import java.util.Objects;


public class Book {
    private String title;
    private String author;
    private int id;
    private int pages;
    private LocalDate addDate;
    private Rent rent;

    public Book(String title, String author, int pages, int id, LocalDate addDate,Rent rent) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.id = id;
        this.addDate = addDate;
        this.rent=rent;
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

    public boolean isbooked(){

        if (rent.getPerson()==null &&rent.getData()==null && rent.getTermin()==null){
            System.out.println("pole jest puste");
            return false;
        }
        else{
            System.out.println("poje NIE JEST PUSTE");
            return true;
        }
    }
}
