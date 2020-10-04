package com.alex.coursework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String productName;
    private String productImage;
    private int length;
    private int width;
    private int height;
    private int warrantyMonth;
    private ProductCategories productCategories;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_basket", insertable = false, updatable = false)
    private Basket basket;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_type_product")
    private TypeProduct typeProduct;

    @OneToMany(mappedBy="id_product", fetch = FetchType.EAGER)
    private Set<ProductManufacture> productManufactures;
}
