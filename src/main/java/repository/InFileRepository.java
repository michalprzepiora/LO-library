package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class InFileRepository implements BookRepository {
    List<Book> books;

    public InFileRepository() {
        //todo
        // stworzyc plik jezeli niema lub odczytac
        // zdekodowac i zapisac do listy <Book>
        //dodac do books

        books = new ArrayList<>();
    }

    public void add(Book book) {
        //todo
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getAll() {
        return new ArrayList<>(books);
    }

    public List<Book> getBooked() {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isBooked()) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }
}
