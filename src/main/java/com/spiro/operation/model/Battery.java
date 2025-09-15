package com.spiro.operation.model;

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

}
