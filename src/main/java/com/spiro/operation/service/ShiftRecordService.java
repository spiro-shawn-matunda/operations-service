package com.spiro.operation.service;

import com.spiro.operation.dto.ShiftRecordDTO;
import com.spiro.operation.dto.ShiftRecordRequest;
import com.spiro.operation.model.Incident;
import com.spiro.operation.model.ShiftRecord;
import com.spiro.operation.model.Status;
import com.spiro.operation.repository.ShiftRecordRepository;
import com.spiro.operation.repository.StatusRepository;
import com.spiro.operation.repository.IncidentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShiftRecordService {

    private final ShiftRecordRepository shiftRecordRepository;
    private final StatusRepository statusRepository;
    private final IncidentRepository incidentRepository;

    public ShiftRecordService(
            ShiftRecordRepository shiftRecordRepository,
            StatusRepository statusRepository,
            IncidentRepository incidentRepository) {
        this.shiftRecordRepository = shiftRecordRepository;
        this.statusRepository = statusRepository;
        this.incidentRepository = incidentRepository;
    }

    public ShiftRecordDTO createShiftRecord(ShiftRecordRequest request) {
        Status status = statusRepository.findById(request.getStatusId())
                .orElseThrow(() -> new RuntimeException("Status not found"));

        List<Incident> incidents = request.getIncidentIds() != null
                ? incidentRepository.findAllById(Collections.singleton(request.getIncidentIds()))
                : List.of();

        ShiftRecord shiftRecord = new ShiftRecord();
        shiftRecord.setId("SR-" + System.currentTimeMillis());
        shiftRecord.setTimeIn(request.getTimeIn());
        shiftRecord.setTimeOut(request.getTimeOut());
        shiftRecord.setUnits(request.getUnits());
        shiftRecord.setComments(request.getComments());
        shiftRecord.setCreatedAt(LocalDateTime.now());
        shiftRecord.setUpdatedAt(LocalDateTime.now());
        shiftRecord.setStatus(status);


        ShiftRecord saved = shiftRecordRepository.save(shiftRecord);
        return convertToDTO(saved);
    }

    public Optional<ShiftRecordDTO> getShiftRecordById(String id) {
        return shiftRecordRepository.findById(id).map(this::convertToDTO);
    }

    public List<ShiftRecordDTO> getAllShiftRecords() {
        return shiftRecordRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ShiftRecordDTO convertToDTO(ShiftRecord shiftRecord) {
        ShiftRecordDTO dto = new ShiftRecordDTO();
        dto.setId(shiftRecord.getId());
        dto.setTimeIn(shiftRecord.getTimeIn());
        dto.setTimeOut(shiftRecord.getTimeOut());
        dto.setUnits(shiftRecord.getUnits());
        dto.setComments(shiftRecord.getComments());
        dto.setCreatedAt(shiftRecord.getCreatedAt());
        dto.setUpdatedAt(shiftRecord.getUpdatedAt());

        return dto;
    }
}
