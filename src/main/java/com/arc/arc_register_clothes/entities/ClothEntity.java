package com.arc.arc_register_clothes.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cloth_entity")
public class ClothEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clothId;

    @Column(name = "cloth_name")
    private String clothName;

    @Column(name = "cloth_description")
    private String clothDecription;

    @Column(name = "cloth_inclusion_date_time")
    private LocalDateTime clothInclusionDateTime;
}
