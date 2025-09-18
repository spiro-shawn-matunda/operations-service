package com.spiro.operation.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Attendants {


    @Id
    @Column
    private String id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String secondName;


    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Incident.class)
    @JoinTable(
            name = "attendants_incidents",
            joinColumns = @JoinColumn(name = "attendants_id"),
            inverseJoinColumns = @JoinColumn(name = "incident_id")
    )
    private List<Incident> incidents;

    @Column(nullable = false, length = 10,unique = true)
    private String phoneNumber;
    @Column(nullable = false,unique = true)
    private int nationalId;
    @Column(nullable = false)
    private String email;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status_id", referencedColumnName = "id")
    Status status;

    @Column
    private String homeAddress;


    @ManyToMany(fetch = FetchType.LAZY, targetEntity = ShiftRecord.class)
    @JoinTable(
            name = "Attendants_ShiftRecord",
            joinColumns = @JoinColumn(name = "Attendants_id"),
            inverseJoinColumns = @JoinColumn(name = "ShiftRecord_id")
    )
    List<ShiftRecord> shiftRecords;


    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNationalId() {
        return nationalId;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

}