package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "batteries")
public class Battery {

    @Id
    private String id;
    @Column
    private String numberOfBatteries;
    @Column
    private String faultyBatteries;
    @Column
    private String numberOfChargers;
    @Column
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "attendant_id")
    private Attendants attendant;

    public Attendants getAttendant() {
        return attendant;
    }

    public void setAttendant(Attendants attendant) {
        this.attendant = attendant;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getFaultyBatteries() {
        return faultyBatteries;
    }

    public void setFaultyBatteries(String faultyBatteries) {
        this.faultyBatteries = faultyBatteries;
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
