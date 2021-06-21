package de.telekom.sea3.spring.view;


import de.telekom.sea3.spring.model.Person;
import de.telekom.sea3.spring.PersonService;
import de.telekom.sea3.spring.model.Size;
import de.telekom.sea3.spring.model.Personen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonRestController {

    private PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        super();
        this.personService = personService;
    }

    //** @see URL: <a href="http://localhost:8080/json/persons/all">http://localhost:8080/json/persons/all</a> */
    @GetMapping("/json/persons/all")
    public Personen getAllPersons() {
        Personen personen = personService.getAll();
        return personen;
    }

    @GetMapping("/json/persons/size")
    public Size getSize() {
        return new Size(personService.size());
    }

    @GetMapping("/json/person/{id}")	// {id}
    public Person getPerson(@PathVariable("id") int id) {
        return personService.get(id);
    }

    @PostMapping("/json/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.add(person);
    }

    @DeleteMapping("/json/person/{id}")
    public int deletePerson(@PathVariable("id") int id) {
        return personService.delete(id);
    }


}
