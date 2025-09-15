package com.spiro.operation.model;

import jakarta.persistence.*;

@Entity
public class Attendants {


    @Id
    @Column
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
    @Column
    private String homeAddress;


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