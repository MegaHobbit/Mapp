package com.example.mapp.Models;


import com.example.mapp.Enums.ProductStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder

public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
