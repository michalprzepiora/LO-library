package repository;

import model.Book;
import model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InFileBookRepository implements BookRepository {
    private final static String DATABASE_FILENAME = "database.csv";


    @Override
    public void add(Book book) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(DATABASE_FILENAME, true));
        writer.println(getCsvLine(book));
        writer.close();
    }

    @Override
    public void add(List<Book> books) throws IOException {
        for (Book book : books) {
            add(book);
        }
    }

    @Override
    public void remove(Book book) {

    }

    @Override
    public void remove(int id) throws IOException {
        List<Book> allBooks = getAll();
        List<Book> result = allBooks.stream().filter(book -> book.getId() != id).collect(Collectors.toList());
        overrideAllBooks(result);
    }

    @Override
    public List<Book> getAll() throws IOException {
        List<Book> bookList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("database.csv"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bookList.add(getBookFromLine(line));
        }
        bufferedReader.close();
        return bookList;
    }

    @Override
    public List<Book> getBooked() throws IOException {
        List<Book> result = new ArrayList<>();
        for (Book book : getAll()) {
            if (book.isBooked()) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> getByTitle(String title) throws IOException {
        List<Book> result = new ArrayList<>();
        for (Book book : getAll()) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getByTitleAdv(String title) throws IOException {
        String titleLowerCase = title.toLowerCase();
        ArrayList<Book> bookList = new ArrayList<>();
        for (Book book : getAll()) {
            String lowercase = book.getTitle().toLowerCase();
            if (lowercase.contains(titleLowerCase)) {
                bookList.add(book);
            }
        }
        return bookList;
    }


    @Override
    public Optional<Book> getById(int id) throws IOException {
        for (Book book : getAll()) {
            if (book.getId() == id) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public void update(Book newBook) {
    }

    private String getCsvLine(Book book) {
        StringBuilder builder = new StringBuilder();
        builder.append(book.getId());
        builder.append(",");
        builder.append(book.getTitle());
        builder.append(",");
        builder.append(book.getAuthor());
        builder.append(",");
        builder.append(book.getPages());
        builder.append(",");
        builder.append(book.isBooked());

        return builder.toString();
    }

    private Book getBookFromLine(String line) {
        String[] elements = line.split(",");
        int id = Integer.parseInt(elements[0]);
        String title = elements[1];
        String author = elements[2];
        int pages = Integer.parseInt(elements[3]);
        boolean isBooked = Boolean.parseBoolean(elements[4]);
        return new Book(id, title, author, pages, isBooked);
    }

    private void overrideAllBooks(List<Book> books) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(DATABASE_FILENAME, false));
        for (Book book : books) {
            writer.println(getCsvLine(book));
        }
        writer.close();
    }
}
