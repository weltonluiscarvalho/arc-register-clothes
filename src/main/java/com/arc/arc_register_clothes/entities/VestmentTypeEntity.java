package com.arc.arc_register_clothes.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vestment_table")
public class VestmentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vestmentTypeId;

    @Column(name = "vestment_type_name")
    private String vestmentTypeName;
}
