package com.example.accounting.repository;

import com.example.accounting.model.ProductItemModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductItemRepo extends MongoRepository<ProductItemModel, String> {
    Optional<ProductItemModel> findByName(String name);
}
