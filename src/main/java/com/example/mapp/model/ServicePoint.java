package com.example.mapp.model;

import com.example.mapp.Enum.ServicePointStatus;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class ServicePoint extends BaseEntity {

    private String  servicePointId;
    private String servicePointName;
    private String description;
    private ServicePointStatus status;



}
