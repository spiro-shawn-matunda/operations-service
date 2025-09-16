package com.spiro.operation.repository;

import com.spiro.operation.model.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, String> {

    List<Battery> findByAttendantId(String attendantId);

    List<Battery> findByAttendantIdOrderByCreatedAtDesc(String attendantId);

    @Query("SELECT b FROM Battery b WHERE b.attendant.id = :attendantId ORDER BY b.createdAt DESC")
    List<Battery> findLatestByAttendantId(@Param("attendantId") String attendantId);

    Optional<Battery> findFirstByAttendantIdOrderByCreatedAtDesc(String attendantId);

    long countByAttendantId(String attendantId);
}