package repository;

import model.Book;
import model.Person;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    void add(Person person) throws IOException;

    void remove(int id) throws IOException;

    List<Person> getAll() throws IOException;

    Optional<Person> getByPhone(int number) throws IOException;

    Optional<Person> getById(int id) throws IOException;

}
