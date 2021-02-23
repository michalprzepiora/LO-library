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
    private String addDate;
    private  LocalDate birthDate;

    public Person(int id, String name, String surname, int phone,String addDate, LocalDate birthDate) {
    }

//    public int getPhone(){
//        return phone;
//    }

    public boolean isAdult(){
        int actualYear = LocalDate.now().getYear();
        int actualMonth = LocalDate.now().getMonthValue();
        int actualDay = LocalDate.now().getDayOfYear();
        int birthYear = birthDate.getYear();
        int birthMonth = birthDate.getMonthValue();
        int birthDay = birthDate.getDayOfYear();
        if (actualYear - birthYear < 18) {
            return false;
        }
        if (actualYear - birthYear > 18) {
            return true;
        }
        if (actualMonth > birthMonth) {
            return true;
        }
        if (actualMonth < birthMonth) {
            return false;
        }
        if (actualDay >= birthDay) {
            return true;
        }
        else {
            return false;
        }
    }
}
