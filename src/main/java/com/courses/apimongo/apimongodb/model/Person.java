package com.courses.apimongo.apimongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "People")
@Data
public class Person {
    @Id
    private String id;
    private String names;
    private String lastname;
    private String email;
    private Integer age;
}
