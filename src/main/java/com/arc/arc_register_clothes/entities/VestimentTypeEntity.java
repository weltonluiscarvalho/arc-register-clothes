package com.arc.arc_register_clothes.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vestiment_type_table")
public class VestimentTypeEntity {

    @Id
    @Column(name = "vestiment_type_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vestiment_type_table_seq")
    @SequenceGenerator(name = "vestiment_type_table_seq", allocationSize = 1)
    private Long vestimentTypeId;

    @Column(name = "vestiment_type_name")
    private String vestimentTypeName;

    @OneToMany(
            mappedBy = "vestimentTypeId",
            cascade = CascadeType.ALL
    )
    @JsonManagedReference
    private List<VestimentEntity> vestimentEntities;

}
