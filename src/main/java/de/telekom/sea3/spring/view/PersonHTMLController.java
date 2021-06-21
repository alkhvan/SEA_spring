package de.telekom.sea3.spring.view;

import de.telekom.sea3.spring.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonHTMLController {
    private static final String HTMLTEMPLATE = "<!DOCTYPE html> <html lang='de'>"
            + "<head><meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1.0'><title>Titel</title></head>"
            + "<body>size: %d</body></html>";
    private PersonService personService;

    @Autowired
    public PersonHTMLController(PersonService personService) {
        super();
        System.out.println("PersonController is created: " + this.toString());
        System.out.println("PersonService: " + personService.toString());
        this.personService = personService;
    }

    // URL: "http://localhost:8080/size"
    @GetMapping("/size")
    @ResponseBody()
    public String getSize() {
        String string1 = Integer.toString(personService.size());
        String string2 = String.valueOf(personService.size());
        String string3 = "" + personService.size();
        String string4 = String.format("%d", personService.size());
        String string5 = String.format(HTMLTEMPLATE, personService.size());

        return string5;
    }

    // URL:"http://localhost:8080/count"
    // URL:"http://localhost:8080/count"
    @GetMapping("/counter")  // Kein @ResponseBody, da es ... verhindert
    public String getCount(Model model,
                           @RequestParam(value="name",
                                   required=false,
                                   defaultValue="Max")
                                   String name
    ) {

        model.addAttribute("fullname", name); // "fullname" ist der fullname im HTML und name ist der Wert
        String htmlFileName="count";
        return htmlFileName;
    }

    // URL:"http://localhost:8080/count"
    @GetMapping("/size2")  // Kein @ResponseBody, da es ... verhindert
    public String getSize2(Model model) {
        model.addAttribute("size3", personService.size());
        return "size";
    }


}

