package com.spiro.operation.service;

import com.spiro.operation.dto.AttendantsRequest;
import com.spiro.operation.dto.AttendantsResponse;
import com.spiro.operation.model.Attendants;
import com.spiro.operation.repository.AttendantRepository;
import com.spiro.operation.service.impl.AttendantsServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AttendantsService implements AttendantsServiceImpl {

    private final AttendantRepository attendantRepository;

    public AttendantsService(AttendantRepository attendantRepository) {
        this.attendantRepository = attendantRepository;
    }


    public AttendantsResponse createAttendants(AttendantsRequest attendantRequest) {
        if (attendantRepository.existsByPhoneNumber(attendantRequest.getPhoneNumber())) {
            throw new IllegalArgumentException("Attendant with phone number '" + attendantRequest.getPhoneNumber() + "' already exists");
        }


        if (attendantRequest.getEmail() != null && !attendantRequest.getEmail().isEmpty() &&
                attendantRepository.existsByEmail(attendantRequest.getEmail())) {
            throw new IllegalArgumentException("Attendant with email '" + attendantRequest.getEmail() + "' already exists");
        }


        Attendants attendant = new Attendants();
        attendant.setFirstName(attendantRequest.getFirstName());
        attendant.setSecondName(attendantRequest.getSecondName());
        attendant.setPhoneNumber(attendantRequest.getPhoneNumber());
        attendant.setEmail(attendantRequest.getEmail());

        Attendants savedAttendant = attendantRepository.save(attendant);
        return convertToResponse(savedAttendant);


    }

    public List<AttendantsResponse> getAllAttendants() {
        List<Attendants> attendants = attendantRepository.findAll();
        return attendants.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    public List<AttendantsResponse> getAttendantsByStation(int nationalId) {
        List<Attendants> attendants = attendantRepository.findBynationalId(nationalId);
        return attendants.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }


    public Optional<AttendantsResponse> updateAttendant(String id, AttendantsRequest attendantRequest) {
        Optional<Attendants> existingAttendant = attendantRepository.findById(id);
        if (existingAttendant.isPresent()) {
            Attendants attendant = existingAttendant.get();


            if (!attendant.getPhoneNumber().equals(attendantRequest.getPhoneNumber()) &&
                    attendantRepository.existsByPhoneNumber(attendantRequest.getPhoneNumber())) {
                throw new IllegalArgumentException("Attendant with phone number '" + attendantRequest.getPhoneNumber() + "' already exists");
            }


            if (attendantRequest.getEmail() != null &&
                    !attendantRequest.getEmail().equals(attendant.getEmail()) &&
                    attendantRepository.existsByEmail(attendantRequest.getEmail())) {
                throw new IllegalArgumentException("Attendant with email '" + attendantRequest.getEmail() + "' already exists");
            }

            attendant.setFirstName(attendantRequest.getFirstName());
            attendant.setSecondName(attendantRequest.getSecondName());
            attendant.setPhoneNumber(attendantRequest.getPhoneNumber());
            attendant.setEmail(attendantRequest.getEmail());

            Attendants updatedAttendants = attendantRepository.save(attendant);
            return Optional.of(convertToResponse(updatedAttendants));
        }
        return Optional.empty();
    }

    private AttendantsResponse convertToResponse(Attendants attendant) {
        AttendantsResponse response = new AttendantsResponse();
        response.setFirstName(attendant.getFirstName());

        response.setSecondName(attendant.getSecondName());
        response.setPhoneNumber(attendant.getPhoneNumber());
        response.setEmail(attendant.getEmail());
        response.setCreatedAt(attendant.getCreatedAt());
        response.setUpdatedAt(attendant.getUpdatedAt());
        return response;
    }


    @Override
    public AttendantsResponse createAttendant(AttendantsRequest request) {
        return null;
    }
}


