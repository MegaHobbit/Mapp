package com.example.mapp.Models;

import com.example.mapp.Enums.Gender;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public class Person extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String surName;
    private LocalDateTime dateOfBirth;
    private Gender gender;
    private String contact;
    private String email;
    private String residence;

}
