package com.example.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperClassForMS {
    @Id
    @GeneratedValue
    private Long superId;

    private String superField;
}

//Notes:
//Super class is not labelled an entity.
//All fields belonging to superclass and subclass will appear in the table for the subclass.
//Ancestors cannot contain associations with other entities.
//Cannot make use of NOT NULL constraints on subcless fields.