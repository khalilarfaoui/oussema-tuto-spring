package com.spring.tuto.controller;

import com.spring.tuto.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.tuto.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository ;


    @PostMapping("person/create")
    public Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @GetMapping("peroson/all")
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

    @GetMapping("findById/{id}")
    public Optional<Person> getPersonById(@PathVariable int id){
        return personRepository.findById(id);
    }


    @DeleteMapping("deleteById/{id}")
    public void deletePersonById(@PathVariable int id){
        personRepository.deleteById(id);
    }



}
