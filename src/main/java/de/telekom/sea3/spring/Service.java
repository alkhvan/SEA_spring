package de.telekom.sea3.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
    private PersonRepository personRepository;
    @Autowired
  public Service( PersonRepository personRepository ) { // <- dafür brauchen wir das interface PersonRepository
        this.personRepository = personRepository;
   }
}
