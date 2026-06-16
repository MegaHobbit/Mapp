package com.example.mapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department extends BaseEntity{

    private String depId;
    private String depName;
    private String depDescription;
}
