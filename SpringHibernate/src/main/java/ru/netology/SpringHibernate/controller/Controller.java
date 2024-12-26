package ru.netology.SpringHibernate.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringHibernate.entity.Person;
import ru.netology.SpringHibernate.service.Service;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RestController

public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/person/by-city")
    public List<Person> getPersonByCity(@RequestParam("city") String city){
        return service.getPersonByCity(city);
    }
}

