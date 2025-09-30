package com.spiro.operation.service;

import com.spiro.operation.dto.AttendantRequest;
import com.spiro.operation.model.Attendants;
import com.spiro.operation.repository.AttendantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttendantService {

    @Autowired
    private AttendantRepository attendantsRepository;

    public AttendantRequest createAttendant(AttendantRequest attendantRequest) {
        try {
            Attendants attendant = new Attendants();
            attendant.setId(attendantRequest.getId());
            attendant.setFirstName(attendantRequest.getFirstName());
            attendant.setLastName(attendantRequest.getLastName());
            attendant.setPhoneNumber(attendantRequest.getPhoneNumber());
            attendant.setNationalId(attendantRequest.getNationalId());
            attendant.setEmail(attendantRequest.getEmail());
            attendant.setHomeAddress(attendantRequest.getHomeAddress());

            Attendants savedAttendant = attendantsRepository.save(attendant);
            return convertToDTO(savedAttendant);

        } catch (Exception e) {
            throw new RuntimeException("Failed to create attendant: " + e.getMessage(), e);
        }
    }

    public AttendantRequest getAttendantById(String id) {
        try {
            Attendants attendant = attendantsRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Attendant not found with id: " + id));
            return convertToDTO(attendant);
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch attendant: " + e.getMessage(), e);
        }
    }


    public List<AttendantRequest> getAllAttendants() {
        try {
            return attendantsRepository.findAll().stream()
                    .map(this::convertToDTO)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch attendants: " + e.getMessage(), e);
        }
    }

    public AttendantRequest updateAttendant(String id, AttendantRequest attendantsRequest) {
        try {
            Attendants attendant = attendantsRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Attendant not found with id: " + id));

            attendant.setFirstName(attendantsRequest.getFirstName());
            attendant.setLastName(attendantsRequest.getLastName());
            attendant.setPhoneNumber(attendantsRequest.getPhoneNumber());
            attendant.setNationalId(attendantsRequest.getNationalId());
            attendant.setEmail(attendantsRequest.getEmail());
            attendant.setHomeAddress(attendantsRequest.getHomeAddress());

            Attendants updatedAttendant = attendantsRepository.save(attendant);
            return convertToDTO(updatedAttendant);

        } catch (Exception e) {
            throw new RuntimeException("Failed to update attendant: " + e.getMessage(), e);
        }
    }

    public void deleteAttendant(String id) {
        try {
            if (!attendantsRepository.existsById(id)) {
                throw new RuntimeException("Attendant not found with id: " + id);
            }
            attendantsRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Failed to delete attendant: " + e.getMessage(), e);
        }
    }

    private AttendantRequest convertToDTO(Attendants attendant) {
        AttendantRequest dto = new AttendantRequest();
        dto.setId(attendant.getId());
        dto.setFirstName(attendant.getFirstName());
        dto.setLastName(attendant.getLastName());
        dto.setPhoneNumber(attendant.getPhoneNumber());
        dto.setNationalId(attendant.getNationalId());
        dto.setEmail(attendant.getEmail());
        dto.setHomeAddress(attendant.getHomeAddress());

        return dto;
    }
}
