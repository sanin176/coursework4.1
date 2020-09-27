package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBasket;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToOne(mappedBy = "basket")
    private Users user;

    @OneToMany(mappedBy="basket")
    private Set<Product> products;
}
