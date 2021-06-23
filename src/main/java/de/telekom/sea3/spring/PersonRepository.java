package de.telekom.sea3.spring;
import de.telekom.sea3.spring.model.Person;
import de.telekom.sea3.spring.model.Personen;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepository {
    private List<Person> personen = new ArrayList<Person>();

    public PersonRepository() {
        super();
        System.out.println("PersonRepository is instantiated: " + this.toString());

    }
    public int size() {
        return personen.size();
    }

    public boolean add(Person person) {
        return personen.add(person);
    }

    public List<Person> getAll() {
        return personen;
    }


    public void delete(int id) {
        System.out.println("Size: " + personen.size());
        for (int i = 0; i < personen.size(); i++) {
            if (personen.get(i).getID() == id) {
                System.out.println(String.format("Id: %s will removed",personen.get(i).getID()));
                personen.remove(i);
            }
        }
        System.out.println("Size: " + personen.size());
    }
    public boolean update(Person person) {
        for (int i = 0; i < personen.size(); i++) {
            Person person1 = personen.get(i);
            if (person1.getID().equals(person.getID())) {
                personen.set(i, person);
                return true;
            }
        }
        return false;
    }
}
