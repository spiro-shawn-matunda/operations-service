package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ShiftRecord {

    @Id
    private String id;

    @Column(nullable = false)
    private LocalDateTime timeIn;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status",nullable = false)
    Status status;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "ShiftRecord_Incidents",
            joinColumns = @JoinColumn(name = "ShiftRecord_id"),
            inverseJoinColumns = @JoinColumn(name = "Incident_id")
    )
    List<Incident> incidents;

    @Column(nullable = false)
    private LocalDateTime timeOut;


    @Column(nullable = false)
    private String units;

    private String comments;

    @Column(updatable = false, unique = true)
    private LocalDateTime createdAt;




}
