package model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Rent {
    Person person;
    int readtime=14;
    LocalDate data;
    Duration termin = Duration.between(data.atStartOfDay(), LocalDate.now().atStartOfDay());

    public Rent(Person person, LocalDate data, Duration termin) {
        this.person = person;
        this.data = data.plusDays(readtime);
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

    public Duration getTermin() {
        return termin;
    }

    public void setTermin(Duration termin) {
        this.termin = termin;
    }
    public void clear(){
        setData(null);
        setPerson(null);
        setTermin(null);

    }
}