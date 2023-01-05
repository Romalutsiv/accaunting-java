package com.example.accounting.model;

import com.example.accounting.dto.ProductItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
@Document
@Getter
@Setter
@NoArgsConstructor
public class InvoiceModel {
    @Id
    private String id;
    private LocalDateTime time;
    private List<ProductItem> productItemList;
    private String recipient;
    private String sender;
    private double price;

}
