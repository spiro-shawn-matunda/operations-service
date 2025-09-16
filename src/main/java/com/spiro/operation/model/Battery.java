package com.spiro.operation.model;

<<<<<<< HEAD
public class Battery {

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
        return faultyBattereies;
    }

    public void setFaultyBattereies(String faultyBattereies) {
        this.faultyBattereies = faultyBattereies;
    }

    private String numberOfBatteries;
    private String faultyBattereies;
    private String numberOfChargers;

=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Battery {

    @Id
    private String Oem;

    private String faulty;

    private String numberOfBatteries;

    private String numberOfChargers;

    private String numberOfFaultyChargers;

    @Column(nullable = false)
    private String status;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private LocalDateTime updatedAt;


>>>>>>> ff6186cba3e1e67e46a49426490410f05ec38c5b
}
