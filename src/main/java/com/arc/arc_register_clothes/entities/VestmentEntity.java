package com.arc.arc_register_clothes.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vestiment_table")
public class VestmentEntity {

    @Id
    @Column(name = "vestment_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vestmentId;

    @Column(name = "vestment_color")
    private String vestmentColor;

    @Column(name = "vestment_aquisition_date")
    private LocalDate vestmentAquisitionDate;

    @Column(name = "vestment_in_use_indicator")
    private Boolean vestmentInUseIndicator;

}
