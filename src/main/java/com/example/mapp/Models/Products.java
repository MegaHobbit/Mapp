package com.example.mapp.Models;


import com.example.mapp.Enums.ProductStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder

public class Products extends BaseEntity {

    private String name;
    private String description;
    private String category;
    private int amount;
    private double quantity;
    private double buyingPrice;
    private double sellingPrice;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    private String supplier;

    private Boolean deletedFlag = false;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
