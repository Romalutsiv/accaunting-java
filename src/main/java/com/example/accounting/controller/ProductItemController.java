package com.example.accounting.controller;

import com.example.accounting.model.ProductItemModel;
import com.example.accounting.service.ProductItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductItemController {
    private final ProductItemService productItemService;

    @GetMapping
    public List<ProductItemModel> getAll(){
        return productItemService.getAll();
    }

    @GetMapping("/{id}")
    public ProductItemModel getOne(@PathVariable(name = "id") String id){
        return productItemService.getOne(id);
    }
}
