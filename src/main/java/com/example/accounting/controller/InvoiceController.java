package com.example.accounting.controller;

import com.example.accounting.dto.Invoice;
import com.example.accounting.dto.InvoiceRequest;
import com.example.accounting.dto.ProductItem;
import com.example.accounting.model.InvoiceModel;
import com.example.accounting.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoice")
public class InvoiceController {
    private final InvoiceService invoiceService;

    @GetMapping
    public List<InvoiceModel> getAll(){
        return invoiceService.getAll();
    }
    @PostMapping
    public void add(@RequestBody InvoiceRequest invoiceRequest){
        invoiceService.create(invoiceRequest);
    }
}
