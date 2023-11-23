package com.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="child_type", discriminatorType = DiscriminatorType.INTEGER)
public class SuperClassForST {
    @Id
    private Long superId;
    private String superField;
}

//Notes:
//No table produced for the child classes.
//Id can be inherited.
