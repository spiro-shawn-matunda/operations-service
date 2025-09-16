package com.spiro.operation.service;

import com.spiro.operation.dto.ShiftRecordsRequest;
import com.spiro.operation.dto.ShiftRecordsResponse;
import com.spiro.operation.model.Attendants;
import com.spiro.operation.repository.AttendantRepository;
import com.spiro.operation.repository.ShiftRecordsRepository;
import com.spiro.operation.service.impl.ShiftRecordsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ShiftRecordsService implements ShiftRecordsImpl {
    @Override
    public ShiftRecordsResponse createShiftRecord(ShiftRecordsRequest shiftRequest) {
        return null;
    }

    @Override
    public ShiftRecordsResponse getShiftRecordById(String id) {
        return null;
    }

    @Override
    public List<ShiftRecordsResponse> getShiftRecordsByAttendant(String attendantId) {
        return List.of();
    }

    @Override
    public List<ShiftRecordsResponse> getAllShiftRecords() {
        return List.of();
    }

    @Override
    public ShiftRecordsResponse updateShiftRecord(String id, ShiftRecordsRequest shiftRequest) {
        return null;
    }

    @Override
    public void deleteShiftRecord(String id) {

    }

    @Override
    public ShiftRecordsResponse getLatestShiftRecordByAttendant(String attendantId) {
        return null;
    }

    @Override
    public List<ShiftRecordsResponse> getShiftRecordsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return List.of();
    }

    @Override
    public List<ShiftRecordsResponse> getShiftRecordsByAttendantAndDateRange(String attendantId, LocalDateTime startDate, LocalDateTime endDate) {
        return List.of();
    }

    @Override
    public ShiftRecordsResponse clockOut(String shiftRecordId, LocalDateTime timeOut, String comments) {
        return null;
    }
}
