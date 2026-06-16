package com.example.mapp.Models;
import com.example.mapp.Enums.RadStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "radiology")

public class Radiology extends BaseEntity {

    private String radiologyNumber;
    private BigDecimal price;
    private String description;
    private String category;
    private BigDecimal amount;
    private RadStatus radStatus;


}