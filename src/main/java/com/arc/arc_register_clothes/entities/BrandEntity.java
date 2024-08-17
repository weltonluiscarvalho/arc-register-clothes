package com.arc.arc_register_clothes.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "brand_table")
public class BrandEntity {

    @Id()
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_table_seq")
    @SequenceGenerator(name = "brand_table_seq", allocationSize = 1)
    private Long brandId;

    @Column(name = "brand_name", length = 20)
    private String brandName;

    @Column(name = "inclusion_date")
    private LocalDate brandInclusionDateTime;

    @OneToMany(
            mappedBy = "brandId",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private List<VestimentEntity> vestmentEntities;
}
