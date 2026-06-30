package com.example.mapp.model;

import com.example.mapp.Enum.ProductStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity

public class LabTest extends BaseEntity {

    private Long testId;
    private String description;
    private String category;
    private BigDecimal amount;
    private Long quantity;
    private ProductStatus status;

    @ManyToOne
    @JoinColumn(name = "lab_id")
    private Lab lab;

}
