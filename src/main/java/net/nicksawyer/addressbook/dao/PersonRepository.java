package net.nicksawyer.addressbook.dao;

import org.springframework.data.repository.CrudRepository;

import net.nicksawyer.addressbook.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    public Person findOneByIdAndExpiresAtIsNull(int id);
    public Iterable<Person> findByExpiresAtIsNull();
}
