package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private int id;
    private String name;
    private String surname;
    private int phone;

    public Person(int id, String name, String surname, int phone) {
    }

    public int getid() {
        return id;
    }
    public int getPhone(){
        return phone;
    }

}
