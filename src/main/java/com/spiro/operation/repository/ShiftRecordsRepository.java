package com.spiro.operation.repository;
import com.spiro.operation.model.ShiftRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ShiftRecordsRepository extends JpaRepository<com.spiro.operation.repository.ShiftRecordsRepository, String> {

        List<ShiftRecords> findByAttendantId(String attendantId);

        List<ShiftRecords> findByAttendantIdOrderByTimeInDesc(String attendantId);

        List<ShiftRecords> findByStationId(String stationId);

        List<ShiftRecords> findByLocation(String location);


        Optional<com.spiro.operation.repository.ShiftRecordsRepository> findFirstByAttendantIdOrderByTimeInDesc(String attendantId);

        long countByAttendantId(String attendantId);

        boolean existsByAttendantIdAndTimeInBetween(String attendantId, LocalDateTime startTime, LocalDateTime endTime);
    }

