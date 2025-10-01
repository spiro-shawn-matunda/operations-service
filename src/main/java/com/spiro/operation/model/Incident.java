package com.spiro.operation.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Incident {
    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    private IncidentType type;


    private String customerId;

    @ManyToOne(targetEntity = Status.class, optional = false)
    @JoinColumn(name = "Status")
    Status status;

    private String bikeRegistration;

    @Column(length = 5000)
    private String Description;


    @Enumerated(EnumType.STRING)
    private Priority priority;


}
