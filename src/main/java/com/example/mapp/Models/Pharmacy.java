package com.example.mapp.Models;

import com.example.mapp.Enums.PharmStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity


public class Pharmacy extends BaseEntity {

    private PharmStatus status;
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "service_point_id")
    private ServicePoint servicePoint;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctors doctor;

    @OneToMany(mappedBy = "pharmacy")
    private List<Billing> billing = new ArrayList<>();
}
