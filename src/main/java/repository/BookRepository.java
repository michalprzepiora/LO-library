package repository;

import model.Book;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface BookRepository {

    void add(Book book) throws IOException;
    void add(List<Book> books) throws IOException;
    void remove(Book book);
    void remove(int id) throws IOException;
    List<Book> getAll() throws IOException;
    List<Book> getBooked();
    List<Book> getByTitle(String title);
    Book getById(int id) throws IOException;
    void update(Book newbook);

}
