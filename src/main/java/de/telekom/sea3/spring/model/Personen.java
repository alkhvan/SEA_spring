package de.telekom.sea3.spring.model;

import de.telekom.sea3.spring.Person;

import java.util.ArrayList;
import java.util.List;

public class Personen {
    List<Person> personen = new ArrayList<Person>();

    public List<Person> getPersonen() {
        return personen;
    }

    public void setPersonen(List<Person> personen) {
        this.personen = personen;
    }

    public void toJson() {
    }
}
