package repository;

import model.Person;

import java.io.*;
import java.util.List;

public  class PersonRespisitoryInfile implements PersonRepository {

    public void add(Person p) throws IOException{

       FileWriter ff = new FileWriter("persons.txt",true);
       ff.append(p.toString());
       ff.close();

    }


    @Override
    public List<Person> getAll() throws FileNotFoundException {
        return null;
        /*
        BufferedReader plik=new BufferedReader(new FileReader(new File("persons.txt")));
        System.out.println(plik.readLine());
        return

         */

    }

}
