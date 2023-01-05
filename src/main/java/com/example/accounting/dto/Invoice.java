package com.example.accounting.dto;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
@Value
public class Invoice {
    String id;
    LocalDateTime time;
    List<ProductItem> productItemList;
    String recipient;
    String sender;
    double price;
}
