package com.kspoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kspoc.entities.Person;
import com.kspoc.repositories.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository repository;
	
	@GetMapping("/getAllPersons")
	public Iterable<Person> findAllPersons() {
		return repository.findAll();
	}

	@GetMapping("/findPerson/{id}")
	public Person findPersonById(@PathVariable("id") int id) {
		return repository.findById(101).get();
	}
}
