package com.almaviva.service;

import com.almaviva.entity.Person;

import java.util.List;
import java.util.Map;

public interface ServiceInterface {

    //CREATE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    Person createPerson ( Person person );

    //READ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    List<Person> readPeople ();

    //UPDATE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    Person updatePerson ( Person person );

    //DELETE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    boolean deletePerson ( int id );
}
