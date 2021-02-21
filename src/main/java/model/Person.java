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
    private String adDate;

    public int getid() {
        return id;
    }
    public int getPhone(){
        return phone;
    }

}
