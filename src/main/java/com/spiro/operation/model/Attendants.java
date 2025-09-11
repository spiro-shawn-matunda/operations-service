package com.spiro.operation.model;

import jakarta.persistence.Entity;

@Entity
public class Attendants {


    private String firstName;
    private String secondName;
    private int phoneNumber;
    private int nationalId;
    private String email;
    private String homeAddress;

    public Attendants (String firstName,String secondName,int phoneNumber,int nationalId,String email,String homeAddress){
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.nationalId =nationalId;
        this.email = email ;
        this.homeAddress = homeAddress;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getPhoneNumber() {
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


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhoneNumber(int phoneNumber) {
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
