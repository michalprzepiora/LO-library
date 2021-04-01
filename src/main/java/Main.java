import model.Person;
import repository.PersonRespisitoryInfile;
import service.GeneratorId;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello World!!!!!");
        PersonRespisitoryInfile ah=new PersonRespisitoryInfile() ;
        Person paweł=new Person("paweł","kupis","pabloeskobar@haha.pl","997");
        System.out.println(paweł.);
        ah.add(paweł.toString());


    }
}
