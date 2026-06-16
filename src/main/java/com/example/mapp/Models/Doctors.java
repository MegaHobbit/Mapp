package com.example.mapp.Models;

import com.example.mapp.Enums.DoctorStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "doctors")
public class Doctors extends Person {
    private String doctorRegNumber;
    private String doctorAccNumber;
    private DoctorStatus doctorStatus;
}
