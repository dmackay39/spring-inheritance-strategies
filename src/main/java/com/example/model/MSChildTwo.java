package com.example.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class MSChildTwo extends SuperClassForMS{
    private String childTwoField;
}
