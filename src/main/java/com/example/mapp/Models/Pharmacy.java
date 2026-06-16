package com.example.mapp.Models;

import com.example.mapp.Enums.PharmStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pharmacy")

public class Pharmacy extends BaseEntity {

    private PharmStatus status;
    private Long quantity;
}
