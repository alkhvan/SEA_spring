package de.telekom.sea3.spring;

import de.telekom.sea3.spring.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class MyRepository implements CrudRepository<Person, Long> {
    @Override
    public <S extends Person> S save(S s) {
        return null;
    }

    @Override
    public <S extends Person> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Person> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Person> findAll() {
        return null;
    }

    @Override
    public Iterable<Person> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Person> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
