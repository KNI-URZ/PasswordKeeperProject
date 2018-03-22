package com.kni.spring.knispringproject.services;

import com.kni.spring.knispringproject.entities.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private Person person;

    public Person getPerson() {
        return new Person(1l, "Marek");
    }

}
