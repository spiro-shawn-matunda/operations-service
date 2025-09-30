package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

public class BatteryHistory {
    @Id
    private String id;


    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "Battery")
    private Battery battery;


    @ManyToOne
    @JoinColumn(name = "Attendants_id")
    private Attendants attendants;

    @ManyToOne
    @JoinColumn(name = "Status_id")
    private Status status;


    @ManyToOne
    @JoinColumn(name = "Incident")
    private Incident Incident;


}
