package com.example.mapp.model;

import com.example.mapp.Enum.VisitStatus;
import com.example.mapp.Enum.VisitType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "visit")
public class Visit {

    private String visitNumber;
    private LocalDateTime visitDateTime;
    @Enumerated(EnumType.STRING)
    private VisitType visitType;
    @Enumerated(EnumType.STRING)
    private VisitStatus visitStatus;
    private String reasonForVisit;
}
