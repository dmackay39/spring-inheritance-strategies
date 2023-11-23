package com.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class STChildOne extends SuperClassForST{
    private String childOneField;
}
