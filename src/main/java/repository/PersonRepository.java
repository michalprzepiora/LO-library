package repository;

import model.Person;

import java.io.IOException;
import java.util.List;

public interface PersonRepository {
    void add(String p) throws IOException;
    List<Person> getAll();
}