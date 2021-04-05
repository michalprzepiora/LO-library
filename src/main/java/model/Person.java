package model;

import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;
    String surname;
    String eMail;
    String number;

    public Person(String name, String surname, String eMail, String number) {
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNumber() {
        return number;
    }

    public void add() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", eMail='" + eMail + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}