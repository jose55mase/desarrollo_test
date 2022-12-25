package com.development.todo1.service;

import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.entity.VehicleEntity;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    /**
     * <h1>Servicios</h1>
     * Un manto para identificar las propiedades que se implementaran en el
     * reposirotio usando un CRUD (FindAll, Save, Update)
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-23
     */
    Optional<List<VehicleEntity>> findAll();
    Optional<VehicleEntity> save(VehicleEntity vehicleEntity);
    Optional<VehicleEntity> upDate(VehicleEntity vehicleEntity);
}
