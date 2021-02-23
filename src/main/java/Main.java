import model.Book;
import model.Person;
import repository.BookRepository;
import repository.InFileBookRepository;
import repository.InFilePersonRepository;
import repository.PersonRepository;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {


//        BookRepository inFileRepo = new InFileBookRepository();
//        Book book = new Book(455, "Dziady 4", "Mickiewicz", 654, false);
//        inFileRepo.add(book);
//
//        System.out.println(inFileRepo.getAll());

        PersonRepository repo  = new InFilePersonRepository();
        Person person = new Person(2, "Kuba", "Nowak", 123456789, "2020-02-02", LocalDate.of(2004, 11, 26));
        //repo.add(person);

        //repo.getAll();
        System.out.println(person.isAdult());
    }
}
