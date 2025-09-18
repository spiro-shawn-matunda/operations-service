package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

public class BatteryHistory {
    @Id
    private String id;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "Battery_incidents",
            joinColumns = @JoinColumn(name = "battery_Oem"),
            inverseJoinColumns = @JoinColumn(name = "incident_id")
    )
    private List<Incident> incidents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Battery")
    private Battery battery;

    @Column(nullable = false,updatable = false)
    private LocalDateTime created;


}
