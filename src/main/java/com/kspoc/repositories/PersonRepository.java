package com.kspoc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kspoc.entities.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
