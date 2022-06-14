package com.almaviva.repository;

import com.almaviva.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseRepository extends JpaRepository<Person, Integer> {

    ///////////////////////////////////////////////////////////////////

}
