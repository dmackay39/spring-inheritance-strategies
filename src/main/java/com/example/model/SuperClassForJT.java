package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class SuperClassForJT {
    @Id
    private Long superId;

    private String superField;
}

//Notes:
//Tables generated for both super class and child class.
//Tables have separated information. Super fields (apart from the id which is shared)
//only appear in the super table and child fields only appear in the child table.
