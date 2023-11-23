package com.example.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JTChildTwo extends SuperClassForJT{
    private String childTwoField;
}
