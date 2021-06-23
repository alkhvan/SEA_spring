package de.telekom.sea3.spring;

import de.telekom.sea3.spring.model.Person;
import de.telekom.sea3.spring.model.Personen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepositoryDB personRepository;

    @Autowired
    public PersonService(PersonRepositoryDB personRepositoryDB) {
        super();
        System.out.println("PersonService is created: " + this.toString());
        System.out.println("PersonRepository: " + personRepositoryDB.toString());
        this.personRepository = personRepositoryDB;
    }
    public Long size(){
        return personRepository.count();
    }

    public Personen getAll() {
        Personen personen = new Personen();
        for (Person p : personRepository.findAll()) {
            personen.getPersonen().add(p);
        }
        return personen;
    }

    public Person get(Long id) {
        if (personRepository.findById(id).isPresent()) {
            return personRepository.findById(id).get();
        } else {
            return null;
        }
    }
    public Person add (Person person){
        personRepository.save(person);
        System.out.println("Person was added");
        return person;
    }
    public Person delete(Long id) {
        System.out.println("Person is removed.");
        personRepository.deleteById(id);
        return null;
    }
    public Person update(Person person) {
        personRepository.save(person);
        System.out.println("Person was changed!");
        return null;
    }
    public Person clear() {
       personRepository.deleteAll();
        System.out.println("Cleanup the list completely");
        return null;
    }
}
