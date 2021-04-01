package repository;

import model.Person;

import java.io.*;
import java.util.List;

public  class PersonRespisitoryInfile implements PersonRepository {

    public void add(String p) throws IOException {
        FileWriter tekst=new FileWriter("persons.txt",true) ;
        tekst.write(p);
        tekst.close();

    }


    @Override
    public List<Person> getAll() {
        return null;
    }
}
