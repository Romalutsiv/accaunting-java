package com.example.accounting.service;

import com.example.accounting.dto.Invoice;
import com.example.accounting.dto.InvoiceRequest;
import com.example.accounting.model.InvoiceModel;

import java.util.List;

public interface InvoiceService {
    List<InvoiceModel> getAll();
    InvoiceModel create(InvoiceRequest invoiceRequest);
    void delete(InvoiceModel invoice);
}
