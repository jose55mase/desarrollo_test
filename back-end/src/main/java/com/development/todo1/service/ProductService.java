package com.development.todo1.service;

import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    /**
     * <h1>Servicios</h1>
     * Un manto para identificar las propiedades que se implementaran en el
     * reposirotio usando un CRUD (FindAll, Save, Update)
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-22
     */
    Optional<List<ProductEntity>> findAll();
    Optional<ProductEntity> save(ProductEntity productEntity);
    Optional<ProductEntity> upDate(ProductEntity productEntity);
}
