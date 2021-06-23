package de.telekom.sea3.spring;

import de.telekom.sea3.spring.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepositoryDB extends CrudRepository<Person, Long> {

}
