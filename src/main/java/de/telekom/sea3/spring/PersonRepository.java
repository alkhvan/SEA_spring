package de.telekom.sea3.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {
    private List<Person> personen = new ArrayList<Person>();

    public PersonRepository() {
        super();
        System.out.println("PersonRepository is instantiated: " + this.toString());

    }
    public int getSize(){

        return personen.size();
    }

    public boolean add(Person person){
        return personen.add(person);
    }
    public List<Person> getAll() {
        return personen;
    }
}
