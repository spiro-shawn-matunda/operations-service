package com.spiro.operation.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Attendants {

    @Id
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "attendants_incidents",
            joinColumns = @JoinColumn(name = "attendant"),
            inverseJoinColumns = @JoinColumn(name = "incident")
    )
    private List<Incident> incidents;

    @Column(nullable = false, length = 10, unique = true)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private int nationalId;

    @Column(nullable = false)
    private String email;

    @ManyToOne(targetEntity = Status.class, optional = false)
    @JoinColumn(name = "Status")
    Status status;

    @Column
    private String homeAddress;


}