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

    @Id
    private Long id;
    private String name;
    private String description;
    private String category;
    private int amount;
    private double quantity;
    private double buyingPrice;
    private double sellingPrice;
    private ProductStatus status;
    private String supplier;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
