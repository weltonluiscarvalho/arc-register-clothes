package com.arc.arc_register_clothes.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cloth_table")
public class ClothEntity {

    @Id
    @Column(name = "cloth_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cloth_table_seq")
    @SequenceGenerator(name = "cloth_table_seq", allocationSize = 1)
    private Long clothId;

    @Column(name = "cloth_name")
    private String clothName;

    @Column(name = "cloth_description")
    private String clothDescription;

    @Column(name = "inclusion_date")
    private LocalDate clothInclusionDateTime;
}
