package de.telekom.sea3.spring;

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
    public int getSize(){
        return personRepository.getSize();
    }
    public Personen getAllPersons(){
        return new Personen();
    }
}
