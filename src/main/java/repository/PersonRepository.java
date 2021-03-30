package repository;

import model.Person;

import java.util.List;

public interface PersonRepository {
    void add();
    List<Person> getAll();
}