package com.example.mapp.model;

import com.example.mapp.Enum.LabStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Lab extends BaseEntity {


    private String laboratoryNumber;
    private String labName;
    private LabStatus status;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToMany(mappedBy = "lab", cascade = CascadeType.ALL)
    private List<LabTest> labTests = new ArrayList<>();

}