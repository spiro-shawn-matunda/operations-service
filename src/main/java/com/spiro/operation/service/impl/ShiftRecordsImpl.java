package com.spiro.operation.service.impl;
import com.spiro.operation.dto.ShiftRecordsRequest;
import com.spiro.operation.dto.ShiftRecordsResponse;

import java.time.LocalDateTime;
import java.util.List;

public interface ShiftRecordsImpl {

        ShiftRecordsResponse createShiftRecord(ShiftRecordsRequest shiftRequest);
        ShiftRecordsResponse getShiftRecordById(String id);
        List<ShiftRecordsResponse> getShiftRecordsByAttendant(String attendantId);
        List<ShiftRecordsResponse> getAllShiftRecords();
        ShiftRecordsResponse updateShiftRecord(String id, ShiftRecordsRequest shiftRequest);
        void deleteShiftRecord(String id);
        ShiftRecordsResponse getLatestShiftRecordByAttendant(String attendantId);
        List<ShiftRecordsResponse> getShiftRecordsByDateRange(LocalDateTime startDate, LocalDateTime endDate);
        List<ShiftRecordsResponse> getShiftRecordsByAttendantAndDateRange(String attendantId, LocalDateTime startDate, LocalDateTime endDate);
        ShiftRecordsResponse clockOut(String shiftRecordId, LocalDateTime timeOut, String comments);
    }

