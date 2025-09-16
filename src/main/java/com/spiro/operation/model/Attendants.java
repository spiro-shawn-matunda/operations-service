package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "attendants")
public class Attendants {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String secondName;

    @Column(nullable = false, length = 10,unique = true)
    private String phoneNumber;

    @Column(nullable = false,unique = true)
    private int nationalId;

    @Column(nullable = false)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = ShiftRecords.class)
    @JoinTable(
        name = "Attendants_Shifts",
        joinColumns = @JoinColumn(name = "Shift_id"),
        inverseJoinColumns = @JoinColumn(name = "Attendant_id")
    )
    private List<ShiftRecords> shiftRecords;

    @Column
    private String homeAddress;

    @OneToMany(mappedBy = "attendant", fetch = FetchType.LAZY)
    private List<Battery> batteries;

    @ManyToOne(targetEntity = Country.class)
    @JoinColumn(name = "Country")
    Country country;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Status.class, optional = false)
    @JoinColumn(name = "Status")
    Status status;


    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

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