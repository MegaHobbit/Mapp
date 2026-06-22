package com.example.mapp.dto;

import lombok.Builder;

@Builder

public class InventoryResponse {

    private String skuCode;
    private boolean inStock;
    private String message;
}
