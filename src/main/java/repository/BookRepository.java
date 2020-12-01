package repository;

import model.Book;

import java.util.List;

public interface BookRepository {
    void add(Book book);

    void remove(Book book);

    List<Book> getAll();

    List<Book> getBooked();

    List<Book> getByTitle(String title);

}
