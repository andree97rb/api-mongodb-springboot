package com.courses.apimongo.apimongodb.controller;

import com.courses.apimongo.apimongodb.model.Person;
import com.courses.apimongo.apimongodb.service.PersonService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Data
public class PersonController {
    private final PersonService personService;

    @PostMapping("/people")
    public void save(@RequestBody Person person){
        personService.save(person);
    }

    @GetMapping("/people")
    public List<Person> findAll(){
        return personService.findAll();
    }

    @GetMapping("/people/{id}")
    public Person findById(@PathVariable String id){
        return personService.findById(id).get();
    }

    @DeleteMapping("/people/{id}")
    public void deleteById(@PathVariable String id){
        personService.deleteById(id);
    }

    @PutMapping("/people/{id}")
    public void update(@RequestBody Person person){
        personService.save(person);
    }
}
