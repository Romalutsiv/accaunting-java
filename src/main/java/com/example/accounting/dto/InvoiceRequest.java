package com.example.accounting.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class InvoiceRequest {
//    LocalDateTime time;
    List<ProductItem> productItemList;
    String recipient;
    String sender;
    double price;
}
