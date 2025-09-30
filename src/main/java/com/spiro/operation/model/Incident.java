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

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status",nullable = false)
    Status status;

    private String bikeRegistration;

    @ManyToOne(targetEntity =Stations.class)
    @JoinColumn(name = "Station",nullable = false)
    Stations stations;


    @Column(length = 500)
    private String Description;




}
