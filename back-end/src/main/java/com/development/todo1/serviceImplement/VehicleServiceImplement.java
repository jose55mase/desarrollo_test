package com.development.todo1.serviceImplement;

import com.development.todo1.dao.CandidateRepository;
import com.development.todo1.dao.VehicleRepository;
import com.development.todo1.entity.VehicleEntity;
import com.development.todo1.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class VehicleServiceImplement implements VehicleService {

    @Autowired
    protected VehicleRepository repository;

    @Override
    public Optional<List<VehicleEntity>> findAll() {
        return Optional.of(repository.findAll().stream().collect(Collectors.toList()));
    }

    @Override
    public Optional<VehicleEntity> save(VehicleEntity vehicleEntity) {
        return Optional.of(repository.save(vehicleEntity)) ;
    }

    @Override
    public Optional<VehicleEntity> upDate(VehicleEntity vehicleEntity) {
        return Optional.empty();
    }
}
