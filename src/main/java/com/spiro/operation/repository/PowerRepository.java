package com.spiro.operation.repository;

import com.spiro.operation.model.PowerEvents;
import com.spiro.operation.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PowerRepository extends JpaRepository {
    Station save(List<PowerEvents> powerEvents);

}
