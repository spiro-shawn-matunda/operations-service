package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Attendant {

    @Id
    private String id;


    @Column(nullable = false)
    private String firstName;


    @Column(nullable = false)
    private String lastName;


    @Column(nullable = false)
    private String phoneNumber;


    private String email;

    @Column(nullable = false,unique = true)
    private int nationalId;

    private String homeAddress;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private String status;


}
