package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

public class BatteryHistory {
    @Id
    private String id;



    @ManyToOne
    @JoinColumn(name = "battery_Oem")
    private Battery battery;

    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "Incident_id")
    private Incident incidents;

    @ManyToOne
    @JoinColumn(name = "Attendants_id")
    private Attendants attendants;

    @ManyToOne
    @JoinColumn(name = "Status_id")
    private Status status;

}
