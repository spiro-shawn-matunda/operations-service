package com.spiro.operation.service;

import com.spiro.operation.model.PowerEvent;
import com.spiro.operation.model.PowerEventType;
import com.spiro.operation.model.Status;
import com.spiro.operation.repository.PowerEventRepository;
import com.spiro.operation.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class PowerEventService {

    private final PowerEventRepository repository;
    private final StatusRepository statusRepository;

    @Autowired
    public PowerEventService(PowerEventRepository repository, StatusRepository statusRepository) {
        this.repository = repository;
        this.statusRepository = statusRepository;
    }

    public PowerEvent savePowerEvent(String id, LocalDateTime startTime, LocalDateTime endTime,
                                     PowerEventType powerEventType, LocalDateTime created, String statusId) {

        Status status = statusRepository.findById(statusId)
                .orElseThrow(() -> new RuntimeException("Status not found with id: " + statusId));

        if (id == null || id.isBlank()) {
            id = java.util.UUID.randomUUID().toString();
        }
        PowerEvent powerEvent = new PowerEvent(id, startTime, endTime, powerEventType, created);

        powerEvent.setStatus(status);

        return repository.save(powerEvent);
    }

    public List<PowerEvent> getPowerEvents() {
        return repository.findAll();
    }
}
