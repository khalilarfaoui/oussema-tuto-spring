package com.spring.tuto.repository;

import com.spring.tuto.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
;


public interface PersonRepository extends JpaRepository<Person, Integer> {
}
