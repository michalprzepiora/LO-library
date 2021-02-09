import model.Book;
import repository.BookRepository;
import repository.InFileBookRepository;

import java.io.IOException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {


        BookRepository inFileRepo = new InFileBookRepository();

        Optional<Book> optionalBook = inFileRepo.getById(8);

        if (optionalBook.isPresent()) {
            System.out.println(optionalBook.get());
        } else {
            System.out.println("Brak takiego ID.");
        }
        Optional.ofNullable(null);
    }


}
