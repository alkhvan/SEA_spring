package de.telekom.sea3.spring.model;
import org.springframework.stereotype.Component;
import org.springframework.beans.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="persons")
public class Person {
    @Id
    private Integer ID;
    @Column
    private String salutation;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private String birthdate;



    public Person(int ID,String name, String surname, String salutation, String email,String birthdate) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.salutation = salutation;
        this.email = email;
        this.birthdate = birthdate;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }



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
