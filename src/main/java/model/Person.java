package model;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private int id;
    private String name;
    private String surname;
    private int phone;
    private  LocalDate birthDate;

    public Person(int id, String name, String surname, int phone,String adDate, LocalDate birthDate) {
    }

    public int getid() {
        return id;
    }
    public int getPhone(){
        return phone;
    }

    public boolean isAdult(){
        return true;
    }
}
