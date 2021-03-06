package repository;

import model.Book;

public interface BookRepository {
    Book addBook(Book book);
    Book removeBook(Book book);
    Book getAll();
    Book getById(int id);
    Book getByName(String name);
}
