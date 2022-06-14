package com.almaviva;

import com.swagger.client.codgen.rest.api.PersonControllerApi;
import com.swagger.client.codgen.rest.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ( "/person-controller" )
public class AlmavivaCustomSwaggerBufferController {

    @Autowired
    private PersonControllerApi personControllerApi;


    //CREATE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @PostMapping ( "/create" )
    public Person createPerson ( @RequestBody Person person ) {

        return personControllerApi.createPersonUsingPOST( person );
    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //READ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @GetMapping ( "/read" )
    public List<Person> readPeople () {

        return personControllerApi.readPeopleUsingGET();
    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //UPDATE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @PutMapping ( "/update/{id}" )
    public Person updatePerson ( @PathVariable int id, @RequestBody Person person ) {

        return personControllerApi.updatePeopleUsingPUT( id, person );
    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


    //DELETE::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    @DeleteMapping ( "/delete/{id}" )
    public boolean deletePerson ( @PathVariable int id ) {

        return personControllerApi.deletePersonUsingDELETE( id );
    }
    //;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
}
