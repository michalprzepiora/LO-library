package model;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Data
public class Person {

    private int id;
    private String name;
    private String surname;
    private int phone;
    private String addDate;
    private LocalDate birthDate;

    public Person(int id, String name, String surname, int phone, String addDate, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.addDate = addDate;
        this.birthDate = birthDate;
    }

    public boolean isAdult(){
       return birthDate.plusYears(18).isBefore(LocalDate.now());
    }
}
