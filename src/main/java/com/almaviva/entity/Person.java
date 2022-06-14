package com.almaviva.entity;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    @Column ( name = "person_id")
    int id;

    @Column ( name = "person_first_name" )
    String firstName;

    @Column ( name = "person_last_name" )
    String lastname;

    @Column ( name= "person_age" )
    int age;


    //INIZIO METODI GETTER E SETTER_____________________________________________________________________________________
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
    //FINE METODI GETTER E SETTER_______________________________________________________________________________________


    public Person(){}


    public Person(String firstName, String lastname, int age) {

        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;

    }


    @Override
    public String toString() {

        return  "\n ID: " + id +
                "\n First Name: '" + firstName +
                "\n Last Name: " + lastname +
                "\n Age: " + age +
                "\n\n";

    }

}
