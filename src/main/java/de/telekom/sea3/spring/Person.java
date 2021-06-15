package de.telekom.sea3.spring;
import org.springframework.stereotype.Component;
import org.springframework.beans.*;

public class Person {
    private String name;
    private String surname;
    private String salutation;

    public Person() {
    }

    public Person(String name, String surname, String salutation) {
        this.name = name;
        this.surname = surname;
        this.salutation = salutation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
