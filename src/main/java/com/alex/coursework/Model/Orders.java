package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    private LocalDate orderDate;
    private Time orderTime;
    private String statusOrder;
    private double orderCost;
    private String paymentMethod;
    private String obtainingMethod;

    @ManyToMany(mappedBy = "orders")
    private Set<Product> products;

    @OneToMany(mappedBy="order", fetch = FetchType.EAGER)
    private Set<PointIssue> pointIssue;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_delivery")
    private Delivery delivery;

}
