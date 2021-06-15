package de.telekom.sea3.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        super();
        System.out.println("PersonService instanziert: " + this.toString());
        System.out.println("PersonRepository: " + personRepository.toString());
        this.personRepository = personRepository;
    }
}
