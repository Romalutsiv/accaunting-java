package com.example.accounting.service;

import com.example.accounting.model.ProductItemModel;

import java.util.List;

public interface ProductItemService {
    List<ProductItemModel> getAll();
    ProductItemModel getOne(String id);
}
