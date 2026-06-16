package com.example.mapp.Models;

import com.example.mapp.Enums.ServicePointStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "servicePoint")

public class ServicePoint extends BaseEntity {

    private String  servicePointId;
    private String servicePointName;
    private String description;
    private ServicePointStatus status;
}
