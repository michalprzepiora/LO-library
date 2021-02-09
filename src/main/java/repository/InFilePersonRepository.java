package repository;

import model.Book;
import model.Person;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class InFilePersonRepository implements PersonRepository{
    @Override
    public void add(Person person) throws IOException {

    }

    @Override
    public void remove(int id) throws IOException {

    }

    @Override
    public List<Person> getAll() throws IOException {
        return null;
    }

    @Override
    public Optional<Person> getByPhone(int number) throws IOException {
        return Optional.empty();
    }

    @Override
    public Optional<Person> getById(int id) throws IOException {
        return Optional.empty();
    }

}
