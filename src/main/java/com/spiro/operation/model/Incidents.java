// src/main/java/com/spiro/operation/model/Incidents.java
package com.spiro.operation.model;

import jakarta.persistence.*;

@Entity
public class Incidents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    private String customerId;
    private String batteryOEM;
    private String vehicleNo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IncidentType incidentType;

    @Column(length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne(targetEntity = Stations.class, optional = false)
    @JoinColumn(name = "status")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "attendant_id")
    private Attendant attendant;

    @ManyToOne
    @JoinColumn(name = "battery_id")
    private Battery battery;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
