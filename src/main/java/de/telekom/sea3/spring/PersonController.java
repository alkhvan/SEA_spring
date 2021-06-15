package de.telekom.sea3.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        super();
        System.out.println("PersonController is created: " + this.toString());
        System.out.println("PersonService: " + personService.toString());
        this.personService = personService;
    }
}
