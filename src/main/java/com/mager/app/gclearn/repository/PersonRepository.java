package com.mager.app.gclearn.repository;

import com.mager.app.gclearn.repository.entity.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person,Long> {
}
