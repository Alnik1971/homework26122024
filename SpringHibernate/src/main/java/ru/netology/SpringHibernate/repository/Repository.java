package ru.netology.SpringHibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import ru.netology.SpringHibernate.entity.Person;

import java.util.List;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
@org.springframework.stereotype.Repository

public class Repository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
       return entityManager.createQuery("SELECT p FROM Person p WHERE p.cityOfLiving = :city").setParameter("city", city).getResultList();
    }
}


