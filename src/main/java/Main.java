import model.Book;
import repository.BookRepository;
import repository.InFileBookRepository;

import java.io.IOException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {


        BookRepository inFileRepo = new InFileBookRepository();
        Book book = new Book(455, "Dziady 4", "Mickiewicz", 654, false);
        inFileRepo.add(book);

        System.out.println(inFileRepo.getAll());
    }
}
