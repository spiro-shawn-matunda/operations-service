package com.spiro.operation.dto;

public class AttendantsRequest {


    private String id;
    private String firstName;
    private String secondName;
    private int phoneNumber;
    private int nationalId;
    private String email;
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

    public void setId(String id) {
        this.id = id;
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
