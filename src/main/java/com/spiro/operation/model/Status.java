package com.spiro.operation.model;

import jakarta.persistence.*;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    @Column(length = 50)
    private String name;

    @Column(nullable = false)
    private String description;




}