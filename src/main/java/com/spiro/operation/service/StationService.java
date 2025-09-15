package com.spiro.operation.service;

import com.spiro.operation.model.PowerEvents;
import com.spiro.operation.model.Shift;
import com.spiro.operation.model.Station;
import com.spiro.operation.model.StationType;
import com.spiro.operation.repository.PowerRepository;
import com.spiro.operation.repository.StationRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StationService {
    private final StationRepository stationRepository;
    private final PowerRepository powerRepository;

    public StationService(StationRepository stationRepository, PowerRepository powerRepository) {
        this.powerRepository = powerRepository;
        this.stationRepository = stationRepository;
    }

    private final List<Station> stations = new ArrayList<>();
    private final List<PowerEvents> powerEvents = new ArrayList<>();

    public Station registerStation(String id, String name, String location, int batteryCapacity, StationType stationType) {
        Station station = new Station();
        station.setId(id);
        station.setName(name);
        station.setLocation(location);
        station.setBatteryCapacity(batteryCapacity);
        stations.add(station);
        return stationRepository.save(stations);


    }

    public Station getAllStations() {
        return stationRepository.findAll(stations);

    }

    public PowerEvents registerPowerEvent(String id, int agentId, String events, LocalDateTime startTime, LocalDateTime endTime) {
        PowerEvents powerEvent = new PowerEvents();
        powerEvent.setId(id);
        powerEvent.setAgentId(agentId);
        powerEvent.setEvents(events);
        powerEvent.setStartTime(startTime);
        powerEvent.setEndTime(endTime);

        powerEvents.add(powerEvent);
        return (PowerEvents) powerRepository.save(powerEvent);


    }

    public Shift registerShift(String agentId, LocalDateTime startTime, LocalDateTime endTime) {
        Shift shift = new Shift();
        shift.setAgentId(agentId);
        shift.setStartTime(startTime);
        shift.setEndTime(endTime);

        return (Shift) stationRepository.save(shift);
    }
}




