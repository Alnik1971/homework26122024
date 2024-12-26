package ru.netology.SpringHibernate.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.netology.SpringHibernate.entity.Person;
import ru.netology.SpringHibernate.repository.Repository;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    public Service(Repository repository){
        this.repository = repository;
    }

    public List<Person> getPersonByCity(String city){
        return repository.getPersonByCity(city);
    }
}
