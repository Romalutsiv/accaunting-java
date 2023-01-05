package com.example.accounting.service.impl;

import com.example.accounting.dto.Invoice;
import com.example.accounting.dto.InvoiceRequest;
import com.example.accounting.dto.ProductItem;
import com.example.accounting.model.InvoiceModel;
import com.example.accounting.model.ProductItemModel;
import com.example.accounting.repository.InvoiceRepo;
import com.example.accounting.repository.ProductItemRepo;
import com.example.accounting.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepo invoiceRepo;
    private final ProductItemRepo productItemRepo;


    @Override
    public List<InvoiceModel> getAll() {
        List<InvoiceModel> invoiceModels = invoiceRepo.findAll();
        return invoiceModels;
    }

    @Override
    public InvoiceModel create(InvoiceRequest invoiceRequest) {
        for (ProductItem product: invoiceRequest.getProductItemList()) {
            Optional<ProductItemModel> pr = productItemRepo.findByName(product.getName());
            ProductItemModel productItemModel;
            if (!pr.isEmpty()){
                productItemModel = pr.get();
                productItemModel.setCount(productItemModel.getCount() + product.getCount());
            } else {
                productItemModel = new ProductItemModel();
                productItemModel.setName(product.getName());
                productItemModel.setPrice(product.getPrice());
                productItemModel.setCount(product.getCount());
            }
            productItemRepo.save(productItemModel);
        }
        InvoiceModel invoiceModel = new InvoiceModel();
        invoiceModel.setPrice(invoiceRequest.getPrice());
        invoiceModel.setTime(LocalDateTime.now());
        invoiceModel.setRecipient(invoiceRequest.getRecipient());
        invoiceModel.setSender(invoiceRequest.getSender());
        invoiceModel.setProductItemList(invoiceRequest.getProductItemList());
        invoiceModel.setPrice(invoiceRequest.getPrice());
        invoiceModel = invoiceRepo.save(invoiceModel);
        return invoiceModel;
    }

    @Override
    public void delete(InvoiceModel invoice) {

    }
}
