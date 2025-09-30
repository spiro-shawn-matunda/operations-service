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
            name = "ShiftRecordIncidents",
            joinColumns = @JoinColumn(name = "ShiftRecord"),
            inverseJoinColumns = @JoinColumn(name = "Incident")
    )
    List<Incident> incidents;

    @Column(nullable = false)
    private LocalDateTime timeOut;

    private String units;

    private String comments;

    @Column(updatable = false, unique = true)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String meterReading;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Attendants.class)
    @JoinTable(
            name = "Attendants_ShiftRecord",
            joinColumns = @JoinColumn(name = "Attendants_id"),
            inverseJoinColumns = @JoinColumn(name = "ShiftRecord-id")
    )
    List<Attendants> attendants;


}
