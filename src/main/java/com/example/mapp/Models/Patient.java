package com.example.mapp.Models;
import com.example.mapp.Enums.VisitStatus;
import com.example.mapp.Enums.VisitType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Patient")

public class Patient extends Person {

    private LocalDateTime visitDate;
    private String visitNumber;
    private VisitStatus visitStatus;
    private VisitType visitType;
}
