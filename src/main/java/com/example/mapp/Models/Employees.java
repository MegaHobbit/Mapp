package com.example.mapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employees extends Person {

    private String employeeNumber;
    private String accountNumber;

}
