package com.example.mapp.Models;

import com.example.mapp.Enums.LabStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "lab")
public class Lab extends BaseEntity{


    private String laboratoryNumber;
    private String labName;
    private LabStatus status;
}
