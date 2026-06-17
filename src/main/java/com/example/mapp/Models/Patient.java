package com.example.mapp.Models;
import com.example.mapp.Enums.VisitStatus;
import com.example.mapp.Enums.VisitType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter


public class Patient extends Person {

    private LocalDateTime visitDate;
    private String visitNumber;
    private VisitStatus visitStatus;
    private VisitType visitType;


    @ManyToOne
    @JoinColumn(name = "service_point_id")
    private ServicePoint servicePoint;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctors doctors;

    @OneToMany(mappedBy = "patient")
    private List<Billing> billing = new ArrayList<>();
}
