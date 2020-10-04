package com.alex.coursework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class ProductManufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductManufacture;
    private double price;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_product", insertable = false, updatable = false)
    private Product id_product;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_manufacture", insertable = false, updatable = false)
    private Manufacture id_manufacture;

    @OneToMany(mappedBy="id_product_manufacture", fetch = FetchType.EAGER)
    private Set<SupplierProdManu> idSupplierProdManu;

    @OneToMany(mappedBy="id_product_manufacture", fetch = FetchType.EAGER)
    private Set<OrdersProdManu> idOrdersProdManu;

    @OneToMany(mappedBy="id_product_manufacture", fetch = FetchType.EAGER)
    private Set<RequestProdManu> idRequestProdManu;

}
