package com.spiro.operation.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Battery {

    @Id
    private String Oem;

@Column(nullable = false)
    private boolean faulty;


    @Column(updatable = false,nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status_id", referencedColumnName = "id")
    Status status;

    @Column(updatable = false)
    private LocalDateTime updatedAt;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "Battery_incidents",
            joinColumns = @JoinColumn(name = "battery_Oem"),
            inverseJoinColumns = @JoinColumn(name = "incident_id")
    )
    private List<Incident> incidents;


    @OneToMany(fetch = FetchType.LAZY, targetEntity = BatteryHistory.class)
    @JoinTable(
            name = "Battery_BatteryHistory",
            joinColumns = @JoinColumn(name = "battery_Oem"),
            inverseJoinColumns = @JoinColumn(name = "batteryHistory_id")
    )
    private List<BatteryHistory> batteryHistoryList;

}
