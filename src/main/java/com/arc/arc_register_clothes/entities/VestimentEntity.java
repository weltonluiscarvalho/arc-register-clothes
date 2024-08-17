package com.arc.arc_register_clothes.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vestiment_table")
public class VestimentEntity {

    @Id
    @Column(name = "vestiment_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vestiment_table_seq")
    @SequenceGenerator(name = "vestiment_table_seq", allocationSize = 1)
    private Long vestimentId;

    @Column(name = "color")
    private String vestimentColor;

    @Column(name = "aquisition_date")
    private LocalDate vestimentAquisitionDate;

    @Column(name = "in_use_vestiment")
    private Boolean vestimentInUseIndicator;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "brand_id")
    @JsonBackReference
    private BrandEntity brandId;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "vestiment_type_id")
    @JsonBackReference
    private VestimentTypeEntity vestimentTypeId;
}
