package repository;

import model.Book;
import model.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryRepository implements BookRepository {
    private final static String MEMORY = "memory.txt";

    private List<Book> books;

    public InMemoryRepository() {
        //todo
        // stworzyc plik jezeli nie ma lub odzczytać
        // zdekodowac i zapisac na listy <Book>
        // dodać do books
        books = new ArrayList<>();
    }

    public void add(Book book) {
        //todo
        book.setId(books.size() + 1);

        books.add(book);
    }

    @Override
    public void add(List<Book> books) throws IOException {
        for(Book bk:getAll()){
            add(bk);
        }

    }

    public void remove(Book book) {
        books.remove(book);
    }

    @Override
    public void remove(int id) {
        List<Book> result = getAll().stream().filter(bog -> bog.getId()!=id).collect(Collectors.toList());
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

    public Optional<Book> getById(int id){
//        Book result = null;
//        for (Book book : books) {
//            if (book.getId() == id){
//                result = book;
//                break;
//            }
//        }
        return Optional.empty();
    }

    public void update(Book newbook){
        books.remove(newbook.getId() - 1);
        books.add(newbook.getId() - 1, newbook);
    }
}
