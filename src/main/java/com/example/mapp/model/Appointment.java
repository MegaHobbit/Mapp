package com.example.mapp.model;

import com.example.mapp.Enum.AppointmentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@Table(name = "appointment")
public class Appointment extends BaseEntity {

    private String appointmentNumber;
    private LocalDateTime appointmentDateTime;
    private AppointmentStatus appointmentStatus;
    private String reasonForAppointment;
    private LocalTime duration;
    private Text notes;
}
