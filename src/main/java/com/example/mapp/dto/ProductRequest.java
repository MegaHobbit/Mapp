package com.example.mapp.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProductRequest {

    private String name;
    private String description;
    private int quantity;
    private double buyingPrice;
    private double sellingPrice;
}
