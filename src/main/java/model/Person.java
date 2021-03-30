package model;

public class Person {
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

}