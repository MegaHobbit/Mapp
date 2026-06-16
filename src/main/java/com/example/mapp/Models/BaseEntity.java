package com.example.mapp.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name= "created_on")
    private LocalDateTime createdOn;

    @Column(name= "Modified_on")
    private LocalDateTime modifiedOn;

    @Column(name= "created_by")
    private String createdBy;
}
