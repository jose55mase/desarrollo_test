package com.development.todo1.dao;

import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
}
