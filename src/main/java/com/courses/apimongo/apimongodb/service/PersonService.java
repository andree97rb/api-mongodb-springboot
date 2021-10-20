package com.courses.apimongo.apimongodb.service;

import com.courses.apimongo.apimongodb.model.Person;
import com.courses.apimongo.apimongodb.repository.PersonRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRespository personRespository;

    public void save(Person person){
        personRespository.save(person);
    }

    public List<Person> findAll(){
        return personRespository.findAll();
    }

    public Optional<Person> findById(String id){
        return personRespository.findById(id);
    }

    public void deleteById(String id){
        personRespository.deleteById(id);
    }
}
