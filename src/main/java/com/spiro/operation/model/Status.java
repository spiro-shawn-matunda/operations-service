package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Status {

    @Id
    private String id;

    @Column(length = 50)
    private String name;

    @Column(nullable = false)
    private String description;
}