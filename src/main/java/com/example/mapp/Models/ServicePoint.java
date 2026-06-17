package com.example.mapp.Models;

import com.example.mapp.Enums.ServicePointStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity

public class ServicePoint extends BaseEntity {

    private String  servicePointId;
    private String servicePointName;
    private String description;
    private ServicePointStatus status;



}
