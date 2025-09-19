package com.spiro.operation.repository;

import com.spiro.operation.model.Attendants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendantRepository extends JpaRepository<Attendants, String> {
}
