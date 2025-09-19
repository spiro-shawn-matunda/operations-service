package com.spiro.operation.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Attendants {

    @Id
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "attendants_incidents",
            joinColumns = @JoinColumn(name = "attendants"),
            inverseJoinColumns = @JoinColumn(name = "incident")
    )
    private List<Incident> incidents;

    @Column(nullable = false, length = 10, unique = true)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private int nationalId;

    @Column(nullable = false)
    private String email;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status")
    Status status;

    @Column
    private String homeAddress;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = ShiftRecord.class)
    @JoinTable(
            name = "Attendants_ShiftRecord",
            joinColumns = @JoinColumn(name = "Attendants"),
            inverseJoinColumns = @JoinColumn(name = "ShiftRecord")
    )
    List<ShiftRecord> shiftRecords;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incident> incidents) {
        this.incidents = incidents;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<ShiftRecord> getShiftRecords() {
        return shiftRecords;
    }

    public void setShiftRecords(List<ShiftRecord> shiftRecords) {
        this.shiftRecords = shiftRecords;
    }
}