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
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Product_Category",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id") }
    )
    private Set<Categories> categories;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_basket", insertable = false, updatable = false)
    private Basket basket;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Product_Order",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "order_id") }
    )
    private Set<Orders> orders;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_type_product")
    private TypeProduct typeProduct;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_manufacture")
    private Manufacture manufacture;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_supplier")
    private Supplier supplier;
}
