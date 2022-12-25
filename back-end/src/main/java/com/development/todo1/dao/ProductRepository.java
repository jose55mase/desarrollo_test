package com.development.todo1.dao;

import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
