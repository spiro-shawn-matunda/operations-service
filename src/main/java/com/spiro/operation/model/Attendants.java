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

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "attendants_incidents",
            joinColumns = @JoinColumn(name = "attendants_id"),
            inverseJoinColumns = @JoinColumn(name = "incident_id")
    )
    private List<Incident> incidents;

    @Column(nullable = false, length = 10, unique = true)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private int nationalId;

    @Column(nullable = false)
    private String email;

    @ManyToOne(targetEntity = Status.class, optional = false)
    @JoinColumn(name = "Status",nullable = false)
    Status status;

    @Column
    private String homeAddress;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = ShiftRecord.class)
    @JoinTable(
            name = "Attendants_ShiftRecord",
            joinColumns = @JoinColumn(name = "Attendants_id"),
            inverseJoinColumns = @JoinColumn(name = "ShiftRecord_id")
    )
    List<ShiftRecord> shiftRecords;
}