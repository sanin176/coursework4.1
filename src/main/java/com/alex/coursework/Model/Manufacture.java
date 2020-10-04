package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Manufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idManufacture;
    private String name;
    private String country;
    private String city;
    private String address;
    private LocalDate createdAt;
    private LocalDate updatedAt;

//    @OneToOne(mappedBy = "manufacture")
//    private Product product;

    @OneToMany(mappedBy="id_manufacture", fetch = FetchType.EAGER)
    private Set<ProductManufacture> productManufactures;

    @OneToMany(mappedBy="id_manufacture", fetch = FetchType.EAGER)
    private Set<Orders> orders;
}
