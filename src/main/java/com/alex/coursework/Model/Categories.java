package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;
    private String category;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;
}
