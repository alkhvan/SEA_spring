package de.telekom.sea3.spring;

import de.telekom.sea3.spring.model.Person;
import de.telekom.sea3.spring.model.Personen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        super();
        System.out.println("PersonService is created: " + this.toString());
        System.out.println("PersonRepository: " + personRepository.toString());
        this.personRepository = personRepository;
    }
    public int size(){
        return personRepository.size();
    }
    public Personen getAll() {
        return new Personen(personRepository.getAll());
    }
    public Person get (int id)
    {
        return new Person(3,"Anna-Maria","Keller","Mrs","AM@mail.de","01.04.1989");
    }
    public Person add (Person person){
        personRepository.add(person);
        System.out.println("Person was added");
        return person;
    }
    public int delete(int id) {
        System.out.println("Person is removed.");
        personRepository.delete(id);
        return id;
    }
}
