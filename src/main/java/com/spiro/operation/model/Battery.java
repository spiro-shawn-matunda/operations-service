package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Battery {

    @Id
    private String oem;
    @Column
    private String numberOfBatteries;
    @Column
    private String faultyBatteries;
    @Column
    private String numberOfChargers;
    @Column
    private LocalDateTime createdAt;


    @Column
    private LocalDateTime updatedAt;


    public String getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(String numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    public String getNumberOfChargers() {
        return numberOfChargers;
    }

    public void setNumberOfChargers(String numberOfChargers) {
        this.numberOfChargers = numberOfChargers;
    }

    public String getFaultyBattereies() {
        return faultyBatteries;
    }

    public void setFaultyBattereies(String faultyBattereies) {
        this.faultyBatteries = faultyBattereies;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
