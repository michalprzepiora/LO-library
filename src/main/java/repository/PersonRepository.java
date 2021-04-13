package repository;

import model.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface PersonRepository {
    void add(Person p) throws IOException, ClassNotFoundException;
    List<Person> getAll() throws FileNotFoundException;
}