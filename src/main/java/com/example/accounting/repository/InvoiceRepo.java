package com.example.accounting.repository;

import com.example.accounting.model.InvoiceModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepo extends MongoRepository<InvoiceModel, String> {
}
