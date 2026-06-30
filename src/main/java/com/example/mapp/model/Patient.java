package com.example.mapp.model;
import com.example.mapp.Enum.PatientStatus;
import com.example.mapp.Enum.BloodGroup;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "patient")
public class Patient extends Person {

    private String patientNumber;
    private LocalDate registrationDate;
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;
    private String insuranceProvider;
    private String insuranceNumber;
    private String emergencyContact;
    @Enumerated(EnumType.STRING)
    private PatientStatus patientStatus;



    @ManyToOne
    @JoinColumn(name = "service_point_id")
    private ServicePoint servicePoint;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToMany(mappedBy = "patient")
    private List<Billing> billing = new ArrayList<>();
}
