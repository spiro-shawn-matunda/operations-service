package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    @Column(nullable = false, unique = true)
    private String status;


    @Column(nullable = false, updatable = false)
    LocalDateTime created;
}
