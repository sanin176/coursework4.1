package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class TypeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String typeProductName;
    private Boolean leather;
    private Boolean strep;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToOne(mappedBy = "typeProduct")
    private Product product;
}
