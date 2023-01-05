package com.example.accounting.service.impl;

import com.example.accounting.model.ProductItemModel;
import com.example.accounting.repository.ProductItemRepo;
import com.example.accounting.service.ProductItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductItemServiceImpl implements ProductItemService {

    private final ProductItemRepo productItemRepo;
    @Override
    public List<ProductItemModel> getAll() {
        return productItemRepo.findAll();
    }

    @Override
    public ProductItemModel getOne(String id) {
        return productItemRepo.findById(id).get();
    }
}
