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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBatteryOEM() {
        return batteryOEM;
    }

    public void setBatteryOEM(String batteryOEM) {
        this.batteryOEM = batteryOEM;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
