package com.example.accounting.dto;

import lombok.Data;
import lombok.Value;

@Value
public class ProductItem {
//    String id;
    String name;
    double price;
    int count;
//    Map<LocalDateTime, Double> prices;
}
