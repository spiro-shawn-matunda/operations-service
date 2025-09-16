package com.spiro.operation.service;

import com.spiro.operation.dto.BatteryRequest;
import com.spiro.operation.dto.BatteryResponse;
import com.spiro.operation.model.Attendants;
import com.spiro.operation.model.Battery;
import com.spiro.operation.repository.AttendantRepository;
import com.spiro.operation.repository.BatteryRepository;
import com.spiro.operation.service.impl.BatteryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class BatteryService implements BatteryServiceImpl {
        @Autowired
        private BatteryRepository batteryRepository;

        @Autowired
        private AttendantRepository attendantsRepository;

        @Override
        public BatteryResponse createBatteryRecord(BatteryRequest batteryRequest) {
            Optional<Attendants> attendantOptional = attendantsRepository.findById(batteryRequest.getAttendantId());

            if (attendantOptional.isEmpty()) {
                throw new RuntimeException("Attendant not found with id: " + batteryRequest.getAttendantId());
            }

            Attendants attendant = attendantOptional.get();

            Battery battery = new Battery();
            battery.setAttendant(attendant);
            battery.setNumberOfBatteries(batteryRequest.getNumberOfBatteries());
            battery.setFaultyBatteries(batteryRequest.getFaultyBatteries());
            battery.setNumberOfChargers(batteryRequest.getNumberOfChargers());
            battery.setCreatedAt(LocalDateTime.now());
            battery.setUpdatedAt(LocalDateTime.now());

            Battery savedBattery = batteryRepository.save(battery);

            return mapToResponse(savedBattery);
        }

        @Override
        public BatteryResponse getBatteryRecordById(String id) {
            Optional<Battery> batteryOptional = batteryRepository.findById(id);

            if (batteryOptional.isEmpty()) {
                throw new RuntimeException("Battery record not found with id: " + id);
            }

            return mapToResponse(batteryOptional.get());
        }

        @Override
        public List<BatteryResponse> getBatteryRecordsByAttendant(String attendantId) {
            List<Battery> batteries = batteryRepository.findByAttendantIdOrderByCreatedAtDesc(attendantId);
            return batteries.stream()
                    .map(this::mapToResponse)
                    .collect(Collectors.toList());
        }

        @Override
        public List<BatteryResponse> getAllBatteryRecords() {
            List<Battery> batteries = batteryRepository.findAll();
            return batteries.stream()
                    .map(this::mapToResponse)
                    .collect(Collectors.toList());
        }

        @Override
        public BatteryResponse updateBatteryRecord(String id, BatteryRequest batteryRequest) {
            Optional<Battery> batteryOptional = batteryRepository.findById(id);

            if (batteryOptional.isEmpty()) {
                throw new RuntimeException("Battery record not found with id: " + id);
            }

            Battery battery = batteryOptional.get();
            battery.setNumberOfBatteries(batteryRequest.getNumberOfBatteries());
            battery.setFaultyBatteries(batteryRequest.getFaultyBatteries());
            battery.setNumberOfChargers(batteryRequest.getNumberOfChargers());
            battery.setUpdatedAt(LocalDateTime.now());

            Battery updatedBattery = batteryRepository.save(battery);

            return mapToResponse(updatedBattery);
        }

        @Override
        public void deleteBatteryRecord(String id) {
            if (!batteryRepository.existsById(id)) {
                throw new RuntimeException("Battery record not found with id: " + id);
            }
            batteryRepository.deleteById(id);
        }

        @Override
        public BatteryResponse getLatestBatteryRecordByAttendant(String attendantId) {
            Optional<Battery> batteryOptional = batteryRepository.findFirstByAttendantIdOrderByCreatedAtDesc(attendantId);

            if (batteryOptional.isEmpty()) {
                throw new RuntimeException("No battery records found for attendant with id: " + attendantId);
            }

            return mapToResponse(batteryOptional.get());
        }

        private BatteryResponse mapToResponse(Battery battery) {
            BatteryResponse response = new BatteryResponse();
            response.setId(battery.getId());
            response.setAttendantId(battery.getAttendant().getId());
            response.setAttendantName(battery.getAttendant().getFirstName() + " " + battery.getAttendant().getSecondName());
            response.setNumberOfBatteries(battery.getNumberOfBatteries());
            response.setFaultyBatteries(battery.getFaultyBatteries());
            response.setNumberOfChargers(battery.getNumberOfChargers());
            response.setCreatedAt(battery.getCreatedAt());
            response.setUpdatedAt(battery.getUpdatedAt());

            return response;
        }
    }



