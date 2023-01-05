package com.example.accounting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
@Getter
@Setter
@NoArgsConstructor
public class ProductItemModel {
    @Id
    private String id;
    private String name;
    private double price;
    private int count;
//    Map<LocalDateTime, Double> prices;
}
