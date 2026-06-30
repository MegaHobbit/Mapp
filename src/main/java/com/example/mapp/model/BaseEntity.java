package com.example.mapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "created_on")
    private LocalDateTime createdOn;

    @Column(name= "created_by")
    private String createdBy;

    @Column(name= "Modified_on")
    private LocalDateTime modifiedOn;

    @Column(name= "modified_by")
    private String modifiedBy;
}
