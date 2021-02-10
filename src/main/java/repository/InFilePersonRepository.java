package repository;

import model.Book;
import model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        List<Person> personList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("person.csv"));
        String line;
        while((line = bufferedReader.readLine()) != null){
            personList.add(getPersonFromLine(line));
        }
        bufferedReader.close();
        return personList;
    }

    @Override
    public Optional<Person> getByPhone(int number) throws IOException {
        return Optional.empty();
    }

    @Override
    public Optional<Person> getById(int id) throws IOException {
        return Optional.empty();
    }
    private Person getPersonFromLine(String line) {
        String[] elements = line.split(",");
        int id = Integer.parseInt(elements[0]);
        String name = elements[1];
        String surname = elements[2];
        int phone = Integer.parseInt(elements[3]);
        return new Person(id, name, surname, phone);
    }


}
