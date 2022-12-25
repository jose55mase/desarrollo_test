package com.development.todo1.serviceImplement;

import com.development.todo1.dao.ProductRepository;
import com.development.todo1.dao.VehicleRepository;
import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.entity.ProductEntity;
import com.development.todo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImplement implements ProductService {

    @Autowired
    protected ProductRepository repository;

    @Override
    public Optional<List<ProductEntity>> findAll() {
        return Optional.of(repository.findAll().stream().collect(Collectors.toList()));
    }

    @Override
    public Optional<ProductEntity> save(ProductEntity productEntity) {
        return Optional.of(repository.save(productEntity));
    }

    @Override
    public Optional<ProductEntity> upDate(ProductEntity productEntity) {
        return Optional.of(repository.save(productEntity));
    }
}
