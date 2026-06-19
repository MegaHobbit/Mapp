package com.example.mapp.Models;

import com.example.mapp.Enums.DoctorStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "doctors")
public class Doctors extends Person {
    private String doctorRegNumber;
    private String doctorAccNumber;
    private DoctorStatus status;

    @OneToMany(mappedBy = "doctors", cascade = CascadeType.ALL)
    private List<Patient> patients = new ArrayList<>();
}
