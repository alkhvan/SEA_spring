package de.telekom.sea3.spring.view;


import de.telekom.sea3.spring.PersonService;
import de.telekom.sea3.spring.model.Personen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonRestController {

    private PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        super();
        this.personService = personService;
    }

    // URL: "http://localhost:8080/allpersons"
    @GetMapping("/allpersons")
    @ResponseBody()
    public String getAllPersons() {
        Personen personen=personService.getAllPersons();
 //       personen.toJson(); //
        String string1 = "{\n" +
                "  \"personen\": [\n" +
                "{\n" +
                "  \"person\": {\n" +
                "    \"name\": \"Paul\",\n" +
                "    \"surname\": \"Paulsen\",\n" +
                "    \"salutation\": \"Mr\"\n" +
                "  },\n" +
                "  \"person\": {\n" +
                "    \"name\": \"Paulina\",\n" +
                "    \"surname\": \"Mueller\",\n" +
                "    \"salutation\": \"Mrs\"\n" +
                "  },\n" +
                "  \"person\": {\n" +
                "    \"name\": \"Paulina\",\n" +
                "    \"surname\": \"Mueller\",\n" +
                "    \"salutation\": \"Mrs\"\n" +
                "  }\n" +
                "}\n" +
                "    ]\n" +
                "}";

        return string1;
    }
}
