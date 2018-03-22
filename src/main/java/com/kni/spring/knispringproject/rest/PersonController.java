package com.kni.spring.knispringproject.rest;

import com.kni.spring.knispringproject.entities.Person;
import com.kni.spring.knispringproject.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/one")
    public Person getPerson() {
        return personService.getPerson();
    }
}
