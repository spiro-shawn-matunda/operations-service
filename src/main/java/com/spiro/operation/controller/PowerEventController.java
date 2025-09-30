package com.spiro.operation.controller;

import com.spiro.operation.dto.PowerEventRequest;
import com.spiro.operation.model.PowerEvent;
import com.spiro.operation.service.PowerEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spiro.operation.repository.StatusRepository;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/power-events")
public class PowerEventController {

    private final PowerEventService powerEventService;

    private static final Logger log = LoggerFactory.getLogger(PowerEventController.class); // ✅ Added logger

    @Autowired
    public PowerEventController(PowerEventService powerEventService) {
        this.powerEventService = powerEventService;
    }

    @PostMapping("/register")
    public PowerEvent registerPowerEvents(@RequestBody PowerEventRequest request) {
        log.info("Received PowerEvent registration request: ID={}, StatusID={}, Type={}, Start={}, End={}",
                request.getId(), request.getStatusId(), request.getPowerEventType(),
                request.getStartTime(), request.getEndTime());

        if (request.getStatusId() == null || request.getStatusId().isBlank()) {
            log.warn("PowerEvent registration failed: statusId is missing.");
            throw new IllegalArgumentException("statusId is required");
        }

        return powerEventService.savePowerEvent(
                request.getId(),
                request.getStartTime(),
                request.getEndTime(),
                request.getPowerEventType(),
                request.getCreated(),
                request.getStatusId()
        );
    }

    @GetMapping
    public List<PowerEvent> getAllEvents() {
        return powerEventService.getPowerEvents();
    }
}
