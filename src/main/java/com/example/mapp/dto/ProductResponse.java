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

public class ProductResponse {

    private String name;
    private String description;
    private double quantity;
    private double buyingPrice;
    private double sellingPrice;
}
