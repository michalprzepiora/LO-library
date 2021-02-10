package repository;

import model.Book;
import model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InFilePersonRepository implements PersonRepository{
    @Override
    public void add(Person person) throws IOException {

    }

    @Override
    public void remove(int id) throws IOException {
        List<Person> allPerson = getAll();
        List<Person> result = allPerson.stream().filter(person -> person.getId()!=id).collect(Collectors.toList());
        overrideAllPersons(result);
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
        for (Person person :getAll()){
            if (person.getid()==id){
                return Optional.of(person);
            }
        }
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
    private String getCsvLine(Person person){
        StringBuilder builder = new StringBuilder();
        builder.append(person.getId());
        builder.append(",");
        builder.append(person.getName());
        builder.append(",");
        builder.append(person.getSurname());
        builder.append(",");
        builder.append(person.getPhone());
        return builder.toString();
    }
    private void overrideAllPersons(List<Person> persons) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("person.csv",false));
        for (Person person:persons){
            printWriter.println(getCsvLine(person));
        }
        printWriter.close();
    }


}
