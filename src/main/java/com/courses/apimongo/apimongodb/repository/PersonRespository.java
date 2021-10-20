package com.courses.apimongo.apimongodb.repository;

import com.courses.apimongo.apimongodb.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRespository extends MongoRepository<Person, String> {
}
