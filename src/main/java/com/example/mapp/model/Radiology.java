package com.example.mapp.model;
import com.example.mapp.Enum.RadStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity

public class Radiology extends BaseEntity {

    private String radiologyNumber;
    private BigDecimal price;
    private String description;
    private String category;
    private BigDecimal amount;
    private RadStatus radStatus;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;



}