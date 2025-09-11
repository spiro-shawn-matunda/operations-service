package com.spiro.operation.repository;


import com.spiro.operation.model.Attendants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendantRepository extends JpaRepository<Attendants, String> {
    List<Attendants> findByfirstName(String Attendants);

}
