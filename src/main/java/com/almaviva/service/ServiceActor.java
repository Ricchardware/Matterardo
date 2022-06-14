package com.almaviva.service;

import com.almaviva.entity.Person;
import com.almaviva.repository.DatabaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ServiceActor implements ServiceInterface{

    Logger log = LoggerFactory.getLogger( this.getClass() );

    @Autowired
    private DatabaseRepository inDatabase;


    //CREATE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @Override
    public Person createPerson ( Person person ){

        if ( checkJson( person ) || inDatabase.existsById( person.getId() )) {

            return new Person();

        }

        return inDatabase.save( person );

    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //READ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @Override
    public List<Person> readPeople () {

        List<Person> insideDatabase = new ArrayList<>();

        insideDatabase = inDatabase.findAll();

        if ( insideDatabase.size() < 1 ) {

            insideDatabase.add( new Person() );

            return insideDatabase;

        }

        return insideDatabase;

    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //UPDATE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @Override
    public Person updatePerson ( Person person ) {

        if ( checkJson( person ) || inDatabase.existsById( person.getId())) {

            return new Person();

        }

        return inDatabase.save( person );

    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //DELETE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @Override
    public boolean deletePerson ( int id ) {

        if ( inDatabase.existsById( id ) ) {

            inDatabase.deleteById(id);

        }

        return !inDatabase.existsById( id );


    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //IMPLEMENTED METHODS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private boolean checkJson ( Person person ) {

        return person.getFirstName().equals("") || person.getLastname().equals("") || person.getAge() < 1;

    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

}
