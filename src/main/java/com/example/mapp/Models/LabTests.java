package com.example.mapp.Models;

import com.example.mapp.Enums.ProductStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity

public class LabTests extends BaseEntity {

    private Long testId;
    private String description;
    private String category;
    private BigDecimal amount;
    private Long quantity;
    private ProductStatus status;

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Lab lab;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Products products;
}
