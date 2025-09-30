package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class BatteryHistory {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Battery")
    private Battery battery;

    @Column(nullable = false,updatable = false)
    private LocalDateTime created;


    @ManyToOne(targetEntity = Incident.class)
    @JoinColumn(name = "Incidents", nullable = false)
   Incident incident;


}
