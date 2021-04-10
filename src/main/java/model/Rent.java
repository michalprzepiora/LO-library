package model;



import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Rent {
    Person person;
    int readtime=14;
    LocalDate data;
    LocalDate termin;

    public Rent(Person person, LocalDate data, LocalDate termin) {
        this.person = person;
        this.data = data;
        this.termin = termin;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getTermin() {
        return termin;
    }

    public void setTermin(LocalDate termin) {
        this.termin = termin;
    }
    public void clear(){
        setData(null);
        setPerson(null);
        setTermin(null);

    }
}