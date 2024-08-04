package com.arc.arc_register_clothes.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "brand_table")
public class BrandEntity {

    @Id()
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "brand_inclusion_date_time")
    private LocalDateTime brandInclusionDateTime;

    @OneToMany(
            mappedBy = "brandId",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private List<VestmentEntity> vestmentEntities;
}
