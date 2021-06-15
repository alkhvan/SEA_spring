package de.telekom.sea3.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class PersonRepository {

    public PersonRepository() {
        super();
        System.out.println("PersonRepository is instantiated: " + this.toString());

    }
    public int getSize(){
      return 0;
    }
}
