package com.spiro.operation.service.impl;
import com.spiro.operation.dto.BatteryRequest;
import com.spiro.operation.dto.BatteryResponse;

import java.util.List;


public interface BatteryServiceImpl {




        BatteryResponse createBatteryRecord(BatteryRequest batteryRequest);
        BatteryResponse getBatteryRecordById(String id);
        List<BatteryResponse> getBatteryRecordsByAttendant(String attendantId);
        List<BatteryResponse> getAllBatteryRecords();
        BatteryResponse updateBatteryRecord(String id, BatteryRequest batteryRequest);
        void deleteBatteryRecord(String id);
        BatteryResponse getLatestBatteryRecordByAttendant(String attendantId);

}
