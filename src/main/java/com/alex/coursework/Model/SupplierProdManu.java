package com.alex.coursework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class SupplierProdManu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSupplierProdManu;
    private double price;
    private int amount;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_product_manufacture", insertable = false, updatable = false)
    private ProductManufacture id_product_manufacture;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_supplier", insertable = false, updatable = false)
    private Supplier id_supplier;

}
