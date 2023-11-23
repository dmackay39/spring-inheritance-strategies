package com.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class STChildTwo extends SuperClassForST {
    private String childTwoField;
}
