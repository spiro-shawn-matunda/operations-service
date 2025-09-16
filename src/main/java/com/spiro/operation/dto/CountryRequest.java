package com.spiro.operation.dto;

import java.util.List;

public class CountryRequest {
    private String name;
    private List<String> stations;
    private String stationType;
    private String energyType;

    // Getters and setters
    public String getName()
    { return name; }



    public void setName(String name)
    { this.name = name; }

    public List<String> getStations()
    { return stations; }

    public void setStations(List<String> stations)
    { this.stations = stations; }

    public String getStationType()
    { return stationType; }

    public void setStationType(String stationType)
    { this.stationType = stationType; }

    public String getEnergyType()
    { return energyType; }

    public void setEnergyType(String energyType)
    { this.energyType = energyType; }
}
