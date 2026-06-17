package com.example.mapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Employees extends Person {

    private String employeeNumber;
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
