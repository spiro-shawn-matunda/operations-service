package com.spiro.operation.service.impl;

import com.spiro.operation.dto.AttendantsRequest;
import com.spiro.operation.dto.AttendantsResponse;

import java.util.List;

public interface AttendantsServiceImpl {
    AttendantsResponse createAttendant(AttendantsRequest request);
    List<AttendantsResponse> getAllAttendants();
}
