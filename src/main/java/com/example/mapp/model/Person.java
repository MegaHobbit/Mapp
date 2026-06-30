package com.example.mapp.model;

import com.example.mapp.Enum.Gender;

import com.example.mapp.Enum.MaritalStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public class Person extends BaseEntity {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String phoneNumber;
    private String email;
    private String address;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private String preferredLanguage;
    private String occupation;
    private BigInteger nationalId;
    private BigInteger birthCertificateNumber;

}
